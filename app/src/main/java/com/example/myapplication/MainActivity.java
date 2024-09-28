package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    // Assurez-vous que ces lignes sont dans votre activité (ex : MainActivity.java)
    EditText Name, Email, Phone, Address;
    Spinner spinnerCity;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Liaison des vues avec leurs ID respectifs
        Name = findViewById(R.id.name);
        Email = findViewById(R.id.email);
        Phone = findViewById(R.id.phone);
        Address = findViewById(R.id.address);
        spinnerCity = findViewById(R.id.spinner_city);
        btnSend = findViewById(R.id.btn_send);

        // Ajoutez des vérifications et des événements comme un clic sur le bouton
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Action lors du clic sur le bouton
                String name = Name.getText().toString();
                String email = Email.getText().toString();
                String phone = Phone.getText().toString();
                String address = Address.getText().toString();
                String city = spinnerCity.getSelectedItem().toString();

                Intent intent = new Intent(MainActivity.this, Result.class);

                // Ajouter les données à l'Intent
                intent.putExtra("name", name);
                intent.putExtra("email", email);
                intent.putExtra("phone", phone);
                intent.putExtra("address", address);
                intent.putExtra("city", city);

                // Démarrer la nouvelle activité
                startActivity(intent);

            }
        });

    }
}