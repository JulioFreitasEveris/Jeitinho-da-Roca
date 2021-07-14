package com.example.jeitinhodaroca.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jeitinhodaroca.R
import com.example.jeitinhodaroca.model.Produto
import kotlinx.android.synthetic.main.layout_lista_produtos.view.*

class ProdutosAdapter(var ListaProdutos: ArrayList<Produto>): RecyclerView.Adapter<ProdutosAdapter.ProdutoViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.layout_lista_produtos,parent,false)
        return ProdutoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        val produto = ListaProdutos[position]
        holder.bind(produto)
    }

    override fun getItemCount(): Int {
       return ListaProdutos.size
    }


    class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(produto: Produto){
            itemView.txt_codigo.text = produto.nomeProduto
            itemView.txt_produto.text = produto.codigo.toString()
            itemView.valor_produto.text = produto.valor.toString()
        }
    }

}