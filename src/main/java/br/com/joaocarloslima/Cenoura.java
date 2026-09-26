package br.com.joaocarloslima;

public class Cenoura {

    private int tamanho;
    private int tempoDeVida;
    private int tempoDeCrescimento;

    public Cenoura() {
        this.tamanho = 1;
        this.tempoDeVida = 0;
        this.tempoDeCrescimento = 3;
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
        return "images/cenoura" + tamanho + ".png";
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
