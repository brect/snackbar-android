package br.com.blimas.snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.Snapshot;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button btnAbrir;
    private Button btnFechar;
    private Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnAbrir = findViewById(R.id.button_abrir);
        btnFechar = findViewById(R.id.button_fechar);

        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                snackbar = Snackbar.make(
                        view,
                        "Botão pressionado",
                        Snackbar.LENGTH_LONG
                ).setAction("Confirmar", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        btnAbrir.setText("Botão abrir alterado");
                    }
                });

                snackbar.show();
            }
        });

        //criado para exemplificar a possibilidade de fechar uma snackbar utilizando outro metodo
        btnFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });
    }

    public void abrirSnackbar(View view){

    }

}
