package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends Instancia {

    private List<Instancia> instancias;

    public Categoria(String descricao) {
        super(descricao);
        this.instancias = new ArrayList<Instancia>();
    }

    public void addInstancia (Instancia instancia) {
        this.instancias.add(instancia);
    }

    public String getInstancia() {
        String aux = "";
        aux = "Categoria: " + this.getDescricao() + "\n\t";
            for (Instancia instancia : instancias) {
                aux += instancia.getInstancia() + "\t";
            }
        return aux;
    }
}
