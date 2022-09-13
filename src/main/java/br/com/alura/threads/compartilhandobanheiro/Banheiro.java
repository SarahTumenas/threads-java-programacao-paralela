package br.com.alura.threads.compartilhandobanheiro;

public class Banheiro {
    public void fazNumero1() {

        /*
        conseguir esse bloqueio de forma explícita
         private Lock lock = new ReentrantLock();

         public void fazNumero1() {

        lock.lock();
            System.out.println("entrando no banheiro");
            System.out.println("fazendo coisa rapida");

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("dando descarga");
            System.out.println("lavando a mao");
            System.out.println("saindo do banheiro");
        lock.unlock();
    }

    public void fazNumero2() {

        lock.lock();
            System.out.println("entrando no banheiro");
            System.out.println("fazendo coisa demorada");

            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("dando descarga");
            System.out.println("lavando a mao");
            System.out.println("saindo do banheiro");
        lock.unlock();
    }
        */


        String nome = Thread.currentThread().getName();

        System.out.println(nome + " batendo na porta");

        synchronized (this) {

            System.out.println(nome + " entrando no banheiro");
            System.out.println(nome + " fazendo coisa rapida");

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(nome + " dando descarga");
            System.out.println(nome + " lavando a mao");
            System.out.println(nome + " saindo do banheiro");
        }
    }

    public void fazNumero2() {

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " batendo na porta");

        synchronized (this) {

            System.out.println(nome + " entrando no banheiro");
            System.out.println(nome + " fazendo coisa demorada");

            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(nome + " dando descarga");
            System.out.println(nome + " lavando a mao");
            System.out.println(nome + " saindo do banheiro");
        }
    }
}
