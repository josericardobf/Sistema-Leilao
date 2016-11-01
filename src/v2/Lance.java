/*
 * Código fonte reproduzido do livro 
 * Testes Automatizados: um guia prático
 * Maurício Aniche
 * Caso do Código
 * http://www.casadocodigo.com.br/products/livro-testes-de-software
 */
package v2;

/**
 *
 * @author curcino
 */
public class Lance {
    
    private Usuario usuario;
	
    private Double valor;

    public Lance(Usuario usuario, Double valor) {
        this.usuario = usuario;
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Double getValor() {
        return valor;
    }
}
