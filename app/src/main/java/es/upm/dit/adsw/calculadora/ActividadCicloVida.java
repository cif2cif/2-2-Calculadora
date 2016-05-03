package es.upm.dit.adsw.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActividadCicloVida extends AppCompatActivity {
    public static final String TAG = ActividadCicloVida.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        setContentView(R.layout.activity_layout); // Actividad creada
        Button boton = (Button) findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActividadCicloVida.this, ActividadCicloVida2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart(); // Actividad va a pasar a ser visible
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume(); // Actividad en primer plano
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause(); // Actividad pausada
        Log.d(TAG, "onPause");
    }

    @Override
    protected void  onStop() {
        super.onStop(); // Actividad parada no visible
        Log.d(TAG, "onStop");
    }

    @Override
    protected  void onDestroy(){
        super.onDestroy(); // Actividad matada
        Log.d(TAG, "onDestroy");
    }
}

