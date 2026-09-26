package br.com.joaocarloslima;

public class Morango {

    private int tamanho;
    private int tempoDeVida;
    private int tempoDeCrescimento;

    public Morango() {
        this.tamanho = 1;
        this.tempoDeVida = 0;
        this.tempoDeCrescimento = 4;
    }

    public void crescer() {
        tempoDeVida++;
        if (tamanho < 4 && tempoDeVida % tempoDeCrescimento == 0) {
            tamanho++;
        }
    }

    public boolean podeColher() {
        return tamanho == 4;
    }

    public String getImagem() {
        return "images/morango" + tamanho + ".png";
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getTempoDeVida() {
        return tempoDeVida;
    }

    public int getTempoDeCrescimento() {
        return tempoDeCrescimento;
    }

}
