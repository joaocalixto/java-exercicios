import java.util.Scanner;

public class MainScanner {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite seu nome: ");

        // Esperando que o utilizar digite a proxima linha
        String name = keyboard.nextLine();
        System.out.println("Digite sua idade:");
        int idade = keyboard.nextInt();
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + idade);
    }
}
