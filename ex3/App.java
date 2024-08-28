package ex3;

public class App {
    public static void main(String[] args) throws Exception {
        String aux = "Desafio Padrões de Projeto";

        Codificador codSimples = new Codificador(new Simples());
        System.out.println(aux);
        aux = codSimples.codifica(aux);
        System.out.println(aux);
        aux = codSimples.deCodifica(aux);
        System.out.println(aux);

        Codificador codDesloca = new Codificador(new Desloca());
        aux = codDesloca.codifica(aux);
        System.out.println(aux);
        aux = codDesloca.deCodifica(aux);
        System.out.println(aux);
    }
}
