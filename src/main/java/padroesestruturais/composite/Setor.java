package padroesestruturais.composite;

public class Setor extends Instancia {

    public Setor(String descricao) {
        super(descricao);
    }

    public String getInstancia() {
        return "Setor: " + this.getDescricao() + "\n";
    }
}
