package com.example.semoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listSemoc;
    private String[] itens = {
            "Mesas Redondas", "Jornada de pesquisa","Bate-Papos","Sessoes Cientificas", "Semoc Jovem"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listSemoc = findViewById(R.id.ListSemoc);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,itens
        );


        listSemoc.setAdapter(adapter);
        listSemoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String nomeSelecionado=listSemoc.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(),nomeSelecionado,Toast.LENGTH_SHORT).show();

                if(nomeSelecionado==listSemoc.getItemAtPosition(0)) {
                    Intent intent = new Intent(MainActivity.this, MesaRedonda.class);
                    startActivity(intent);
                } else if (nomeSelecionado==listSemoc.getItemAtPosition(1)){
                    Intent intent = new Intent(MainActivity.this, JornadaDePesquisa.class);
                    startActivity(intent);
                } else if (nomeSelecionado==listSemoc.getItemAtPosition(2)) {
                    Intent intent = new Intent(MainActivity.this, BatePapo.class);
                    startActivity(intent);
                } else if (nomeSelecionado==listSemoc.getItemAtPosition(3)) {
                        Intent intent = new Intent(MainActivity.this, SessoesCientificas.class);
                        startActivity(intent);
                } else {
                Intent intent = new Intent(MainActivity.this, SessoesCientificas.class);
                startActivity(intent);
            }
            }
        });


    }
}