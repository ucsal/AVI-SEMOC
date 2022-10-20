package com.example.semoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SessoesCientificas extends AppCompatActivity {

    private ListView listSessoesCientificas;
    private String[] itens = {

            "19/10 - 09:00 ás 12:00 \n" +
                    "TEMA - BIOÉTICA E SAÚDE:\n" +
                    "Mediador: Rafael Verdival (UCSAL)\n",

            "19/10 - 09:00 ás 12:00 \n" +
                    "TEMA - COMUNIDADES TRADICIONAIS E FAMÍLIA:\n" +
                    "Mediador: Profa. Dra. Cristiane Cavalcante Moreira (UNEB)\n",

            "19/10 - 09:00 ás 12:00 \n" +
                    "TEMA - POVOS TRADICIONAIS E TERRITÓRIO:\n" +
                    "Mediador: Profa. Dra. Cristina Maria Macedo de Alencar (UCSAL)\n",

            "19/10 - 18:30 ás 21:00 \n" +
                    "TEMA - DIVERSIDADE E ALTERIDADE:\n" +
                    "Mediador: Profa. Ivone Pires Ferreira (UCSAL)\n",

            "19/10 - 18:30 ás 21:00 \n" +
                   "TEMA - METODOLOGIA, ENSINO E PESQUISA:\n" +
                    "Mediador: Diana Leia Silva (UCSAL)\n",

            "20/10 - 09:00 ás 12:00 \n" +
                    "TEMA - RACISMO AMBIENTAL E REFUGIADOS AMBIENTAIS:\n" +
                    "Mediador: Jane de Jesus Soares (UCSAL)\n",

            "20/10 - 09:00 ás 12:00 \n" +
                    "TEMA - EDUCAÇÃO INCLUSIVA:\n" +
                    "Mediador: Cesar Oliveira Carneiro (UCSAL)\n",

            "20/10 - 09:00 ás 12:00 \n" +
                    "TEMA - MEIO AMBIENTE E QUESTÕES SANITÁRIAS:\n" +
                    "Mediador: Prof. Me. Fernando Guerra (UCSAL)\n"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sessoes_cientificas);
        listSessoesCientificas = findViewById(R.id.listSessoesCientificas);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1, itens
        );
        listSessoesCientificas.setAdapter(adapter);
    }
}