package tech.ada.java.ds.stack;

public class Application {

    public static void main(String[] args) {
        System.out.println("Minha Stack ====");
        Stack<String> minhasPalavras = new StackAdaCielo<>();
        minhasPalavras.push("casa");
        minhasPalavras.push("aula");
        minhasPalavras.push("palavra");
        System.out.println(minhasPalavras.pop());
        System.out.println(minhasPalavras.top());
        System.out.println(minhasPalavras.size());
        minhasPalavras.pop();
        minhasPalavras.pop();
        System.out.println(minhasPalavras.isEmpty());
        System.out.println("Java Stack ====");
        java.util.Stack<String> palavras = new java.util.Stack<>();
        palavras.push("casa");
        palavras.push("aula");
        palavras.push("palavra");
        System.out.println(palavras.pop());
        System.out.println(palavras.peek());
        System.out.println(palavras.size());
        palavras.pop();
        palavras.pop();
        System.out.println(palavras.isEmpty());
    }
}
