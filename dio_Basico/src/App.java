import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int numero;
        String agencia;
        String nomecliente;
        float saldo;

        System.out.println("digite o numero da conta ");
        numero = scan.nextInt();
        System.out.println("digite a agencia ");
        agencia = scan.next();
        System.out.println("digite seu nome ");
        nomecliente = scan.next();
        System.out.println("digite seu saldo ");
        saldo = scan.nextFloat();

        System.out.println("óla " + nomecliente + " obrigado por criar uma conta em nosso banco," +
                "sua agência é " + agencia + " conta " + numero + " seu saldo " + saldo
                + " já está disponível para saque");
    }

}
