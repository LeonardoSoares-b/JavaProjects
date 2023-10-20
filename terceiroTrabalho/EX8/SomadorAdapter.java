package EX8;

import java.util.List;
import java.util.ArrayList;

public class SomadorAdapter implements SomadorEsperado {
    private SomadorExistente somadorExistente;

    public SomadorAdapter(SomadorExistente somadorExistente) {
        this.somadorExistente = somadorExistente;
    }

    @Override
    public int somaVetor(int[] vetor) {
        List<Integer> lista = new ArrayList<>();
        for (int valor : vetor) {
            lista.add(valor);
        }
        return somadorExistente.somaLista(lista);
    }
}
