package com.example.aluno.cadastrodecliente;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    private EditText nome;
    private EditText telefone;
    private EditText endereco;
    private EditText bairro;
    private EditText cidade;
    private EditText uf;
    private EditText cpf;
    private EditText rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (EditText) findViewById(R.id.nome);
        telefone = (EditText) findViewById(R.id.telefone);
        endereco = (EditText) findViewById(R.id.endereco);
        bairro = (EditText) findViewById(R.id.bairro);
        cidade = (EditText) findViewById(R.id.cidade);
        uf = (EditText) findViewById(R.id.uf);
        cpf = (EditText) findViewById(R.id.cpf);
        rg = (EditText) findViewById(R.id.rg);

    }

    public void salvar(View v){
        Cliente cliente = new Cliente();
        cliente.setNome(nome.getText().toString());
        cliente.setTelefone(telefone.getText().toString());
        cliente.setEndereco(endereco.getText().toString());
        cliente.setBairro(bairro.getText().toString());
        cliente.setCidade(cidade.getText().toString());
        cliente.setUf(uf.getText().toString());
        cliente.setCpf(cpf.getText().toString());
        cliente.setRg(rg.getText().toString());

        Intent i = new Intent(this,MostrarCliente.class);
        i.putExtra("cliente",cliente);
        startActivity(i);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
