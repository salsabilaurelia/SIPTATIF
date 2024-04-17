package com.salsabila.siptatif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register_activity extends AppCompatActivity {

    EditText namaEditText, nimEditText, alamatEmailEditText, buatPwEditText, konfirmPwEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        namaEditText = findViewById(R.id.edt_isiNama);
        nimEditText = findViewById(R.id.edt_isiNIM);
        alamatEmailEditText = findViewById(R.id.edt_alamatEmail);
        buatPwEditText = findViewById(R.id.edt_buatPw);
        konfirmPwEditText = findViewById(R.id.edt_konfirmPw);

        Button registerButton = findViewById(R.id.btn_register);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mengambil nilai dari EditText
                String nama = namaEditText.getText().toString().trim();
                String nim = nimEditText.getText().toString().trim();
                String alamatEmail = alamatEmailEditText.getText().toString().trim();
                String password = buatPwEditText.getText().toString().trim();
                String konfirmPassword = konfirmPwEditText.getText().toString().trim();

                // Lakukan validasi input
                if (nama.isEmpty() || nim.isEmpty() || alamatEmail.isEmpty() || password.isEmpty() || konfirmPassword.isEmpty()) {
                    Toast.makeText(register_activity.this, "Harap lengkapi semua kolom", Toast.LENGTH_SHORT).show();
                } else if (!password.equals(konfirmPassword)) {
                    Toast.makeText(register_activity.this, "Konfirmasi password tidak cocok", Toast.LENGTH_SHORT).show();
                } else {
                    // Lakukan operasi registrasi sesuai kebutuhan
                    // Misalnya, simpan informasi pengguna ke basis data atau lakukan pendaftaran
                    // Di sini bisa menambahkan kode logika tambahan sesuai kebutuhan aplikasi Anda
                    Toast.makeText(register_activity.this, "Registrasi berhasil", Toast.LENGTH_SHORT).show();

                    // Setelah registrasi berhasil, arahkan ke MainActivity
                    Intent intent = new Intent(register_activity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        Button moreButton = findViewById(R.id.btn_selengkapnya);
        moreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigasi ke aktivitas SelengkapnyaActivity saat tombol "Selengkapnya" diklik
                Intent intent = new Intent(register_activity.this, activity_selengkapnya.class);
                startActivity(intent);
            }
        });
    }
}
