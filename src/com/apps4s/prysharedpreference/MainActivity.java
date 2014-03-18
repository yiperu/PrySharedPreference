package com.apps4s.prysharedpreference;

import android.R.bool;
import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.Menu;

public class MainActivity extends Activity {
	
	public static final String NOMBRE_ARCHIVO_PREF_NAME = "PrefNameFile";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Llamamos a la funcion 
		//createSharedPreference();
		// Llamamos a la funcion que lee la variable
		readSharedPreference();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	// Crearemos la funcion que va a crear y almacenar una variable
	private void createSharedPreference(){
		SharedPreferences settings = getSharedPreferences(NOMBRE_ARCHIVO_PREF_NAME, 0);
		SharedPreferences.Editor editor = settings.edit();
		editor.putBoolean("variableEjemplo", true);
		
		// Impoertante
		editor.commit();
	}
	
	// Creamos la funcion que lee el valor almacenado
	private void readSharedPreference(){
		SharedPreferences settings = getSharedPreferences(NOMBRE_ARCHIVO_PREF_NAME, 0);
		boolean miValor = settings.getBoolean("variableEjemplo", false);
		if(miValor){
			System.out.println("Encontrado");
		}
	}
	
	
}
