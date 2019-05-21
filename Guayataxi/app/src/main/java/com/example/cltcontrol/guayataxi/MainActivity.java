package com.example.cltcontrol.guayataxi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn_enviarDatos = findViewById(R.id.enviarDatos);

        EditText et_nombres = findViewById(R.id.nombres);
        EditText et_matricula = findViewById(R.id.matricula);
        EditText et_placa = findViewById(R.id.placa);
        EditText et_edad = findViewById(R.id.edad);

        Button rb_norte = findViewById(R.id.norte);
        Button rb_centro = findViewById(R.id.centro);
        Button rb_sur = findViewById(R.id.sur);
        Button rb_duran = findViewById(R.id.duran);
        Button rb_sanmbo = findViewById(R.id.samborondon);

        ArrayList sectores = new ArrayList<Button>();
        sectores.add(rb_norte);
        sectores.add(rb_centro);
        sectores.add(rb_sur);
        sectores.add(rb_duran);
        sectores.add(rb_sanmbo);

        btn_enviarDatos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                boolean valor = validarDatosTaxista();
            }

        });
    }

    // function declaration
    private boolean validarDatosTaxista(EditText nombre, EditText matricula, EditText placa,
                                        EditText edad, ArrayList<Button> sectores) {

        boolean comprobacion = false;


        Toast.makeText(MainActivity.this,
                         "function called Successfully",
                               Toast.LENGTH_SHORT ).show();


        return true;

    }

}
