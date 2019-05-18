package com.example.ddinitiativetracker;

import android.support.v4.app.Fragment;

/*  Basic activity which hosts UIFragment

    Michael Marinaro & Patrick Mayo, May 2019
 */

public class UIActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return UIFragment.newInstance();
    }
}
