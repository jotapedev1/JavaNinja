package NinvelIntermediario.DataStrucuture;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStructure {
    public static void main(String[] args) {
        Queue<String> ninjasQueue = new LinkedList<>();
        //adicinando elemento na fila
        ninjasQueue.add("Naruto"); // primeiro a ser atendido - HEAD
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Gaara"); // utlimo a ser atendido - TAIL

        System.out.println(ninjasQueue);

        ninjasQueue.poll(); // remove o HEAD, atende o primeiro da fila

        System.out.println("Pós poll " + ninjasQueue);

        System.out.println("Próximo a ser atendido: " + ninjasQueue.peek());

        ninjasQueue.offer("Rock Lee"); //adiciona a fila
        System.out.println(ninjasQueue);


    }
}
