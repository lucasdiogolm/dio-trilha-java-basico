import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {        
        Scanner ler = new Scanner(System.in);
        int Numero;
        String Agencia;
        String nomeCliente;
        double Saldo;

        System.out.printf("Informe o seu número: ");
        Numero = ler.nextInt();
        System.out.printf("Informe o número da sua agência: ");
        Agencia = ler.nextLine();
        System.out.printf("Informe o seu nome: ");
        nomeCliente = ler.nextLine();
        System.out.printf("Informe o seu saldo: ");
        Saldo = ler.nextDouble();

        System.out.println("Olá, "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+Numero+" e seu saldo "+Saldo+" já está disponível para saque.");




        

        
        //TODO: Conhecer e importar a classe Scanner


        

        // Exibir as mensagens para os nossos usuários

        // Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem da conta criada
    }
}
