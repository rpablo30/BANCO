import java.util.Scanner;

public class TesteBanco {

	public static void main(String[] args) {
		
		
		ContaCorrente CC = new ContaCorrente();
		
		CC.numConta = 3004 ;
		CC.agencia = 1234;
		CC.saldo = 100;
		CC.cliente = "Rodrigo Pablo";
		
		Scanner teclado = new Scanner(System.in);
		System.out.printf("Digite%n[1] Verificar saldo %n[2] Depositar %n[3] Sacar%n");
		int menu;
		menu=teclado.nextInt();
		
		
		switch(menu) {
		
		case 1 : System.out.println("Tem certeza que você quer verificar o saldo? ");break;
		case 2 : System.out.println("Depositar.");break;
		case 3 : System.out.println("Digite o nome do titular da conta: ");
		Scanner scan = new Scanner(System.in);
		String nome = scan.nextLine();
		System.out.println("Digite a sua agência.");
		int agencia = teclado.nextInt();
		System.out.println("Digite o número da sua conta corrente:");
		int cc = teclado.nextInt();
		
		
		if(nome.equals(CC.cliente) && cc==(CC.numConta) && agencia==(CC.agencia)) {
			System.out.printf("Bem vindo,%s.%n",CC.cliente);
			System.out.printf("Saldo em conta é: %s , ",CC.saldo);
			System.out.println("Qual o valor que você quer sacar ? : ");
			
		} 
		else {
			System.out.println("Verifique se os dados estão corretos ou Abra uma conta conosco.");
		}
		
		
		
		}
		
		
		/*Scanner nome = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		CC.cliente=nome.nextLine();
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o número da sua conta.");
		CC.numConta=teclado.nextInt();
		
		*/
		
		
	

	}
}