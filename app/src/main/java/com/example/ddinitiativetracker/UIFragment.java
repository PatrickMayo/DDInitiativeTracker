package com.example.ddinitiativetracker;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.ddinitiativetracker.databinding.FragmentMainBinding;
import com.example.ddinitiativetracker.databinding.ListItemCreatureCardBinding;
import java.util.ArrayList;
import java.util.List;

/*  Basic activity which hosts UIFragment

    Michael Marinaro & Patrick Mayo, May 2019
 */

public class UIFragment extends Fragment {

    private Manager manager;


    public static UIFragment newInstance() {
        return new UIFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        manager = new Manager(getActivity());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentMainBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //populate view from list of creatures
        binding.recyclerView.setAdapter(new CreatureAdapter(test())); //<------- CURRENTLY USING TEST CREATURES

        return binding.getRoot();
    }

    private class CreatureHolder extends RecyclerView.ViewHolder {
        private ListItemCreatureCardBinding mBinding;

        private CreatureHolder(ListItemCreatureCardBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
            mBinding.setViewModel(new ViewModel(manager));
        }

        public void bind(Creature creature) {
            mBinding.getViewModel().setCreature(creature);
            mBinding.executePendingBindings();
        }
    }

    private class CreatureAdapter extends RecyclerView.Adapter<CreatureHolder> {
        private List<Creature> mCreatures;

        public CreatureAdapter(List<Creature> creatures){
            mCreatures = creatures;
        }



        @Override
        public CreatureHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            ListItemCreatureCardBinding binding = DataBindingUtil.inflate(inflater, R.layout.list_item_creature_card, parent, false);
            return new CreatureHolder(binding);
        }

        @Override
        public void onBindViewHolder(CreatureHolder holder, int position) {
            Creature creature = mCreatures.get(position);
            holder.bind(creature);

        }

        @Override
        public int getItemCount() {
            return mCreatures.size();
        }
    }

    //TEST LIST: REMOVE!
    private List<Creature> test(){
        List<Creature> testCreatures = new ArrayList<>();

        testCreatures.add(new Monster("Goblin Infantry", 10, 1));
        testCreatures.add(new Monster("Goblin Boss", 15, 19));
        testCreatures.add(new Monster("Bugbear", 11, 8));
        testCreatures.add(new Monster("Red Dragon", 21, 19));
        testCreatures.add(new Monster("Kobold Infantry", 10, 2));
        testCreatures.add(new Monster("Kobold Boss", 13, 11));
        testCreatures.add(new Monster("Guard Drake", 14, 12));
        testCreatures.add(new Monster("Black Dragon", 1, 5));


        return testCreatures;
    }
}
