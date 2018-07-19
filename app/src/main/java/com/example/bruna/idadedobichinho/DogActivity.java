package com.example.bruna.idadedobichinho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DogActivity extends AppCompatActivity {
    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog);

        caixaTexto = (EditText) findViewById(R.id.caixaDeTextoId);
        botaoIdade = (Button) findViewById(R.id.botaoIdadeId);
        resultadoIdade = (TextView) findViewById(R.id.resultadoIdadeId);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //recuperar o que foi digitado
                String TextoDigitado = caixaTexto.getText().toString();

                if (TextoDigitado.isEmpty()){
                    //String vazia (mensagem de erro)
                    resultadoIdade.setText("Nenhum numero digitado!!");

                }else {
                    int valorDigitado = Integer.parseInt(TextoDigitado);
                    int ResultadoFinal = valorDigitado*7;

                    resultadoIdade.setText("A idade do cachorro em anos humanos é: " + ResultadoFinal + " anos.");


                }

            }
        });
    }

    public void irTelaPrincipal (View view){
        Intent intent3 = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent3);
    }
}
