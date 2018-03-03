package caraoucoroa.cursoandroid.com.caraoucoroa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoJogar;
    private String[]  opcao={"cara","coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    botaoJogar = findViewById(R.id.botaoJogarId);


    botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //gerar numero aleatorio
                Random randomico = new Random();

                //pega numeros randomicos de 0 à 2
                int numeroAleatorio = randomico.nextInt(2);

                //0 cara - 1 coroa

                Intent intent = new Intent(MainActivity.this,DetalheActivity.class);
                intent.putExtra("opcao",opcao[numeroAleatorio]);

                startActivity(intent);


            }
        });









     getSupportActionBar().hide();
    }
}
