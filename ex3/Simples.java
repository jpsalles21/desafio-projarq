package ex3;

public class Simples implements Strategy {

    public String codifica(String str) {
        char[] aux = str.toCharArray();
        char[] resp = new char[str.length()];
        for (int i = 0; i < aux.length; i++) {
            if (CodMaps.getTabCod().containsKey(aux[i])) {
                resp[i] = CodMaps.getTabCod().get(aux[i]);
            } else {
                resp[i] = aux[i];
            }
        }
        return new String(resp);
    }

    public String deCodifica(String str) {
        char[] aux = str.toCharArray();
        char[] resp = new char[str.length()];
        for (int i = 0; i < aux.length; i++) {
            if (CodMaps.getTabDeCod().containsKey(aux[i])) {
                resp[i] = CodMaps.getTabDeCod().get(aux[i]);
            } else {
                resp[i] = aux[i];
            }
        }
        return new String(resp);
    }
}
