Documentação do Código

Pacote: entidades

Classe: Categoria

Representa uma categoria com um nome associado.

Construtor:

> Categoria(String nome): Inicializa uma nova instância de Categoria com o nome especificado.

Métodos:

> String getNome(): Retorna o nome da categoria.

> void setNome(String nome): Define um novo nome para a categoria.

>String toString(): Retorna uma representação em string da categoria.

Classe: Fornecedor

Representa um fornecedor com um nome associado.

Construtor:
> Fornecedor(String nome): Inicializa uma nova instância de Fornecedor com o nome especificado.

Métodos:

> String getNome(): Retorna o nome do fornecedor.

> void setNome(String nome): Define um novo nome para o fornecedor.

> String toString(): Retorna uma representação em string do fornecedor.

Classe: Item

Classe abstrata que representa um item com nome e quantidade.

Construtor:

> Item(String nome, int quantidade): Inicializa uma nova instância de Item com o nome e quantidade especificados.

Métodos:

> String getNome(): Retorna o nome do item.

> void setNome(String nome): Define um novo nome para o item.

> int getQuantidade(): Retorna a quantidade do item.

> void setQuantidade(int quantidade): Define uma nova quantidade para o item.

> String toString(): Retorna uma representação em string do item.

Classe: ItemNaoPerecivel

Representa um item não perecível, com uma durabilidade associada.

Construtor:

> ItemNaoPerecivel(String nome, int quantidade, int durabilidade): Inicializa uma nova instância de ItemNaoPerecivel.

Métodos:

> int getDurabilidade(): Retorna a durabilidade do item não perecível em meses.

> void setDurabilidade(int durabilidade): Define uma nova durabilidade para o item.

> String toString(): Retorna uma representação em string do item não perecível.

Classe: ItemPerecivel

Representa um item perecível, com uma data de validade associada.

Construtor:

> ItemPerecivel(String nome, int quantidade, String dataValidade): Inicializa uma nova instância de ItemPerecivel.

Métodos:

> String getDataValidade(): Retorna a data de validade do item perecível.

> void setDataValidade(String dataValidade): Define uma nova data de validade para o item.

> String toString(): Retorna uma representação em string do item perecível.

Pacote: implementacoes

Classe: RepositorioDeItensImpl

Implementa o repositório de itens, permitindo adicionar, remover, buscar e listar itens.

Métodos:

> void adicionarItem(Item item): Adiciona um item ao repositório.

> void removerItem(String nome): Remove um item do repositório pelo nome.

> Item buscarItemPorNome(String nome): Busca um item no repositório pelo nome.

> List<Item> listarTodosItens(): Lista todos os itens no repositório.

Pacote: interfaces

Interface: IRepositorioDeItens

Define os métodos para manipulação de itens em um repositório.

Métodos:

> void adicionarItem(Item item): Adiciona um item ao repositório.

> void removerItem(String nome): Remove um item do repositório pelo nome.

> Item buscarItemPorNome(String nome): Busca um item no repositório pelo nome.

> List<Item> listarTodosItens(): Lista todos os itens no repositório.

Interface: ServicoDeReposicao

Define os métodos para gerenciar a reposição de estoque.

Métodos:

> void reporEstoque(Item item, int quantidade): Reposição de um item no estoque.

> void verificarEstoque(Item item): Verifica o estoque de um item.

> void adicionarItem(Item item): Adiciona um item ao repositório.

> void removerItem(String nome): Remove um item do repositório pelo nome.

> Item buscarItemPorNome(String nome): Busca um item no repositório pelo nome.

> List<Item> listarTodosItens(): Lista todos os itens no repositório.
