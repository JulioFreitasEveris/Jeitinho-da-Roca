package com.example.jeitinhodaroca.datasource

import com.example.jeitinhodaroca.model.Produto

class DataSource {
    companion object{
        fun getProdutos(): ArrayList<Produto>{
            var produtos = ArrayList<Produto>()

            produtos.add(Produto(1, "Queijo",10.00,1))
            produtos.add(Produto(2, "ovo",0.50,1))
            produtos.add(Produto(3, "doce_de_leite",10.00,1))
            produtos.add(Produto(4, "galinha",40.00,1))
            produtos.add(Produto(5, "pintinho",5.00,1))
            produtos.add(Produto(6, "leite",3.00,1))
            produtos.add(Produto(7, "ovos_galados",2.00,1))
            produtos.add(Produto(8, "frango",30.00,1))

            return produtos
        }
    }
}