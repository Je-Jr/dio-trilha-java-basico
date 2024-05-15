    import java.util.Scanner;

    public class ContaTerminal {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Por favor, informe seu nome:");
            String nome = input.nextLine();
            System.out.println("Por favor, informe a agência:");
            String agencia = input.nextLine();
            System.out.println("Por favor, informe o número da conta:");
            int numero = input.nextInt();
            System.out.println("Por favor, informe o saldo:");
            double saldo = input.nextDouble();


            String texto = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque", nome, agencia, numero, saldo);

            System.out.println(texto);
            input.close();

        }
    }