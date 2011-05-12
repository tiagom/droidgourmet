package com.isel.pdm.dg.ui;

import android.app.Activity;
import android.widget.RadioGroup;

import com.isel.pdm.dg.R;
 
public class ComponentStash 
{
	
	private static Activity activity;
	private static RadioGroup rbgroup1;
	
	public ComponentStash( Activity activity ) 
	{
		 ComponentStash.activity = activity;
		 ComponentStash.rbgroup1 = (RadioGroup) ComponentStash.activity.findViewById( R.id.radioGroup1 ); 
	}

	public static Activity getActivity() 
	{
		return activity;
	}
	
	public RadioGroup getRbgroup1() 
	{
		return rbgroup1;
	}
}
