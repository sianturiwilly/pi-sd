package com.example.lbssekolahdasar;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.content.Intent;

	public class al_anshar extends ActionBarActivity implements OnClickListener{
	    /** Called when the activity is first created. */
		
		
		public Intent i;
		
		@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.al_anshar);
	        final ImageButton lihatlokasi= (ImageButton) findViewById(R.id.alamatalanshar);
	        lihatlokasi.setOnClickListener(new OnClickListener() {
	        

	        	@Override
	    		public void onClick(View v) {
	    			// TODO Auto-generated method stub
	    			Intent localIntent = new Intent("android.intent.action.VIEW",
	    		        	Uri.parse("geo:0,0?q=-6.2668476,106.974585"));
	    		        	startActivity(localIntent);
	    		        }
	    		        
	    		});
	            i=null;
	            
	    	}
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
		}
		
				
			}
