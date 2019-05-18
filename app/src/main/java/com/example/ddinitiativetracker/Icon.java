package com.example.ddinitiativetracker;
/*  Icon Asset Class

    Michael Marinaro & Patrick Mayo, May 2019
*/
public class Icon {
    private String mAssetPath;
    private String mName;

    public Icon(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length-1];
        mName = filename;
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }
}
