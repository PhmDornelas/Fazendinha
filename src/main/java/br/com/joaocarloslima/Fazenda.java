package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {

    private List<Terreno> terrenos;
    private Celeiro celeiro;

    public Fazenda() {
        this.celeiro = new Celeiro(100);
        this.terrenos = new ArrayList<>();
        for (int x = 0; x < 13; x++) {
            for (int y = 0; y < 13; y++) {
                terrenos.add(new Terreno(x, y));
            }
        }
    }

    public void plantarBatata(int x, int y) {
        Terreno terreno = getTerreno(x, y);
        if (terreno.estaOcupado()) {
            throw new RuntimeException("Este terreno já está ocupado!");
        }
        if (celeiro.getQtdeBatatas() <= 0) {
            throw new RuntimeException("Não há batatas no celeiro para plantar!");
        }
        celeiro.consumirBatata();
        terreno.plantar(new Batata());
    }

    public void plantarCenoura(int x, int y) {
        Terreno terreno = getTerreno(x, y);
        if (terreno.estaOcupado()) {
            throw new RuntimeException("Este terreno já está ocupado!");
        }
        if (celeiro.getQtdeCenouras() <= 0) {
            throw new RuntimeException("Não há cenouras no celeiro para plantar!");
        }
        celeiro.consumirCenoura();
        terreno.plantar(new Cenoura());
    }

    public void plantarMorango(int x, int y) {
        Terreno terreno = getTerreno(x, y);
        if (terreno.estaOcupado()) {
            throw new RuntimeException("Este terreno já está ocupado!");
        }
        if (celeiro.getQtdeMorangos() <= 0) {
            throw new RuntimeException("Não há morangos no celeiro para plantar!");
        }
        celeiro.consumirMorango();
        terreno.plantar(new Morango());
    }

    public Terreno getTerreno(int x, int y) {
        return terrenos.get(x * 13 + y);
    }

    public void colher(int x, int y) {
        Terreno terreno = getTerreno(x, y);
        terreno.colher(celeiro);
    }

    public Celeiro getCeleiro() {
        return celeiro;
    }

    public List<Terreno> getTerrenos() {
        return terrenos;
    }

}
