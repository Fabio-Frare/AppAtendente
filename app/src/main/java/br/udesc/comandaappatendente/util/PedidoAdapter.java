package br.udesc.comandaappatendente.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import br.udesc.comandaappatendente.R;
import br.udesc.comandaappatendente.modelo.Produto;

public class PedidoAdapter extends BaseAdapter {

    private Context context;
    private List<Produto> produtos;

    public PedidoAdapter(Context context, List<Produto> produtos) {
        super();
        this.context = context;
        this.produtos = produtos;
    }


    @Override
    public int getCount() {
        return produtos.size();
    }

    @Override
    public Object getItem(int position) {
        return produtos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.listview_pedido, parent, false);
        Produto produto = produtos.get(position);

        ImageView imgProduto      = view.findViewById(R.id.imgProduto);
        TextView txtNomeCliente   = view.findViewById(R.id.txtNomeCliente);
        TextView txtMesa          = view.findViewById(R.id.txtMesa);
        TextView txtNomeProduto   = view.findViewById(R.id.txtProduto);
        LinearLayout layoutPedido = view.findViewById(R.id.layout_pedido);

        txtNomeCliente.setText("Fabio Frare");
        txtNomeProduto.setText(produto.getNome());
        txtMesa.setText("Mesa: 15");

        return view;
    }

}
