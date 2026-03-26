package service;

import model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

    private List<Produto> produtos = new ArrayList<>();

    public ProdutoService() {
        produtos.add(new Produto(1, "Notebook", 3500.0));
        produtos.add(new Produto(2, "Mouse", 80.0));
        produtos.add(new Produto(3, "Teclado", 150.0));
    }

    public List<Produto> listarProdutos() {
        System.out.println("\n--- LISTA DE PRODUTOS ---");

        for (Produto p : produtos) {
            System.out.println(p.getId() + " - " + p.getNome() + " - R$ " + p.getPreco());
        }

        return produtos;
    }
}