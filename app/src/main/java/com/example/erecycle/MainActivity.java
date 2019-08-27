package com.example.erecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnEntrar, btnSair;
    EditText txtLogin, txtSenha;
    TextView lblcadastre, lblEsqSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLogin = (EditText) findViewById(R.id.txtLogin);
        txtSenha = (EditText) findViewById(R.id.txtSenha);
        btnEntrar = (Button) findViewById(R.id.btnEntrar);
        btnSair = (Button) findViewById(R.id.btnSair);
        lblcadastre = (TextView) findViewById(R.id.lblcadastre);
        lblEsqSenha = (TextView) findViewById(R.id.lblEsqSenha);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login, senha;

                login = txtLogin.getText().toString();
                senha = txtSenha.getText().toString();

                if (login.equals("admin") && senha.equals("admin")) {
                    startActivity(new Intent(getApplicationContext(), Recicladores_Activity.class));
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Login ou Senha Inválidos.", Toast.LENGTH_SHORT).show();
                    txtLogin.setText("");
                    txtSenha.setText("");
                    txtLogin.requestFocus();
                }
            }
        });

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        lblcadastre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Cadastro_Activity.class));
            }
        });

        lblEsqSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Verifique seu E-mail", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
