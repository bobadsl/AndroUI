package andro.jf;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;


public class Simple extends Activity {
	public void onCreate(Bundle savedInstanceState) {

		setContentView(R.layout.simple);
		Toast.makeText(this, "Restauration !", Toast.LENGTH_SHORT).show();
		super.onCreate(savedInstanceState);
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Toast.makeText(this, "Sauvegarde !", Toast.LENGTH_SHORT).show();

	}
}
