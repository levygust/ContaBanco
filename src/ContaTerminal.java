        import java.util.Scanner;

        public class ContaTerminal {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                               
                System.out.println("Por favor, digite o nome do cliente!");
                String nomeCliente = sc.nextLine(); 
                  
        
                System.out.println("Por favor, digite a agência!");
                String agencia = sc.nextLine();
        
                System.out.println("Por favor, digite o número da conta!");
                int numero = sc.nextInt();
                //clearBuffer(sc);
                
               
                System.out.println("Por favor, digite o saldo!");
                Double saldo = sc.nextDouble();
                
        
                System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
                            
                        
                sc.close();
    }
}
