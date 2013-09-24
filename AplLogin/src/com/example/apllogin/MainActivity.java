package com.example.apllogin;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private EditText etPass, etNome;
	private TextView tvTentos;
	private int tentos = 3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		etNome = (EditText) findViewById(R.id.etNome);
		etPass = (EditText) findViewById(R.id.etPass);
		tvTentos = (TextView) findViewById(R.id.tvtentos);
		tvTentos.setText("Tens " + tentos + " itentos");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void login(View view) {
		String nome = etNome.getText().toString();
		String pass = etPass.getText().toString();
		if (tentos > 0) {
			if ((nome.compareTo("Oramix") == 0)
					&& (pass.compareTo("123oramix") == 0)) {
				Intent i = new Intent(this, LogOk.class);
				startActivity(i);
			} else {
				Toast.makeText(this, "Login Incorrecto", Toast.LENGTH_SHORT)
						.show();
				tentos -= 1;
				tvTentos.setText("Tens " + tentos + " tentativas");
				this.limpar(view);
				if (tentos == 0) {
					Intent i = new Intent(this, LogMau.class);
					startActivity(i);
				}
			}
		} else {
			Intent i = new Intent(this, LogMau.class);
			startActivity(i);
		}
	}

	public void limpar(View view) {
		etNome.setText("");
		etPass.setText("");
	}

}
