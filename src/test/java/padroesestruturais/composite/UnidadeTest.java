package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnidadeTest {

    @Test
    void retornaSemInstacias(){
        try {
            Unidade unidade = new Unidade();
            unidade.getLoja();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Loja Sem Instancias", e.getMessage());
        }
    }

    @Test
    void retornaInstanciasUnidade(){

        Categoria categoria = new Categoria("Masculino");
        Categoria categoria1 = new Categoria("Feminino");
        Categoria categoria2 = new Categoria("Infantil");
        Categoria categoria3 = new Categoria("Roupas");

        Setor setor = new Setor("Chuteiras");
        Setor setor1 = new Setor("Botas");
        Setor setor2 = new Setor("Cuecas");
        Setor setor3 = new Setor("Meioes");
        Setor setor4 = new Setor("Saltos");
        Setor setor5 = new Setor("Calcinhas");
        Setor setor6 = new Setor("Regatas");
        Setor setor7 = new Setor("Calcas");
        Setor setor8 = new Setor("Polos");

        categoria.addInstancia(setor);
        categoria.addInstancia(setor1);
        categoria.addInstancia(setor2);
        categoria.addInstancia(setor3);

        categoria1.addInstancia(setor1);
        categoria1.addInstancia(setor4);
        categoria1.addInstancia(setor5);
        categoria1.addInstancia(setor6);

        categoria2.addInstancia(setor1);
        categoria2.addInstancia(setor7);
        categoria2.addInstancia(setor8);

        categoria3.addInstancia(setor2);
        categoria3.addInstancia(setor3);
        categoria3.addInstancia(setor5);
        categoria3.addInstancia(setor6);
        categoria3.addInstancia(setor7);
        categoria3.addInstancia(setor8);

        Categoria allCategorias = new Categoria("Todas Categorias");
        allCategorias.addInstancia(categoria);
        allCategorias.addInstancia(categoria1);
        allCategorias.addInstancia(categoria2);
        allCategorias.addInstancia(categoria3);

        Unidade unidade = new Unidade();
        unidade.setLoja(allCategorias);

        assertEquals("Categoria: Todas Categorias" + "\n\t" +
                "Categoria: Masculino" + "\n\t" + "Setor: Chuteiras" + "\n\t" + "Setor: Botas" + "\n\t" + "Setor: Cuecas" + "\n\t" + "Setor: Meioes" + "\n\t" +
                "\tCategoria: Feminino" + "\n\t" + "Setor: Botas" + "\n\t" + "Setor: Saltos" + "\n\t" + "Setor: Calcinhas" + "\n\t" + "Setor: Regatas" + "\n\t" +
                "\tCategoria: Infantil" + "\n\t" + "Setor: Botas" + "\n\t" + "Setor: Calcas" + "\n\t" + "Setor: Polos" + "\n\t" +
                "\tCategoria: Roupas" + "\n\t" + "Setor: Cuecas" + "\n\t" + "Setor: Meioes" + "\n\t" + "Setor: Calcinhas" + "\n\t" +
                "Setor: Regatas" + "\n\t" + "Setor: Calcas" + "\n\t" + "Setor: Polos" + "\n\t" + "\t", unidade.getLoja());
    }
}