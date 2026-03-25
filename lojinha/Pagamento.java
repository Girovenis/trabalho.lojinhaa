public class Pagamento {

private int idPagamento;
private String tipo;
private double valor;
private String status;

private Pedido pedido;

public Pagamento() {}

public Pagamento(int idPagamento, String tipo, double valor, String status, Pedido pedido) {
this.idPagamento = idPagamento;
this.tipo = tipo;
this.valor = valor;
this.status = status;
this.pedido = pedido;

}

public int getIdPagamento() { return idPagamento; }
public void setIdPagamento(int idPagamento) { this.idPagamento = idPagamento; }

public String getTipo() { return tipo; }
public void setTipo(String tipo) { this.tipo = tipo; }

public double getValor() { return valor; }
public void setValor(double valor) { this.valor = valor; }

public String getStatus() { return status; }
public void setStatus(String status) { this.status = status; }

public Pedido getPedido() { return pedido; }
public void setPedido(Pedido pedido) { this.pedido = pedido; }

}