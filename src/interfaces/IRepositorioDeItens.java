package interfaces;

import entidades.Item;
import java.util.List;

public interface IRepositorioDeItens {
    void adicionarItem(Item item);
    void removerItem(String nome);
    Item buscarItemPorNome(String nome);
    List<Item> listarTodosItens();
}
