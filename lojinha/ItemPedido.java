public class ItemPedido {

private int idItem;
private int quantidade;
private double precoUnitario;

private Pedido pedido;
private Produto produto;

public ItemPedido() {}

public ItemPedido(int idItem, int quantidade, double precoUnitario, Pedido pedido, Produto produto) {
this.idItem = idItem;
this.quantidade = quantidade;
this.precoUnitario = precoUnitario;
this.pedido = pedido;
this.produto = produto;
    
}

public int getIdItem() { return idItem; }
public void setIdItem(int idItem) { this.idItem = idItem; }

public int getQuantidade() { return quantidade; }
public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

public double getPrecoUnitario() { return precoUnitario; }
public void setPrecoUnitario(double precoUnitario) { this.precoUnitario = precoUnitario; }

public Pedido getPedido() { return pedido; }
public void setPedido(Pedido pedido) { this.pedido = pedido; }

public Produto getProduto() { return produto; }
public void setProduto(Produto produto) { this.produto = produto; }

}