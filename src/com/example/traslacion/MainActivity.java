package com.example.traslacion;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView texto = (TextView) findViewById(R.id.texto);
		Animation animacion = AnimationUtils.loadAnimation(this, R.anim.traslacion_derecha);
		animacion.setFillAfter(true);
		texto.startAnimation(animacion);
		texto.append("\n texto añadido");
	}

	

}
