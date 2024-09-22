package principais;

import entidades.*;
import implementacoes.RepositorioDeItensImpl;
import interfaces.IRepositorioDeItens;
import interfaces.ServicoDeReposicao;

import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {
        // Criar um repositório e um serviço de reposição
        IRepositorioDeItens repositorio = new RepositorioDeItensImpl();
        ServicoDeReposicao servico = new ServicoDeReposicao() {
            @Override
            public void reporEstoque(Item item, int quantidade) {

            }

            @Override
            public void verificarEstoque(Item item) {

            }

            @Override
            public void adicionarItem(Item item) {

            }

            @Override
            public void removerItem(String nome) {

            }

            @Override
            public Item buscarItemPorNome(String nome) {
                return null;
            }

            @Override
            public List<Item> listarTodosItens() {
                return List.of();
            }
        };

        // Criar categorias e fornecedores (não utilizados diretamente aqui)
        Categoria categoriaAlimentos = new Categoria("Alimentos");
        Fornecedor fornecedorA = new Fornecedor("Fornecedor A");

        // Criar itens
        Item item1 = new ItemPerecivel("Maçã", 100, "2024-09-01");
        Item item2 = new ItemNaoPerecivel("Arroz", 50, 12);

        // Adicionar itens ao repositório
        repositorio.adicionarItem(item1);
        servico.verificarEstoque(item2);
    }
    }
