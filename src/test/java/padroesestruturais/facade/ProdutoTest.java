package padroesestruturais.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void retornaProdutoRecepcao() {
        Produto produto = new Produto();
        Recepcao.getInstancia().addEtapaEnvio(produto);

        assertEquals(false, produto.enviar());
    }

    @Test
    void retornaProdutoPreparacao() {
        Produto produto = new Produto();
        Preparacao.getInstancia().addEtapaEnvio(produto);

        assertEquals(false, produto.enviar());
    }

    @Test
    void retornaProdutoEnviado() {
        Produto produto = new Produto();

        assertEquals(true, produto.enviar());
    }

}