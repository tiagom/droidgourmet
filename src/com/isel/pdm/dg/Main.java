package com.isel.pdm.dg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.isel.pdm.dg.ui.ComponentStash;

public class Main extends Activity {
    /** Called when the activity is first created. */
	
	private ComponentStash stash;
	 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        stash = new ComponentStash( this );
        stash.getRbgroup1().setOnCheckedChangeListener( new OnCheckedChangeListener() {
			
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				Log.v( "TRACE", " Radio Button Changed\n");
			}
		});
        
        
    }
    
    @Override
    protected void onDestroy() {
    	// TODO Auto-generated method stub
    	super.onDestroy();
    }
    
    @Override
    protected void onNewIntent(Intent intent) {
    	// TODO Auto-generated method stub
    	super.onNewIntent(intent);
    }
    
    
}