package br.grupointegrado.primeiroprojetoandroid2014;

import android.os.Bundle;
import android.app.Activity;
import android.text.style.ClickableSpan;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private TextView tvLabel;
	private EditText inptNumero;
	private Button btn;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tvLabel = (TextView) findViewById(R.id.tvLabel);
        inptNumero = (EditText) findViewById(R.id.inptNumero);
        btn = (Button) findViewById(R.id.btnVai);

        //Maneira 
        //btn.setOnClickListener(new ClickDoBotao());
        
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(v.getContext(), inptNumero.getText(), Toast.LENGTH_LONG).show();
			}
		});
        
    }
    
}
