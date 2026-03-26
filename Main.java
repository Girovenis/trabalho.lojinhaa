import model.*;
import service.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // cliente (simulado)
        Cliente cliente = new Cliente(1, "Ana");

        // service de produto
        ProdutoService produtoService = new ProdutoService();
        List<Produto> produtos = produtoService.listarProdutos();

        // criar pedido
        PedidoService pedidoService = new PedidoService();
        Pedido pedido = pedidoService.criarPedido(cliente, produtos);

        // finalizar pedido (pagamento)
        pedidoService.finalizarPedido(pedido);
    }
}
