package com.example.lbssekolahdasar;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.view.View.OnClickListener;
import android.content.Intent;

	public class negeri extends ActionBarActivity implements OnClickListener{
	    /** Called when the activity is first created. */
		@Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.negeri);
	        
	        View jaka_mulia2 = findViewById (R.id.jaka_mulia2);
	        jaka_mulia2.setOnClickListener(this);
	        
	        View jaka_setia5 = findViewById (R.id.jaka_setia5);
	        jaka_setia5.setOnClickListener(this);
	        
	        View jati_asih10 = findViewById (R.id.jati_asih10);
	        jati_asih10.setOnClickListener(this);
	        
	        View jaka_sampurna2 = findViewById (R.id.jakasampurna2);
	        jaka_sampurna2.setOnClickListener(this);
	        
	        View jati_rasa3 = findViewById (R.id.jati_rasa3);
	        jati_rasa3.setOnClickListener(this);
	        
	        View kayuringin_jaya3 = findViewById (R.id.kayuringin_jaya3);
	        kayuringin_jaya3.setOnClickListener(this);
	        
	        View marga_jaya4 = findViewById (R.id.marga_jaya4);
	        marga_jaya4.setOnClickListener(this);
	        
	        View pekayon_jaya6 = findViewById (R.id.pekayon_jaya6);
	        pekayon_jaya6.setOnClickListener(this);
	        
		
		}
		
		
		public void onClick(View v){
	    	
	    	switch (v.getId()){
	    	
	    	case R.id.jaka_mulia2:
	        	Intent next = new Intent(this, jaka_mulia2.class);
	        	startActivity(next);
	        	break;
	        	
	    	case R.id.jaka_setia5:
	        	Intent next1 = new Intent(this, jaka_setia5.class);
	        	startActivity(next1);
	        	break;
	        	
	    	case R.id.jati_asih10:
	        	Intent next2 = new Intent(this, jati_asih10.class);
	        	startActivity(next2);
	        	break;
	        	
	    	case R.id.jakasampurna2:
	        	Intent next3 = new Intent(this, jaka_sampurna2.class);
	        	startActivity(next3);
	        	break;
	        	
	    	case R.id.jati_rasa3:
	        	Intent next4 = new Intent(this, jati_rasa3.class);
	        	startActivity(next4);
	        	break;
	        	
	    	case R.id.kayuringin_jaya3:
	        	Intent next5 = new Intent(this, kayuringin_jaya3.class);
	        	startActivity(next5);
	        	break;
	        	
	    	case R.id.marga_jaya4:
	        	Intent next6 = new Intent(this, marga_jaya4.class);
	        	startActivity(next6);
	        	break;
	        	
	    	case R.id.pekayon_jaya6:
	        	Intent next7 = new Intent(this, pekayon_jaya6.class);
	        	startActivity(next7);
	        	break;
	        	    	
	    		    	}
	    }
		
		
}