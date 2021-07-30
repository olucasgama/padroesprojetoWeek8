package padroesestruturais.facade;

public class ProdutoFacade {

    public static boolean verificarEnvio(Produto produto) {
        if (Recepcao.getInstancia().verificarEtapaEnvio(produto)){
            return false;
        }
        if (Preparacao.getInstancia().verificarEtapaEnvio(produto)){
            return false;
        }
        return true;
    }
}
