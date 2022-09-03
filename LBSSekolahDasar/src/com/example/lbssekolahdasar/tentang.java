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

	public class tentang extends ActionBarActivity implements OnClickListener{
	    /** Called when the activity is first created. */
		@Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.tentang);
	      
	        ImageButton fb = (ImageButton)findViewById(R.id.fb);
			ImageButton twit = (ImageButton)findViewById(R.id.twit);

	fb.setOnClickListener(new ImageButton.OnClickListener() {
				public void onClick(View v){
					String myWeb="https://www.facebook.com/WillySianturi";
					Intent myIntent = new Intent(Intent.ACTION_VIEW,
							Uri.parse(myWeb));
					startActivity(myIntent);
					}
	});

	twit.setOnClickListener(new ImageButton.OnClickListener() {
		        public void onClick(View v){
			        String myWeb="https://twitter.com/williesianturie";
			        Intent myIntent = new Intent(Intent.ACTION_VIEW,
					        Uri.parse(myWeb));
			        startActivity(myIntent);
		        }
	 });
	
	
	}

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
				
		    		
		    	}
		    }
			
			
			
		