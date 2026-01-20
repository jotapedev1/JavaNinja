package NinvelIntermediario.DataStrucuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class StackStructure {
    public static void main(String[] args) {
        //Array
        String[] myarray = new String[5];
        myarray[0] = "João Pedro";
        //List
        List<String> mylist = new ArrayList<>();
        mylist.add("Isabela Silva");
        //Stack
        Stack<String> mystack = new Stack<>();
        mystack.push("Djavan");
        mystack.push("Jorge Vercillo");
        mystack.push("Seu Jorge");
        mystack.push("Evinha");
        mystack.push("João Bosco");
        mystack.push("Tim Maia");
        System.out.println(mystack);
        mystack.pop();
        System.out.println(mystack);
        String peek = mystack.peek();
        System.out.println("O proximo é "+ peek);
        int size = mystack.size();
        System.out.println("O tamanho é " + size);


    }
}
