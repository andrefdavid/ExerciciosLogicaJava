package desvios;

import java.util.Scanner;

public class Exercicio04 {
/*Um robô de combate só deve ativar sua arma principal quando o inimigo está a menos de 70cm de distância. Faça um programa onde o usuário informe a distância do inimigo e sejam exibidas as mensagens “ATIVADO” ou “DESATIVADO” dependendo do status da arma.
*/
	public static void main(String[] args) {
		//Para solicitarmos que o usuário digite um dado pelo teclado, será necessário criarmos um Scanner. A linha abaixo cria um Scanner chamado "leitor" (lembre-se que a linha import java.util.Scanner; deve estar presente no início desse arquivo)
		Scanner leitor = new Scanner(System.in);
		//Para recebermos a distância do inimigo, vamos criar uma variável do tipo double, que suporta números com casas decimais
		double distancia;
		
		
		//Para orientar o usuário, podemos exibir mensagens através do comando System.out.println, colocando entre parênteses uma mensagem de texto
		System.out.println("Esse programa simula um robô de combate");
		System.out.println("Por favor, informe a distância, em cm, do inimigo: ");
		
		//Devemos utilizar o Scanner para ler a entrada do usuário e armazenar essa entrada na variável distancia. Como distancia é do tipo double, o scanner deve usar o método nextDouble()
		distancia = leitor.nextDouble();
		
		
		//Para avaliarmos se as armas do robô devem ser ativadas ou não, precisamos avaliar se a distância é menor do que 70. Para avaliar essa condição, utilizaremos um if composto.
		if (distancia<70) {
			//Essa é a parte do if que será executada caso a condição seja verdadeira, ou seja, caso a distância seja menor do que 70
			System.out.println("ATIVADO");
		}else {
			//Essa é a parte do if que será executada caso a condição seja falsa, ou seja, caso a distância NÃO SEJA menor do que 70
			System.out.println("DESATIVADO");

		}
		leitor.close();

	}

}
