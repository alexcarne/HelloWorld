package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
/**
 * @author Alex Carnero Tapia
 * @version 1.0
 * Aplicación que muestra el tipico ejemplo de hola mundo
 * <ol>
 *     <li>Se ha visto se crean los recursos en XML</li>
 *     <li>Se ha instancia en Java un Objeto TextView</li>
 *     <li>Se ha personalizada la imagen de la aplicación</li>
 * </ol>e
 * */
public class MainActivity extends AppCompatActivity {
    private TextView tvMessageStart;
    private TextView tvMessageEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMessageStart=findViewById(R.id.tvMessageStart);
        tvMessageEnd=findViewById(R.id.tvMessageEnd);
        tvMessageStart.setTextColor(getColor(R.color.white));
        tvMessageEnd.setText(R.string.txtMessageOptimist);
    }
}