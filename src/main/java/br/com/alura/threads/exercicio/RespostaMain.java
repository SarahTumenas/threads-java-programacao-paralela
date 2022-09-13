package br.com.alura.threads.exercicio;

public class RespostaMain {
    public static void main(String[] args) {
        Runnable tarefa = new ImprimeString();
        Thread thread = new Thread(tarefa, "Thread imprime string");
        thread.start();
    }
}
