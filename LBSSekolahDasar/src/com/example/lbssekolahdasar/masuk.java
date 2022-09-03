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

	public class masuk extends ActionBarActivity implements OnClickListener{
	    /** Called when the activity is first created. */
		@Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.masuk);
	        
	        View negeribtn = findViewById (R.id.negeri);
	        negeribtn.setOnClickListener(this);
	        
	        View swastabtn = findViewById (R.id.swasta);
	        swastabtn.setOnClickListener(this);
		
		}
		
		
		public void onClick(View v){
	    	
	    	switch (v.getId()){
	    	
	    	case R.id.negeri:
	        	Intent next = new Intent(this, negeri.class);
	        	startActivity(next);
	        	break;
	        	
	    	case R.id.swasta:
	        	Intent next1= new Intent(this, swasta.class);
	        	startActivity(next1);
	        	break;
	                

	    	}
	    }
		
		
}