package padroesestruturais.facade;

public class Recepcao extends Etapa {

    public static Recepcao recepcao = new Recepcao();

    public Recepcao() { };

    public static Recepcao getInstancia(){
        return recepcao;
    }
}
