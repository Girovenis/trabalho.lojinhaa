import java.time.LocalDate;

public class Main {
public static void main(String[] args) {

Cliente c = new Cliente(1, "Thais", "thais@email.com", "99999-9999");
Produto p = new Produto(1, "Notebook", 3000.0, 10);
Pedido ped = new Pedido(1, LocalDate.now(), "Em andamento", c);
ItemPedido item = new ItemPedido(1, 2, 3000.0, ped, p);
Pagamento pag = new Pagamento(1, "Cartão", 6000.0, "Pago", ped);

System.out.println("Cliente: " + c.getNome());
System.out.println("Produto: " + p.getNome());
System.out.println("Pedido status: " + ped.getStatus());
System.out.println("Quantidade: " + item.getQuantidade());
System.out.println("Pagamento: " + pag.getTipo());
   
}
}