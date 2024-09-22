package interfaces;

import entidades.Item;

import java.util.List;

public interface ServicoDeReposicao {
    void reporEstoque(Item item, int quantidade);
    void verificarEstoque(Item item);

    void adicionarItem(Item item);

    void removerItem(String nome);

    Item buscarItemPorNome(String nome);

    List<Item> listarTodosItens();
}
