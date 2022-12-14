package com.example.semoc;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class JornadaDePesquisa extends AppCompatActivity {

    private ListView listJornadaDePesquisa;
    private String[] itens = {
            "\n18/10: 14h00h ás 16:30h: \n"
                    + "TEMA 1 - DIREITO AO TERRITÓRIO E À VIDA: \n"
            + "Grupo de Pesquisa Geotecnologias e Planejamento Territorial - GEOPLAN",

            "\n18/10: 14h00h ás 16:30h: \n"
                    + "TEMA 1 - TEMA 2 - DIVERSIDADE E ALTERIDADE \n" +
            "Grupo de Pesquisa em Comunicação, Territorialidades e Culturas - COMTEC",

            "\n18/10: 14h00h ás 16:30h: \n"
                    + "TEMA 3 - POLÍTICAS PÚBLICAS E INCLUSÃO SOCIAL \n" +
                    "Grupo de Pesquisa Gestão Ambiental e Desenvolvimento de Empreendimentos\n" +
                    "Sociais - GAMDES",

            "\n19/10: 14h00h ás 16:30h: \n"
                    + "TEMA 1 - DIREITO AO TERRITÓRIO E À VIDA\n" +
                    "Grupo de Pesquisa Gestão Democrática das Cidades \n",

            "\n19/10: 14h00h ás 16:30h: \n"
                    + "TEMA 2 - DIVERSIDADE E ALTERIDADE\n" +
                    "Grupo de Pesquisa Logoterapia e Análise existencial - LOGOS \n",

            "\n19/10: 14h00h ás 16:30h: \n"
                    + "TEMA 3 - POLÍTICAS PÚBLICAS E INCLUSÃO SOCIAL\n" +
                    "Grupo de Pesquisa Políticas Públicas e Gestão Escolar - GEPPGE\n",

            "\n19/10: 14h00h ás 16:30h: \n"
                    + "TEMA 2 - DIVERSIDADE E ALTERIDADE\n" +
                    "Grupo de Pesquisa Familia, Inclusão e Desenvolvimento Humano \n",

            "\n20/10: 14h00h ás 16:30h: \n"
                    + "TEMA 1 - DIREITO AO TERRITÓRIO E À VIDA\n" +
                    "Grupo de Pesquisa Desenvolvimento, Sociedade e Natureza - DSN\n",

            "\n20/10: 14h00h ás 16:30h: \n"
                    + "TEMA 2 - DIVERSIDADE E ALTERIDADE\n" +
                    "Grupo de Pesquisa Processos Urbanos e Direito à Cidade - DCidade \n",

            "\n20/10: 14h00h ás 16:30h: \n"+
                    "Grupo de Pesquisa Processos Urbanos e Direito à Cidade - DCidade \n",

            "\n20/10: 14h00h ás 16:30h: \n"
                    + "TEMA 1 - DIREITO AO TERRITÓRIO E À VIDA\n" +
                    "Grupo de Pesquisa Processos Urbanos e Direito à Cidade - DCidade \n",

    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jornada_de_pesquisa);
        listJornadaDePesquisa = findViewById(R.id.listJornadaDePesquisa);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1, itens
        );
        listJornadaDePesquisa.setAdapter(adapter);

    }
}
