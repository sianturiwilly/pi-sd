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

	public class swasta extends ActionBarActivity implements OnClickListener{
	    /** Called when the activity is first created. */
		@Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.swasta);
		
	        View al_anshar = findViewById (R.id.anshar);
	        al_anshar.setOnClickListener(this);
	        
	        View daret_tauhid = findViewById (R.id.ettauhid);
	        daret_tauhid.setOnClickListener(this);
	        
	        View darussalam = findViewById (R.id.darussalam);
	        darussalam.setOnClickListener(this);
	        
	        View fransiska = findViewById (R.id.fransiska);
	        fransiska.setOnClickListener(this);
	        
	        View harapan_mulia = findViewById (R.id.harapan);
	        harapan_mulia.setOnClickListener(this);
	        
	        View marsudirini = findViewById (R.id.marsud);
	        marsudirini.setOnClickListener(this);
	        
	        
		}
		
		
		public void onClick(View v){
	    	
	    	switch (v.getId()){
	    	
	    	case R.id.anshar:
	        	Intent next = new Intent(this, al_anshar.class);
	        	startActivity(next);
	        	break;
	        	
	    	case R.id.ettauhid:
	        	Intent next1 = new Intent(this, daret_tauhid.class);
	        	startActivity(next1);
	        	break;
	        	
	    	case R.id.darussalam:
	        	Intent next2 = new Intent(this, darussalam.class);
	        	startActivity(next2);
	        	break;
	        	
	    	case R.id.fransiska:
	        	Intent next3 = new Intent(this, fransiska.class);
	        	startActivity(next3);
	        	break;
	        	
	    	case R.id.harapan:
	        	Intent next4 = new Intent(this, harapan_mulia.class);
	        	startActivity(next4);
	        	break;
	        	
	    	case R.id.marsud:
	        	Intent next5 = new Intent(this, marsudirini.class);
	        	startActivity(next5);
	        	break;
	        	
	    		    	}
	    }
		
		
}
