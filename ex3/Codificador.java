package ex3;

public class Codificador {
    private Strategy estrategia;

    public Codificador(Strategy estrategia) {
        this.estrategia = estrategia;
    }

    public String codifica(String str) {
        return estrategia.codifica(str);
    }

    public String deCodifica(String str) {
        return estrategia.deCodifica(str);
    }
}
