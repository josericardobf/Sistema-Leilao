/*
 * Código fonte reproduzido do livro 
 * Testes Automatizados: um guia prático
 * Maurício Aniche
 * Casa do Código
 * http://www.casadocodigo.com.br/products/livro-testes-de-software
 */
package v2;


/**
 *
 * @author curcino
 */
public class AvaliadorTest {
   
    
	public static void main(String[] args) {
        
        Usuario joao = new Usuario("Joao");
        Usuario jose = new Usuario("Jose");
        Usuario maria = new Usuario("Maria");

        Leilao leilao = new Leilao("Playstation 3 Novo");

        leilao.propoe(new Lance(maria,250.0));
        leilao.propoe(new Lance(joao,300.0));
        leilao.propoe(new Lance(jose,400.0));        

        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        double maiorLanceEsperado = 400;
        double menorLanceEsperado = 250;
        
        
        System.out.println(leiloeiro.getMaiorLance() == maiorLanceEsperado);
        System.out.println(leiloeiro.getMenorLance() == menorLanceEsperado);
    }
}
