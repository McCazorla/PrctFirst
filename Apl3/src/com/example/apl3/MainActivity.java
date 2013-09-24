package com.example.apl3;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	private EditText et1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		et1 = (EditText)findViewById(R.id.et1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void mostrar(View view){
		//Intent i = new Intent(this, Discador.class);
		//startActivity(i);
		String valor = et1.getText().toString();
		if (valor.length() == 0){
			Log.e("MACA1", "Ocorreu um erro. O EditText está vazio ou nulo.");
		} else{
			Toast.makeText(this, valor, Toast.LENGTH_LONG).show();
		}
	}

}
