package com.ahmfarisi.kampuskita.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.ahmfarisi.kampuskita.R;

public class UbahActivity extends AppCompatActivity {
    private String yId, yNama, yKota, yAlamat;
    private EditText etNama, etKota, etAlamat;
    private Button btnUbah;
    private String nama, kota, alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubah);

        //tangkap kiriman dari sebelah
        Intent ambil = getIntent();
        yId = ambil.getStringExtra("xId");
        yNama = ambil.getStringExtra("xNama");
        yKota = ambil.getStringExtra("xKota");
        yAlamat = ambil.getStringExtra("xAlamat");

        //findview kan semua view/widget yang dipake
        etNama = findViewById(R.id.et_nama);
        etAlamat = findViewById(R.id.et_alamat);
        etKota = findViewById(R.id.et_kota);
        btnUbah = findViewById(R.id.btn_ubah);

        //set kiriman yang udah ditangkap tadi, ke view/widget yang udah di findview tadi
        etNama.setText(yNama);
        etKota.setText(yKota);
        etAlamat.setText(yAlamat);

    }
}