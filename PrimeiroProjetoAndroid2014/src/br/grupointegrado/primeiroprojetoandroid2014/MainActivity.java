package br.grupointegrado.primeiroprojetoandroid2014;

import android.os.Bundle;
import android.os.Vibrator;
import android.app.Activity;
import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private TextView lbNumero1;
	private TextView lbNumero2;
	private EditText inptNumero1;
	private EditText inptNumero2;
	
	private Button btn;
	private Vibrator vibrator;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        lbNumero1 = (TextView) findViewById(R.id.lbNumero1);
        lbNumero2 = (TextView) findViewById(R.id.lbNumero2);
        
        inptNumero1 = (EditText) findViewById(R.id.inptNumero1);
        inptNumero2 = (EditText) findViewById(R.id.inptNumero2);
        
        btn = (Button) findViewById(R.id.btnVai);
        
        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        
        
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				vibrator.vibrate(1000);
			}
		});
        
    }
    
}
