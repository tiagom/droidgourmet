package com.isel.pdm.dg.ui;

import android.app.Activity;
import android.widget.Button;

import com.isel.pdm.dg.R;
 
public class ComponentStash 
{
	
	private Activity activity;
	private static Button butIngredientes;
	private static Button butReceitas;
	private static Button butCompras;
	private static Button butDispensa;
	private static Button butAvisos;
	
	public ComponentStash( Activity activity ) 
	{
		 this.activity = activity;
//		 ComponentStash.rbgroup1 = (RadioGroup) ComponentStash.activity.findViewById( R.id.radioGroup1 );
		 this.butAvisos = (Button) this.activity.findViewById( R.layout.avisos );
	}

	public Activity getActivity() 
	{
		return ComponentStash.this.activity;
	}

	public static Button getButIngredientes() {
		return butIngredientes;
	}

	public static Button getButReceitas() {
		return butReceitas;
	}

	public static Button getButCompras() {
		return butCompras;
	}

	public static Button getButDispensa() {
		return butDispensa;
	}

	public static Button getButAvisos() {
		return butAvisos;
	}
}
