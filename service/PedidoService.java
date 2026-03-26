package service;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class PedidoService {

    public Pedido criarPedido(Cliente cliente, List<Produto> produtos) {
        Pedido pedido = new Pedido(cliente);
        List<ItemPedido> itens = new ArrayList<>();

        for (Produto p : produtos) {
            itens.add(new ItemPedido(p, 1));
        }

        pedido.setItens(itens);
        return pedido;
    }

    public void finalizarPedido(Pedido pedido) {
        PagamentoService pagamento = PagamentoService.getInstance();

        boolean sucesso = pagamento.processarPagamento(pedido);

        if (sucesso) {
            System.out.println("\n✅ Pagamento aprovado!");
        } else {
            System.out.println("\n❌ Pagamento recusado!");
        }
    }
}