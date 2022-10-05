package com.example.semoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MesaRedonda extends AppCompatActivity {

    private ListView listMesaRedonda;
    private String[] itens = {


            "\n18/10 - 9h30h ás 12:00h:\n" + "Abertura Mesa Redonda:\n" +
                    "\nDireitos Fundamentais, Efetividade e Jurisdição Constitucional\n",

            " \n18/10 - 9h30h ás 12:00h\n" +
                    "\nAcessibilidade em Escolas Municipais: ir, estar e voltar \n " ,

            "\n18/10 - 9:30 ás 12:00h\n " +
                    "\nPrimeira infância\n",

            "\n18/10 - 9:30 ás 12:00h \n" +
                    "\nPovos tradicionais e o direito ao território \n",

            "\n18/10 - 14:00 ás 16:00h\n " +
                    "O Olhar na História para Identificar os Caminhos da Ciência \n",

            "\n18/10 - 18:30 ás 21:00:\n" +
                    "\nO PIBID e a Residência Pedagógica na UCSAL: Desafios e experiências\n" +
                    "da Inclusão na Educação Básica e a Formação de Professores\n",
            "\n18/10 -18:30 ás 21:00: \n" +
                    "Direito à moradia e violações na pandemia de COVID-19\n",

            "\n18/10 - 18:30 ás 21:00h\n" +

                    " Alteridade e busca de sentido para uma educação inclusiva e dialógica \n",

            "\n18/10 - 18:30 ás 21:00h\n" +
                    "Instrumentos democráticos por uma educação inclusiva e efetiva \n",

            "\n19/10 -09:30 ás 12:00\n" +
                    "Criminologia Crítica na América Latina: Punitivismo e Direitos Humanos\n",

            "\n19/10 -09:30 ás 12:00\n" +
                    "Inclusão educacional das pessoas com deficiência e boas práticas\n",

            "\n19/10 -09:30 ás 12:00\n" +
                    "Famílias e Educação: Novos olhares e reflexões sobre inclusão social\n",

            "\n19/10 -14:00 ás 16:30\n" +
                    "A pessoa com deficiência no ensino superior: desafios e conquistass\n",

            "\n19/10 -18:30 ás 21:00\n" +
                    "A questão racial na educação e a luta por direitos\n",

            "\n19/10 -18:30 ás 21:00\n" +
                    "A figura do poliedro em tempos de crise: o processo de inclusão e\n" +
                    "diálogo fraterno\n",

            "\n20/10 -09:30 ás 12:00\n" +
                    "As cidades digitais, o Governo eletrônico e a participação popular\n",

            "\n19/10 -09:30 ás 12:00\n" +
                    "Envelhecimento e Educação Inclusiva: o idoso como sujeito de\n" +
                    "direitos\n",

            "\n20/10 -14:00 ás 16:30\n" +
                    "Racismo Ambiental, Refugiados Ambientais, Políticas Públicas e\n" +
                    "Inclusão Social",

            "\n20/10 -18:30 ás 21:00\n" +
                    "Paradigmas, Constituição e Educação para e pelos Direitos Humanos\n",

            "\n20/10 -18:30 ás 21:00\n" +
                    "Constituição, Política e Instituições Judiciais\n",

            "\n20/10 - 18:30 ás 21:00\n" +
                    "A educação inclusiva como meio de ressocialização no sistema\n" +
                    "carcerário\n",

            "\n20/10 - 18:30 ás 21:00\n" +
                    "Educação, inclusão e serviço social, interfaces da segregação\n",

            "\n21/10 - 09:30 ás 12:00\n" +
                    "Pós-Humanismo como Novo Paradigma Jurídico para o Estudo da\n" +
                    "Terra\n",

            "\n21/10 - 09:30 ás 12:00\n" +
                    "Políticas Públicas e Promoção das Capacidades\n",

            "\n21/10 - 09:30 ás 12:00\n" +
                    "Arbitragem Empresarial e Acesso à Justiça\n",

            "\n21/10 - 09:30 ás 12:00\n" +
                    "Encerramento Mesa Redonda:\n" +
                    "Inclusão social: o reverso da exclusão social?\n",







};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa_redonda);
        listMesaRedonda = findViewById(R.id.listMesaRedonda);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1, itens
        );
        listMesaRedonda.setAdapter(adapter);

    }
    }
