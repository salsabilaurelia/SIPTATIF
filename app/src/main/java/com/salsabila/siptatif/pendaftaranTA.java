package com.salsabila.siptatif;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class pendaftaranTA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendaftaran_ta);

        // Inisialisasi elemen UI
        ImageView menuImageView = findViewById(R.id.menu);
        TextView judulAppTextView = findViewById(R.id.judulApp);
        ImageView profilImageView = findViewById(R.id.profil);
        Spinner spinner = findViewById(R.id.btn_spinner);
        Button dataPendaftaranButton = findViewById(R.id.datapendaftaran);
        TextView pendaftaranMhsTextView = findViewById(R.id.pendaftaranMhs);
        TextView b1k1TextView = findViewById(R.id.b1k1);
        TextView b1k2TextView = findViewById(R.id.b1k2);
        TextView b1k3TextView = findViewById(R.id.b1k3);
        TextView b2k1TextView = findViewById(R.id.b2k1);
        TextView b2k2TextView = findViewById(R.id.b2k2);
        TextView b2k3TextView = findViewById(R.id.b2k3);
        TextView b3k1TextView = findViewById(R.id.b3k1);
        TextView b3k2TextView = findViewById(R.id.b3k2);
        TextView b3k3TextView = findViewById(R.id.b3k3);
        TextView b4k1TextView = findViewById(R.id.b4k1);
        TextView b4k2TextView = findViewById(R.id.b4k2);
        TextView b4k3TextView = findViewById(R.id.b4k3);

        // Set listener jika tombol "Data Pendaftaran" diklik
        dataPendaftaranButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Buat intent untuk berpindah ke halaman DataPendaftaranTA
                Intent intent = new Intent(pendaftaranTA.this, DataPendaftaranTA.class);
                startActivity(intent);
            }
        });
        // Set listener jika tombol "Menu" diklik
        menuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        // Set listener jika profil diklik
        profilImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        // Set listener untuk spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }
}
