package v1;

import junit.framework.Assert;

import org.junit.Test;

import v2.Avaliador;
import v2.Lance;
import v2.Leilao;
import v2.Usuario;

public class AvaliadorTest {

	@Test
	public void lancesOrdemCrescente() {
        
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
        
        
        Assert.assertEquals(leiloeiro.getMaiorLance(), maiorLanceEsperado);
        Assert.assertEquals(leiloeiro.getMenorLance(), menorLanceEsperado);
    }
	
	@Test
	public void lancesOrdemCrescenteOutrosValores() {
        
        Usuario joao = new Usuario("Joao");
        Usuario jose = new Usuario("Jose");
        Usuario maria = new Usuario("Maria");

        Leilao leilao = new Leilao("Playstation 3 Novo");

        leilao.propoe(new Lance(maria,1000.0));
        leilao.propoe(new Lance(joao,2000.0));
        leilao.propoe(new Lance(jose,3000.0));        

        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        double maiorLanceEsperado = 3000;
        double menorLanceEsperado = 1000;
        
        
        Assert.assertEquals(leiloeiro.getMaiorLance(), maiorLanceEsperado);
        Assert.assertEquals(leiloeiro.getMenorLance(), menorLanceEsperado);
    }
	
	@Test
	public void apenasUmLance() {
        
        Usuario joao = new Usuario("Joao");
        Usuario jose = new Usuario("Jose");
        Usuario maria = new Usuario("Maria");

        Leilao leilao = new Leilao("Playstation 3 Novo");

        leilao.propoe(new Lance(maria,1000.0));    

        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        double maiorLanceEsperado = 1000;
        double menorLanceEsperado = 1000;
        
        
        Assert.assertEquals(leiloeiro.getMaiorLance(), maiorLanceEsperado);
        Assert.assertEquals(leiloeiro.getMenorLance(), menorLanceEsperado);
    }

}
