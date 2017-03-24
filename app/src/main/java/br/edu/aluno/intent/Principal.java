package br.edu.aluno.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import static android.R.attr.button;

public class Principal extends AppCompatActivity {

    private Button botaoum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
}
