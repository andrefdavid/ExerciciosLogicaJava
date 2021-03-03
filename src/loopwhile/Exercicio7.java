package loopwhile;

import java.util.Scanner;

public class Exercicio7 {
/*No parque Valter Dino World, os clientes podem ter a chance de passar uma noite no castelo da princesa Javarella. Para isso, devem acertar quantos feijões estão em um jarro (1238). Faça um programa que solicite a digitação da quantidade de feijões até que um cliente acerte.*/
	public static void main(String[] args) {
		//Para solicitarmos que o usuário digite um dado pelo teclado, será necessário criarmos um Scanner. A linha abaixo cria um Scanner chamado "leitor" (lembre-se que a linha import java.util.Scanner; deve estar presente no início desse arquivo)
		Scanner leitor = new Scanner(System.in);
		//Para recebermos o número de feijões informados pelo usuário, devemos criar uma variável do tipo int (números inteiros). Essa variável será usada em uma condição antes mesmo de o usuário digitar algo e, por essa razão, vamos iniciá-la com o valor 0 (zero)
		int qtdeFeijoes = 0;
		
		//Nosso programa exige que o usuário digite uma nova quantidade até acertar. Temos, portanto, uma REPETIÇÃO que podemos solucionar com um loop While, estabelecendo como condição que a qtdeFeijoes seja diferente de 1238 para o loop rodar. Dessa forma, quando o usuário digitar 1238, o loop não será mais executado.
		while (qtdeFeijoes!=1238) {
			//Aqui devemos escrever o que deve ocorrer enquanto o usuário ainda não tiver digitado a senha 1238. No nosso caso, devemos solicitar que ele digite a quantidade
			System.out.println("Por favor, informe quantos feijões estão dentro do jarro: ");
			qtdeFeijoes = leitor.nextInt();
		}
		
		//Todas as instruções a partir daqui só serão executadas quando o loop for encerrado. Podemos incluir aqui nossa mensagem de parabéns ao usuário
		System.out.println("Parabéns! O jarro tinha exatamente 1238 feijões! Você pode passar uma noite no castelo da Javarella!");
		
		leitor.close();

	}

}
