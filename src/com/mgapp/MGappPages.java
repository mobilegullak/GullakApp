
package com.mgapp;
import android.os.Bundle;

import com.phonegap.DroidGap;

public class MGappPages extends DroidGap {

    /**
     * Constructor
     */
    public MGappPages() {
        super();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	
    	super.setIntegerProperty("splashscreen", R.drawable.mglogo);
        
    	// Clear our cache (this is used mainly during development - comment out for production)
    	this.clearCache();
    	// Load our app
    	this.loadUrl("file:///android_asset/www/index.html");
    }    
}
