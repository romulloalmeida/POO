package Aula07.Mesa;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
    private LocalDate data;
    private Cliente cliente;
    private String codigo;
    private List<Item> itens;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Item> getItens() {
        return itens;
    }
}
