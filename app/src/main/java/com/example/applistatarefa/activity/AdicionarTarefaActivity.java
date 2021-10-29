package com.example.applistatarefa.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.applistatarefa.R;
import com.example.applistatarefa.helper.TarefaDAO;
import com.example.applistatarefa.model.Tarefa;
import com.google.android.material.textfield.TextInputEditText;

public class AdicionarTarefaActivity extends AppCompatActivity {

    private TextInputEditText editTarefa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_tarefa);

        editTarefa = findViewById(R.id.textTarefa);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_adicionar_tarefa, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.itemSalvar:
                // execute a ação para salvar o item
                TarefaDAO tarefaDAO = new TarefaDAO(getApplicationContext());

                Tarefa tarefa = new Tarefa();
                tarefa.setNomeTarefa("ir ao mercado");
                tarefaDAO.salvar( tarefa );

                break;
        }
        return super.onOptionsItemSelected(item);

    }
}