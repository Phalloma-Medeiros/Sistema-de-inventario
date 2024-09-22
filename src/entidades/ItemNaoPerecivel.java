package entidades;

public class ItemNaoPerecivel extends Item {
    private int durabilidade; // Durabilidade em meses

    public ItemNaoPerecivel(String nome, int quantidade, int durabilidade) {
        super(nome, quantidade);
        this.durabilidade = durabilidade;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Durabilidade: " + durabilidade + " meses";
    }
}

