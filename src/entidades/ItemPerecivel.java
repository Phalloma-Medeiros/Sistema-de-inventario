package entidades;

public class ItemPerecivel extends Item {
    private String dataValidade;

    public ItemPerecivel(String nome, int quantidade, String dataValidade) {
        super(nome, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Data de Validade: " + dataValidade;
    }
}
