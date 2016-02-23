package andro.jf;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Activity2 extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout gabarit = new LinearLayout(this);
        gabarit.setOrientation(LinearLayout.VERTICAL);
        gabarit.setGravity(Gravity.CENTER);
        
        // Label
        TextView texte = new TextView(this);
        texte.setText("Programming creation of interface !");
        gabarit.addView(texte);
        
        // Zone de texte
        EditText edit = new EditText(this);
        edit.setText("Edit me");
        gabarit.addView(edit);
        
        // Image
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.ensi);
        gabarit.addView(image);

        setContentView(gabarit);
    }
}
