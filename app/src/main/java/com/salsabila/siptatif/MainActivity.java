package com.salsabila.siptatif;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText emailEditText, passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText = findViewById(R.id.edt_isiEmail);
        passwordEditText = findViewById(R.id.edt_isiPw);
        TextView lupaPasswordTextView = findViewById(R.id.btn_lupaPw);
        TextView daftarDisiniTextView = findViewById(R.id.daftarSini);

        Button loginButton = findViewById(R.id.btn_login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                //memeriksa apakah email dan password sesuai dengan yang diinginkan
                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Email atau password tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else {
                    // Logika autentikasi di sini
                    // Misalnya, jika autentikasi berhasil, Anda dapat melakukan navigasi ke layar berikutnya
                    // Jika gagal, Anda bisa menampilkan pesan kesalahan
                    // Di sini kita hanya menampilkan pesan sederhana untuk tujuan demonstrasi
                    Toast.makeText(MainActivity.this, "Autentikasi berhasil", Toast.LENGTH_SHORT).show();

                    // Setelah autentikasi berhasil, navigasi ke halaman dashboard_mhs
                    Intent intent = new Intent(MainActivity.this, dashboard_mhs.class);
                    startActivity(intent);
                }
            }
        });

        // Menambahkan event listener untuk TextView
        lupaPasswordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk berpindah ke halaman lupa_password
                Intent intent = new Intent(MainActivity.this, lupa_password.class);
                startActivity(intent);
            }
        });

        Button moreButton = findViewById(R.id.btn_selengkapnya);
        moreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke aktivitas SelengkapnyaActivity saat tombol "Selengkapnya" diklik
                Intent intent = new Intent(MainActivity.this, activity_selengkapnya.class);
                startActivity(intent);
            }
        });

        daftarDisiniTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Membuat intent untuk memulai RegisterActivity
                Intent intent = new Intent(MainActivity.this, register_activity.class);
                // Memulai aktivitas RegisterActivity
                startActivity(intent);
            }
        });
    }
}
