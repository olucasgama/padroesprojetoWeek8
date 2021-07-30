package padroesestruturais.composite;

public class Unidade {

    private Instancia loja;

    public String getLoja() {
        if (this.loja == null) {
            throw new NullPointerException("Loja Sem Instancias");
        }
        return this.loja.getInstancia();
    }

    public void setLoja(Instancia loja) {
        this.loja = loja;
    }
}
