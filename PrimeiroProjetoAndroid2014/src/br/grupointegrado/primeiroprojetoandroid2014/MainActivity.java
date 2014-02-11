package br.grupointegrado.primeiroprojetoandroid2014;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private TextView tv;
	private Button btn;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tv = (TextView) findViewById(R.id.inptNumero);
        btn = (Button) findViewById(R.id.btnVai); 
        
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast
				.makeText(v.getContext(), tv.getText(), Toast.LENGTH_LONG)
				.show();
			}
		});
        
    }
}
