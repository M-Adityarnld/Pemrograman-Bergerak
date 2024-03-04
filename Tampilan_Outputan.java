package com.example.project_perdana;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Tampilan_Outputan extends AppCompatActivity {
    EditText editTextPanjang, editTextLebar, editTextHasilLuas, editTextHasilKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_outputan);

        editTextPanjang = findViewById(R.id.Panjang);
        editTextLebar = findViewById(R.id.Lebar);
        editTextHasilLuas = findViewById(R.id.HasilLuas);
        editTextHasilKeliling = findViewById(R.id.Hasilkeliling);

        // Mengambil data dari intent
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            double panjang = extras.getDouble("panjang");
            double lebar = extras.getDouble("lebar");
            double luas = extras.getDouble("luas");
            double keliling = extras.getDouble("keliling");

            // Menampilkan data di EditText
            editTextPanjang.setText(String.valueOf(panjang));
            editTextLebar.setText(String.valueOf(lebar));
            editTextHasilLuas.setText(String.valueOf(luas));
            editTextHasilKeliling.setText(String.valueOf(keliling));
        }
    }
}

