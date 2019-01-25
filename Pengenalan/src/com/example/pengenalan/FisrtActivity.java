package com.example.pengenalan;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.*;
import android.os.Build;

public class FisrtActivity extends Activity {
	
	private EditText email, password;
	private Button btnlogin;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fisrt);
		email 	 	= 	(EditText) findViewById(R.id.email);
		password 	= 	(EditText) findViewById(R.id.password);
		btnlogin =  (Button) findViewById(R.id.login);
		
		btnlogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String emailString    	=   email.getText().toString();
				String passwordString 	= 	password.getText().toString();
				
				if(emailString.equals("adimaryadiinten@gmail.com") && passwordString.equals("1adimaryadi1")) {
					Toast.makeText(getApplicationContext(),"Login sukses", Toast.LENGTH_SHORT).show();
					Intent intent = new Intent(FisrtActivity.this, Dashboard.class);
					FisrtActivity.this.startActivity(intent);
					finish();
				} else {
					AlertDialog.Builder builder = new AlertDialog.Builder(FisrtActivity.this);
					builder.setMessage("Email dan Password salah").setNegativeButton("Coba Lagi",null).create().show();
				}
				
			}
		});
		
	}
	
}
