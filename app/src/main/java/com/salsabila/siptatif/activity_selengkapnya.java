package com.salsabila.siptatif;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_selengkapnya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selengkapnya);

        TextView ketNamaTextView = findViewById(R.id.ketNama);
        TextView kepanjanganTextView = findViewById(R.id.kepanjangan);
        TextView keteranganAppTextView = findViewById(R.id.keteranganApp);
        Button kembaliButton = findViewById(R.id.btnKembali);

        // Mengatur teks
        ketNamaTextView.setText(getString(R.string.judul));
        kepanjanganTextView.setText(getString(R.string.kepanjanganJudul));
        keteranganAppTextView.setText(getString(R.string.keteranganApp));

        // Menambahkan event listener pada tombol kembali
        kembaliButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tindakan yang akan diambil saat tombol kembali diklik
                // Di sini kita hanya menampilkan pesan toast
                Toast.makeText(activity_selengkapnya.this, "Anda menekan tombol Kembali", Toast.LENGTH_SHORT).show();
                // Kembali ke aktivitas sebelumnya
                finish();
            }
        });
    }
}
