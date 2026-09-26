package br.com.joaocarloslima;

public class Celeiro {

    private int capacidade;
    private int qtdeBatatas;
    private int qtdeCenouras;
    private int qtdeMorangos;

    public Celeiro(int capacidade) {
        this.capacidade = capacidade;
        this.qtdeBatatas = 5;
        this.qtdeCenouras = 2;
        this.qtdeMorangos = 1;
    }

    public void armazenarBatata() {
        if (getEspacoDisponivel() < 2) {
            throw new RuntimeException("O celeiro está cheio!");
        }
        qtdeBatatas += 2;
    }

    public void armazenarCenoura() {
        if (getEspacoDisponivel() < 2) {
            throw new RuntimeException("O celeiro está cheio!");
        }
        qtdeCenouras += 2;
    }

    public void armazenarMorango() {
        if (getEspacoDisponivel() < 2) {
            throw new RuntimeException("O celeiro está cheio!");
        }
        qtdeMorangos += 2;
    }

    public void consumirBatata() {
        if (qtdeBatatas <= 0) {
            throw new RuntimeException("Não há batatas no celeiro!");
        }
        qtdeBatatas--;
    }

    public void consumirCenoura() {
        if (qtdeCenouras <= 0) {
            throw new RuntimeException("Não há cenouras no celeiro!");
        }
        qtdeCenouras--;
    }

    public void consumirMorango() {
        if (qtdeMorangos <= 0) {
            throw new RuntimeException("Não há morangos no celeiro!");
        }
        qtdeMorangos--;
    }

    public int getEspacoDisponivel() {
        return capacidade - (qtdeBatatas + qtdeCenouras + qtdeMorangos);
    }

    public double getOcupacao() {
        return (double) (qtdeBatatas + qtdeCenouras + qtdeMorangos) / capacidade;
    }

    public boolean celeiroCheio() {
        return getEspacoDisponivel() <= 0;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getQtdeBatatas() {
        return qtdeBatatas;
    }

    public int getQtdeCenouras() {
        return qtdeCenouras;
    }

    public int getQtdeMorangos() {
        return qtdeMorangos;
    }

}
