/*
 * Código fonte reproduzido do livro 
 * Testes Automatizados: um guia prático
 * Maurício Aniche
 * Caso do Código
 * http://www.casadocodigo.com.br/products/livro-testes-de-software
 */
package v2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author curcino
 */
public class Leilao {

    private String objetoLeiloado;
	
    private List<Lance> lances;

    public Leilao(String objetoLeiloado) {
        this.objetoLeiloado = objetoLeiloado;
        this.lances = new ArrayList<Lance>();
    }

    public String getObjetoLeiloado() {
        return objetoLeiloado;
    }

    public void propoe(Lance lance) {
        this.lances.add(lance);
    }

    public List<Lance> getLances() {
        return lances;
    }    
    
}
