package br.grupointegrado.primeiroprojetoandroid2014;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ClickDoBotao implements View.OnClickListener {
	
	@Override
	public void onClick(View v) {
		EditText inptNumero = (EditText) v.findViewById(R.id.inptNumero); 
		Toast.makeText(v.getContext(), inptNumero.getText(), Toast.LENGTH_LONG).show();
	}

}
