package quartaQuestao;

public class IntegerSet {
    private boolean[] conjunto;

    public IntegerSet() {
        conjunto = new boolean[101];
    }

    public IntegerSet uniao(IntegerSet outroConjunto) {
        IntegerSet resultado = new IntegerSet();

        for (int i = 0; i < conjunto.length; i++) {
            resultado.conjunto[i] = conjunto[i] || outroConjunto.conjunto[i];
        }

        return resultado;
    }

    public IntegerSet intersecao(IntegerSet outroConjunto) {
        IntegerSet resultado = new IntegerSet();

        for (int i = 0; i < conjunto.length; i++) {
            resultado.conjunto[i] = conjunto[i] && outroConjunto.conjunto[i];
        }

        return resultado;
    }

    public void inserirElemento(int elemento) {
        if (elemento >= 0 && elemento <= 100) {
            conjunto[elemento] = true;
        }
    }

    public void excluirElemento(int elemento) {
        if (elemento >= 0 && elemento <= 100) {
            conjunto[elemento] = false;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        boolean conjuntoVazio = true;
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i]) {
                sb.append(i).append(" ");
                conjuntoVazio = false;
            }
        }

        if (conjuntoVazio) {
            return "--";
        }

        return sb.toString().trim();
    }

    public boolean igualA(IntegerSet outroConjunto) {
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i] != outroConjunto.conjunto[i]) {
                return false;
            }
        }

        return true;
    }

}
