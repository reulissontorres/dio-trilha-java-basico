import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Importar e usar a classe Scanner
        Scanner sc = new Scanner(System.in);
        
        //Exibir mensagens para orientar o usuário
        System.out.println("Por favor, digite o seu nome:");
        //Receber dados do usuário pelo terminal
        String nomeCliente = sc.nextLine();
        
        System.out.println("Por favor, digite o número da agência:");
        String agencia = sc.nextLine();
        
        System.out.println("Por favor, digite o número da conta:");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o saldo da sua conta:");
        double saldo = sc.nextDouble();

        sc.close();

        //Exibir informações sobre a conta do usuário
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.\n");
    }
}
