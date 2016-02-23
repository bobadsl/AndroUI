package andro.jf;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends Activity {

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Toast.makeText(this, "SAUVEGARDE", Toast.LENGTH_LONG).show();
	}

	public void onCreate(Bundle savedInstanceState) {

		setContentView(R.layout.acceuil);
		super.onCreate(savedInstanceState);
		TextView texte = (TextView)findViewById(R.id.le_texte);
		texte.setText("Here we go !");

		Button b = (Button)findViewById(R.id.Button01);
		b.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(v.getContext(), "Stop !", Toast.LENGTH_LONG).show();
			}
		});

		// Changing layout
		LinearLayout l = (LinearLayout)findViewById(R.id.accueilid);
		l.setBackgroundColor(Color.GRAY);  
	}
}