package implementacoes;

import entidades.Item;
import interfaces.IRepositorioDeItens;
import java.util.ArrayList;
import java.util.List;

public class RepositorioDeItensImpl implements IRepositorioDeItens {
    private List<Item> itens = new ArrayList<>();

    @Override
    public void adicionarItem(Item item) {
        itens.add(item);
    }

    @Override
    public void removerItem(String nome) {
        itens.removeIf(item -> item.getNome().equals(nome));
    }

    @Override
    public Item buscarItemPorNome(String nome) {
        return itens.stream()
                .filter(item -> item.getNome().equals(nome))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Item> listarTodosItens() {
        return new ArrayList<>(itens);
    }
}

