package com.example.apllogin;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LogOk extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_log_ok);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.log_ok, menu);
		return true;
	}

}
