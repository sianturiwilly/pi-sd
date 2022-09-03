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
import android.widget.ImageButton;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;

	public class MainActivity extends ActionBarActivity implements OnClickListener{
	    /** Called when the activity is first created. */
		@Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
		
	        View masukbtn = findViewById (R.id.masuk);
	        masukbtn.setOnClickListener(this);
	        
	        View tentangbtn = findViewById (R.id.tentang);
	        tentangbtn.setOnClickListener(this);
	        
	        View infobtn = findViewById (R.id.info);
	        infobtn.setOnClickListener(this);
	        
	        View Keluar = findViewById (R.id.keluar);
	        Keluar.setOnClickListener(this);
	        
	       	        
	        
		}
		public void onBackPressed() {
			Keluar();
		}
		
		private void Keluar() {

		    AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
		    alertDialog.setIcon(R.drawable.keluar);

		    alertDialog.setPositiveButton("Ya", new DialogInterface.OnClickListener() {

		        public void onClick(DialogInterface dialog, int which) {
		            System.exit(0);
		        }
		    });

		    alertDialog.setNegativeButton("Tidak", null);
		    alertDialog.setMessage("Apakah Anda Ingin Keluar Dari Aplikasi Ini?");
		    alertDialog.show();
		}
		
		
		public void onClick(View v){
	    	
	    	switch (v.getId()){
	    	
	    	case R.id.masuk:
	        	Intent next = new Intent(this, masuk.class);
	        	startActivity(next);
	        	break;
	                
	    	case R.id.tentang:
	        	Intent next1 = new Intent(this, tentang.class);
	        	startActivity(next1);
	        	break;
	        	
	    	case R.id.info:
	        	Intent next2 = new Intent(this, info.class);
	        	startActivity(next2);
	        	break;
	        	
	    	case R.id.keluar:
	 			Keluar();
	 			break;
	    	
	        	
	    	
	        	
	        	
	    	}
	    }
		
		
}