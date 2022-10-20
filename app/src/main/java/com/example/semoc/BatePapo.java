package com.example.semoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BatePapo extends AppCompatActivity {


    private ListView listBatePapo;
    private String[] itens = {

        "18/10 - 09:00 ás 10:00 \n" +
                "BATE PAPO SOBRE O CEP:\n" +
                "Comitê de Ética em Pesquisa\n",

            "18/10 - 09:00 ás 10:00 \n" +
                    "BATE PAPO SOBRE O CEC:\n" +
                    "Centro de Escrita Científica\n",

            "18/10 - 09:00 ás 10:00 \n" +
                    "BATE PAPO SOBRE CARREIRA PROFISSIONAL\n"
    };


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_bate_papo);
            listBatePapo = findViewById(R.id.listBatePapo);

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                    getApplicationContext(),
                    android.R.layout.simple_list_item_1,
                    android.R.id.text1, itens
            );
        listBatePapo.setAdapter(adapter);
    }
}