package padroesestruturais.facade;

public class Produto {

    public boolean enviar() {
        return ProdutoFacade.verificarEnvio(this);
    }
}
