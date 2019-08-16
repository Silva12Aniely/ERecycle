package com.example.erecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnEntrar, btnCadastro;
    EditText txtLogin, txtSenha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLogin = (EditText) findViewById(R.id.txtLogin);
        txtSenha = (EditText) findViewById(R.id.txtSenha);
        btnEntrar = (Button) findViewById(R.id.btnEntrar);
        btnCadastro = (Button) findViewById(R.id.lCadastro);

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
        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Cadastro_Activity.class));
            }
        });

    }
}
