package padroesestruturais.composite;

public abstract class Instancia {

    private String descricao;

    public Instancia(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getInstancia();
}
