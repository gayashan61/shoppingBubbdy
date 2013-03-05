package com.example.shoppingbuddy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle sb) {
		// TODO Auto-generated method stub
		super.onCreate(sb);
		setContentView(R.layout.splash);
		
		Thread timer  = new Thread(){
			public void run() {
				try {
					sleep(1000);
				} catch (InterruptedException e) {
				 e.printStackTrace();
				}finally{
				//	Intent myIntent = new Intent(Splash.this, HomeActivity.class);
					//String xx  = "loll";
					//myIntent.putExtra("key",xx);
				//	Splash.this.startActivity(myIntent);
					
				/*	String xx  = "loll";
					Intent i = new Intent(getBaseContext(), Homepage.class);                      
					i.putExtra("PersonID", xx);
					startActivity(i);*/
					
				}
			}
		};
		timer.start();
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
	
}
			
			
		
	

	

