package tech.ada.java.ds.queue;

import java.util.ArrayDeque;

public class Application {

    public static void main(String[] args) {
        System.out.println("Minha Fila ======");
        Queue<String> minhaFila = new QueueAdaCielo<>();
        minhaFila.enqueue("casa");
        minhaFila.enqueue("aula");
        minhaFila.enqueue("palavra");
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila.front());
        System.out.println(minhaFila.rear());
        System.out.println(minhaFila.isFull());
        minhaFila.dequeue();
        minhaFila.dequeue();
        System.out.println(minhaFila.isEmpty());
        System.out.println("Java Fila ======");
        java.util.Queue<String> fila = new ArrayDeque<>();
        fila.add("casa");
        fila.add("aula");
        fila.add("palavra");
        System.out.println(fila.poll());
        System.out.println(fila.peek());
        fila.poll();
        fila.poll();
        System.out.println(fila.isEmpty());

    }

}
