package padroesestruturais.facade;

public class Preparacao extends Etapa {

    public static Preparacao preparacao = new Preparacao();

    public Preparacao() { };

    public static Preparacao getInstancia() {
        return preparacao;
    }
}
