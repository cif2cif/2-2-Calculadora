package es.upm.dit.adsw.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static String TAG = MainActivity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editTextS1 = (EditText) findViewById(R.id.operando1);
        final EditText editTextS2 = (EditText) findViewById(R.id.operando2);
        final TextView resultado = (TextView) findViewById(R.id.resultado);
        Button botonSumar = (Button) findViewById(R.id.botonSumar);
        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Float num1 = Float.valueOf(editTextS1.getText().toString());
                    Float num2 = Float.valueOf(editTextS2.getText().toString());
                    Float r = num1 + num2;
                    resultado.setText("" + r);
                    resultado.setVisibility(View.VISIBLE);
                }catch(Exception e) {
                    Log.e(TAG, "Error " + e);
                    Toast.makeText(getApplication(), R.string.error_sumar, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
