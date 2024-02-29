import org.example.CadastroProduto;
import org.example.Produto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CadastroProdutoTest {

    @Test
    public void testCadastrarProduto() {
        //testar método para cadastrar produto
        CadastroProduto cadastroProduto = new CadastroProduto();
        Produto produto = new Produto("Amaciante de Roupas", "Lavagem", "Cama, mesa e banho", 15.50, 200);
        cadastroProduto.cadastrarProduto(produto);
        Assertions.assertTrue(cadastroProduto.consultarProdutos().contains(produto));
    }

    /*
    * teste 01: Cadastro de um novo produto corretamente
    * entrada -> um novo produto é cadastrado corretamente com as entradas esperadas.
    * saída esperada -> o cadastro do produto
     */

    @Test
    public void testEditarProduto() {
        CadastroProduto cadastroProduto = new CadastroProduto();
        Produto produto = new Produto("Amaciante de Roupas", "Lavagem", "Cama, mesa e banho", 15.50, 200);
        cadastroProduto.cadastrarProduto(produto);
        Produto produtoEditado = new Produto("Amaciante de Roupas", "Lavagem", "Cama, mesa e banho", 19.50, 120);
        cadastroProduto.editarProdutos("Amaciante de Roupas", produtoEditado);
        Assertions.assertTrue(cadastroProduto.consultarProdutos().contains(produtoEditado));
    }

    /*
     * teste 02: Edição de um produto previamente cadastrado
     * entrada -> um produto já cadastrado é editado corretamente.
     * saída esperada -> a edição do produto dá certo.
     */

    @Test
    public void testValidacaoProduto() {
        CadastroProduto cadastroProduto = new CadastroProduto();
        Produto produto = new Produto("", "Salgadinho", "Alimentos", 6.90,80);
        cadastroProduto.cadastrarProduto(produto);
        Assertions.assertFalse(cadastroProduto.consultarProdutos().contains(produto));
    }

    /*
     * teste 03: Cadastro de um produto com valor nulo
     * entrada -> um produto sem nome tenta ser cadastrado.
     * saída esperada -> o produto não é cadastrado e aparece a mensagem "Por favor, preencha todos os campos para cadastrar o produto corretamente.".
     */

    @Test
    public void testExcluirProduto(){
        CadastroProduto cadastroProduto = new CadastroProduto();
        Produto produto = new Produto("Amaciante de Roupas", "Lavagem", "Cama, mesa e banho", 15.50, 200);
        cadastroProduto.cadastrarProduto(produto);
        cadastroProduto.excluirProduto("Amaciante de Roupas");
        Assertions.assertFalse(cadastroProduto.consultarProdutos().contains(produto));
    }

    /*
     * teste 04: Exclusão de um produto cadastrado.
     * entrada -> um produto é cadastrado e em seguida é excluido, depois é analisado se o produto não está na lista de produtos.
     * saída esperada -> o produto não é encotrado na lista e portanto foi excluido".
     */

    @Test
    public void testConsultarProdutos() {
        CadastroProduto cadastroProduto = new CadastroProduto();

        Produto produto1 = new Produto("Doritos", "Salgadinho", "Alimentos", 14.90, 140);
        Produto produto2 = new Produto("Cheetos", "Salgadinho", "Alimentos", 14.0, 200);

        cadastroProduto.cadastrarProduto(produto1);
        cadastroProduto.cadastrarProduto(produto2);

        Assertions.assertEquals(2, cadastroProduto.consultarProdutos().size());
    }

    /*
     * teste 05: Quantidade de produtos cadastrado.
     * entrada -> verifica se o método consultarProdutos() retorna uma lista com o tamanho esperado após a adição de dois produtos à lista de produtos.
     * saída esperada -> retorna o número correto de produtos na lista.
     */

}
