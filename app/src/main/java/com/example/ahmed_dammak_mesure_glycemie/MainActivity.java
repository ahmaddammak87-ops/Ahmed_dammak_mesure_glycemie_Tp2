package com.example.ahmed_dammak_mesure_glycemie;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button BtnConsultez;
    private TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnConsultez = findViewById(R.id.BtnConsultez);
        msg = findViewById(R.id.msg);

        // BtnConsultez.setOnClickListener(new View.OnClickListener() {
        //@Override
        // public void onClick(View v) {
        //   msg.setText("Felicitation");
        //}
        // });
    }
        public void calculer (View view){
            Toast.makeText(this, "le boton cosulter a ete allumer", Toast.LENGTH_SHORT).show();
        }
    }


