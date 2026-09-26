package br.com.joaocarloslima;

public class Terreno {

    private Batata batata;
    private Cenoura cenoura;
    private Morango morango;
    private int x;
    private int y;

    public Terreno(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void plantar(Batata batata) {
        if (estaOcupado()) {
            throw new RuntimeException("Este terreno já está ocupado!");
        }
        this.batata = batata;
    }

    public void plantar(Cenoura cenoura) {
        if (estaOcupado()) {
            throw new RuntimeException("Este terreno já está ocupado!");
        }
        this.cenoura = cenoura;
    }

    public void plantar(Morango morango) {
        if (estaOcupado()) {
            throw new RuntimeException("Este terreno já está ocupado!");
        }
        this.morango = morango;
    }

    public void colher(Celeiro celeiro) {
        if (batata != null) {
            if (!batata.podeColher()) {
                throw new RuntimeException("A batata ainda não pode ser colhida!");
            }
            celeiro.armazenarBatata();
            batata = null;
        } else if (cenoura != null) {
            if (!cenoura.podeColher()) {
                throw new RuntimeException("A cenoura ainda não pode ser colhida!");
            }
            celeiro.armazenarCenoura();
            cenoura = null;
        } else if (morango != null) {
            if (!morango.podeColher()) {
                throw new RuntimeException("O morango ainda não pode ser colhido!");
            }
            celeiro.armazenarMorango();
            morango = null;
        } else {
            throw new RuntimeException("Não há nada plantado neste terreno!");
        }
    }

    public boolean estaOcupado() {
        return batata != null || cenoura != null || morango != null;
    }

    public void crescer() {
        if (batata != null) {
            batata.crescer();
        } else if (cenoura != null) {
            cenoura.crescer();
        } else if (morango != null) {
            morango.crescer();
        }
    }

    public Batata getBatata() {
        return batata;
    }

    public Cenoura getCenoura() {
        return cenoura;
    }

    public Morango getMorango() {
        return morango;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
