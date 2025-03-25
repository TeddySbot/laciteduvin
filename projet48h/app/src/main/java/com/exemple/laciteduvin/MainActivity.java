package com.example.laciteduvin;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Modifier le texte de TextView dans le layout
        TextView textView = findViewById(R.id.textView);
        textView.setText("Bienvenue sur l'application La Cité du Vin");
    }
}
