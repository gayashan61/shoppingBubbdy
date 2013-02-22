package com.example.shoppingbuddy;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class WellCome extends Activity {
// frirst chanege of code
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_well_come);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_well_come, menu);
		return true;
	}

}
