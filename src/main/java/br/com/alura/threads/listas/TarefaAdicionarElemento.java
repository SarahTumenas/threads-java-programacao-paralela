package br.com.alura.threads.listas;

public class TarefaAdicionarElemento implements Runnable {
    private final int numeroDoThread;
    private Lista lista;

    public TarefaAdicionarElemento(Lista lista, int numeroDoThread) {
        this.lista = lista;
        this.numeroDoThread = numeroDoThread;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            lista.adicionaElementos("Thread " + numeroDoThread + " - " + i);
        }
    }    
}
