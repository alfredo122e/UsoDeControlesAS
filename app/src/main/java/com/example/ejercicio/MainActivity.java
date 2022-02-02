 package com.example.ejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText tNombre=(EditText)this.findViewById(R.id.etNombre);
        Button bDatos=(Button)this.findViewById(R.id.btEnviarDatos);
        TextView Res=(TextView)this.findViewById(R.id.textView);

        bDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nom=tNombre.getText().toString();

                Res.setText("¡ Bienvenido "+nom+" !");
            }
        });
    }
}