package basicos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02Alternativo {
/*Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos,
solicite ao usuário que digite o tempo de um filme em minutos e informe a duração
desse filme em horas e em segundos.*/
	public static void main(String[] args) {
		//Para solicitarmos que o usuário digite um dado pelo teclado, será necessário criarmos um Scanner. A linha abaixo cria um Scanner chamado "leitor" (lembre-se que a linha import java.util.Scanner; deve estar presente no início desse arquivo)
		Scanner leitor = new Scanner(System.in);
		
		//Agora precisamos criar as variáveis para armazenarmos o tempo do filme em minutos (será digitado pelo usuário), em horas (será calculado pelo programa) e em segundos. O cálculo em horas pode gerar um número com casas decimais, por conta da divisão. Então criaremos as variáveis para minutos e segundos como do tipo int e a variável para as horas como do tipo double.
		int minutos, segundos;
		double horas;
		
		//Para orientar o usuário, podemos exibir mensagens através do comando System.out.println, colocando entre parênteses uma mensagem de texto
		System.out.println("Esse programa recebe a duração de um filme em minutos e exibe a conversão para horas e para segundos");
		System.out.println("Por favor, informe a duração do filme em minutos");
		
		//Para armazenarmos em uma variável a duração que o usuário digitar, devemos usar o Scanner. Como estamos tratando de números inteiros, o Scanner deve usar o método nextInt()
		minutos = leitor.nextInt();
		
		//A conversão de minutos para segundos é feita multiplicando os minutos por 60
		segundos = minutos * 60;
		
		//A conversão de minutos para horas é feita dividindo os minutos por 60. Se fizermos a divisão por 60, o java entenderá que o resultado deve ser um número inteiro. Para garantirmos que o resultado seja um double, colocamos um .0 ao lado do 60 para que ele seja considerado um número com casas decimais
		horas = minutos / 60.0;
		
		//Para exibirmos o resultado final dos segundos, podemos utilizar o System.out.println(), colocando o nome da variável segundos fora das aspas para que seu conteúdo seja exibido
		System.out.println("A duração desse filme é de " + segundos + " segundos");

		
	
		//Para exibirmos nosso resultado considerando apenas 2 casas decimais, podemos utilizar o DecimalFormat (É necessário importar java.text.DecimalFormat;). Com ele podemos definir a formatação do número desejado. Indicando #.00, por exemplo, todos os números da parte inteira serão exibidos, mas apenas dois números da parte decimal
		DecimalFormat formatador = new DecimalFormat("#.00");

		//por fim, usamos nosso formatador de números para a variável Horas, escrevendo o nome que demos para ele (formatador) e usando o método .format(), indicando a variável entre parênteses
		System.out.println("A duração desse filme é de " + formatador.format(horas) + " horas");
		
		
		leitor.close();

	}

}
