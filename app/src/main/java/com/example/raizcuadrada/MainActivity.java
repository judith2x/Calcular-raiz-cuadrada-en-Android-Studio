package com.example.raizcuadrada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button botoncalcular, botonlimpiar;
    TextView resultadoraiz;
    EditText valoringresado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valoringresado=(EditText)findViewById(R.id.valoringresado);
        resultadoraiz=(TextView)findViewById(R.id.resultadoraiz);
        botoncalcular=(Button)findViewById(R.id.botoncalcular);
        botoncalcular.setOnClickListener(this);
        botonlimpiar=(Button)findViewById(R.id.botonlimpiar);
        botonlimpiar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.botoncalcular:
                int valor=Integer.valueOf(valoringresado.getText().toString());
                 if (valor>=0) {
                    double resultado=Math.sqrt(valor);
                    resultadoraiz.setText("EL RESULTADO DE LA RAÍZ CUADRADA ES: "+resultado);
                }else if(valor<0) {
                    Toast.makeText(this, "Solo se admiten valores positivos", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, "Solo se admiten valores numéricos", Toast.LENGTH_LONG).show();
                }
            break;
            case R.id.botonlimpiar:
                resultadoraiz.setText("");
                valoringresado.setText("");
             break;
        }
    }
}
