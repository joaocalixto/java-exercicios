package interfaces;

public class Aviao implements Voadores, CarregarMalas {
    @Override
    public void voar() {
        System.out.println("Avião voando");
    }

    @Override
    public void carregarMalas() {
        System.out.println("Avião carregando malas");
    }
}
