package br.com.alura.threads.exercicio;

public class PrincipalOrdemDeExecucao {

    public static void main(String[] args) {

        new Thread(new TarefaImprimeNumeros ()).start();
        new Thread(new TarefaImprimeNumeros ()).start();
    }
}
