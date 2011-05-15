package com.isel.pdm.dg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.isel.pdm.dg.ui.ComponentStash;

public class Main extends Activity {
    /** Called when the activity is first created. */
	
	private ComponentStash stash;
	 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        stash = new ComponentStash( this );
        
        stash.getButAvisos().setOnClickListener( new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
        
//        stash.getRbgroup1().setOnCheckedChangeListener( new OnCheckedChangeListener() {
//			
//			public void onCheckedChanged(RadioGroup group, int checkedId) {
//				// TODO Auto-generated method stub
//				Log.v( "TRACE", " Radio Button Changed\n");
//			}
//		});
        
        
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