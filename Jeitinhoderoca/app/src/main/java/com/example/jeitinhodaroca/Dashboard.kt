package com.example.jeitinhodaroca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jeitinhodaroca.adapter.ProdutosAdapter
import com.example.jeitinhodaroca.datasource.DataSource
import kotlinx.android.synthetic.main.activity_dashboard.*


class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)


        iniciarRecyclerView()
    }

    private fun iniciarRecyclerView() {
        val recyclerView = btn_recyclerview
        recyclerView.layoutManager = LinearLayoutManager(this)
        btn_recyclerview.adapter = ProdutosAdapter(DataSource.getProdutos())
    }
}