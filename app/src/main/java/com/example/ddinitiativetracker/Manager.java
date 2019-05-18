package com.example.ddinitiativetracker;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
    Asset Manager Class
    Manages
    -Icons from assets/sample_icons
        //Should be used for alarm sound and info in the future

    Michael Marinaro & Patrick Mayo, May 2019
*/
public class Manager {
    private static final String TAG = "AssetManager";
    private static final String ICON_FOLDER = "sample_icons";

    private AssetManager mAssets;

    private List<Icon> mIcons = new ArrayList<>();

    public Manager(Context context) {
        mAssets = context.getAssets();

        //Load Assets
        loadIcons();
    }

    private void loadIcons() {
        String[] iconNames;
        try {
            iconNames = mAssets.list(ICON_FOLDER);
            Log.i(TAG, "Found " + iconNames.length + " icons.");
        } catch (IOException ioe) {
            Log.e(TAG, "Could not list assets", ioe);
            return;
        }

        for (String filename : iconNames) {
            String assetPath = ICON_FOLDER + "/" + filename;
            Icon icon = new Icon(assetPath);
            mIcons.add(icon);
        }
    }


    public List<Icon> getIcons() {
        return mIcons;
    }

}
