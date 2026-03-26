package service;

import model.Pedido;

public class PagamentoService {

    private static PagamentoService instancia;

    // construtor privado
    private PagamentoService() {
    }

    public static PagamentoService getInstance() {
        if (instancia == null) {
            instancia = new PagamentoService();
        }
        return instancia;
    }

    public boolean processarPagamento(Pedido pedido) {
        System.out.println("\nConectando ao sistema de pagamento...");
        System.out.println("Processando pagamento do pedido...");

        return Math.random() > 0.3;
    }
}
