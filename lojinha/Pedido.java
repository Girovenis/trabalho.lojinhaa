import java.util.List;
import java.time.LocalDate;

public class Pedido {

private int idPedido;
private LocalDate data;
private String status;

private Cliente cliente;
private List<ItemPedido> itens;
private List<Pagamento> pagamentos;

public Pedido() {}

public Pedido(int idPedido, LocalDate data, String status, Cliente cliente) {
this.idPedido = idPedido;
this.data = data;
this.status = status;
this.cliente = cliente;
    
}

public int getIdPedido() { return idPedido; }
public void setIdPedido(int idPedido) { this.idPedido = idPedido; }

public LocalDate getData() { return data; }
public void setData(LocalDate data) { this.data = data; }

public String getStatus() { return status; }
public void setStatus(String status) { this.status = status; }

public Cliente getCliente() { return cliente; }
public void setCliente(Cliente cliente) { this.cliente = cliente; }

public List<ItemPedido> getItens() { return itens; }
public void setItens(List<ItemPedido> itens) { this.itens = itens; }

public List<Pagamento> getPagamentos() { return pagamentos; }
public void setPagamentos(List<Pagamento> pagamentos) { this.pagamentos = pagamentos; }

}