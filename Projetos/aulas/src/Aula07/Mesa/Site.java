package Aula07.Mesa;

import Aula07.Endereco;
import Aula07.Telefone;
import Aula07.TelefoneTipo;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Site {
    public static void main(String[] args) {
        // Criando o cliente
        Cliente romullo = new Cliente("Rômullo");
        // Criando o endereço
        Endereco endereco = new Endereco();
        endereco.setBairro("Casa Verde");
        endereco.setCidade("São Paulo");
        endereco.setLogradouro("Dr. Mario");
        endereco.setNumero("10");
        endereco.setUf("SP");
        // Atribuindo endereço para o cliente
        romullo.setEndereco(endereco);
        // Criando o telefone
        Telefone telefone = new Telefone(11,4548, TelefoneTipo.FIXO);
        // Atribuindo o telefone para o cliente
        romullo.setTelefone(telefone);
        // Criando o pedido
        Pedido pedido = new Pedido();
        pedido.setCliente(romullo);
        pedido.setData(LocalDate.now());
        pedido.setCodigo("PH76");
        // Criando os itens
        Item headset = new Item("Headset HXT3500",125.00);
        Item mouse = new Item("Mouse TM20",50.00);
        // Criando lista de itens
        List<Item> lista = new LinkedList<Item>();
        // Enchendo a "Cesta"
        lista.add(headset);
        lista.add(mouse);
        // Atribuindo a lista ao pedido
        pedido.setItens(lista);

        // Exibindo os dados
        System.out.println("Cliente: " + pedido.getCliente().getNome());
        System.out.println("Código do pedido: " + pedido.getCodigo());

    }
}
