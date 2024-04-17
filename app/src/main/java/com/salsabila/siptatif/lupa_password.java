package com.salsabila.siptatif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class lupa_password extends AppCompatActivity {

    EditText emailEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_password);

        emailEditText = findViewById(R.id.edt_isiEmail);

        Button resetButton = findViewById(R.id.btn_reset_link);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString().trim();
                // Lakukan operasi reset password sesuai kebutuhan
                // Misalnya, kirim email dengan tautan reset password
                // Di sini bisa menambahkan kode logika tambahan sesuai kebutuhan aplikasi Anda
                Toast.makeText(lupa_password.this, "Tautan reset password telah dikirim ke " + email, Toast.LENGTH_SHORT).show();
            }
        });

        Button kembaliButton = findViewById(R.id.btn_kembaliLogin);
        kembaliButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ketika tombol "Kembali ke Login" diklik, buat intent untuk beralih ke halaman page2_lupa_password
                Intent intent = new Intent(lupa_password.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button moreButton = findViewById(R.id.btn_selengkapnya);
        moreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke aktivitas SelengkapnyaActivity saat tombol "Selengkapnya" diklik
                Intent intent = new Intent(lupa_password.this, activity_selengkapnya.class);
                startActivity(intent);
            }
        });
    }
}