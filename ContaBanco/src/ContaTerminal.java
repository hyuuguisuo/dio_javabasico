import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("=============== Banco ===============");
        System.out.println("~~ Seu dinheiro, nossa felicidade");
        System.out.println("--------------------------------------");

        System.out.println("Por favor, informe o número da Agência: \n");
        int numero = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Informe o nome da Agência: \n");
        String agencia = teclado.nextLine();

        System.out.println("Informe seu nome: \n");
        String nome = teclado.nextLine();

        System.out.println("Por fim, informe o valor do seu saldo: \n");
        double saldo = teclado.nextDouble();

        String msg = "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é ( " + agencia +" ), conta ( " + numero + " ) e seu saldo de ( R$"+ saldo + " ) já está disponível para saque.";

        System.out.println(msg);
    }
}
