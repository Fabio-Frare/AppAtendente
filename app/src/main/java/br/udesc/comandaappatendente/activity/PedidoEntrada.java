package br.udesc.comandaappatendente.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import br.udesc.comandaappatendente.R;
import br.udesc.comandaappatendente.modelo.Produto;
import br.udesc.comandaappatendente.util.PedidoAdapter;

public class PedidoEntrada extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private final ArrayList<Produto> produtos = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido_entrada);

        testeProdutos();
        findComponentes();
        iniAdapter();
    }

    private void testeProdutos() {
        Produto p = new Produto();
        p.setNome("Pizza de Mussarela");
        produtos.add(p);


    }

    private void iniAdapter() {
        listView.setAdapter(new PedidoAdapter(this, produtos));
        listView.setOnItemClickListener(this);
    }

    private void findComponentes() {
        listView = findViewById(R.id.list);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        Produto produto = produtos.get(position);
        Toast.makeText(view.getContext(), "Selecionado o produto: " + produto.getNome(), Toast.LENGTH_LONG).show();
    }


}
