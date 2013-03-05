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
					
					String xx  = "loll";
					Intent i = new Intent(getBaseContext(), Homepage.class);                      
					i.putExtra("PersonID", xx);
					startActivity(i);
					// hey r u der? hmmm
					// after u change some thing u can commit and push it to repository
					// like this ..hmmmmmmmmmmmmmmmm
					// den una wage msj ekak awa kiyanne hariyata una kiyala
					// neththam ara kalin wage erre ekak denne
					//ok? clear? hmmmmm.. 
					//kehel gahak kadan watuna :O mokak? nikanma? :O
					//owww..malliga kamare paththen loku saddayak ahuna.janelen balanakota kehel gahak kadan watila :O
					
					// ok so now you can start MAD project
					//now show me how to commit changesA? :O
			
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
			
			
		
	

	

