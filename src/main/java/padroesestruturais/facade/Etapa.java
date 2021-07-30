package padroesestruturais.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Etapa {

    List<Produto> etapasEnvio = new ArrayList<Produto>();

    public void addEtapaEnvio(Produto produto) {
        this.etapasEnvio.add(produto);
    }

    public boolean verificarEtapaEnvio(Produto produto) {
        return etapasEnvio.contains(produto);
    }
}
