package com.example.lembretedecompras.repository

import androidx.lifecycle.LiveData
import com.example.lembretedecompras.dao.ProdutoDao
import com.example.lembretedecompras.models.Produto

class ProdutoRepository(private val produtoDao: ProdutoDao) {

    val produtos: LiveData<List<Produto>> = produtoDao.getListaDeProdutos()

    suspend fun insert(produto: Produto) {
        produtoDao.insert(produto)
    }
}