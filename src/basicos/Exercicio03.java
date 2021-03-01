package basicos;

import java.util.Scanner;

public class Exercicio03 {
/*Solicite ao usuário a digitação de 2 números inteiros, nas variáveis A e B. Sem usar uma terceira variável, troque os valores de A e B entre si.*/
	public static void main(String[] args) {
		//Para solicitarmos que o usuário digite um dado pelo teclado, será necessário criarmos um Scanner. A linha abaixo cria um Scanner chamado "leitor" (lembre-se que a linha import java.util.Scanner; deve estar presente no início desse arquivo)
		Scanner leitor = new Scanner(System.in);
		//Para recebermos os valores das variáveis A e B, duas variáveos do tipo int, que guarda números inteiros. 
		int a, b;
		
		//Para orientar o usuário, podemos exibir mensagens através do comando System.out.println, colocando entre parênteses uma mensagem de texto
		System.out.println("Receberá 2 valores numéricos e inverterá entre si as variáveis que armazenam esses valores ");
		System.out.println("Por favor, digite um número inteiro para ser armazenado na variável A: ");
		
		//Devemos utilizar o Scanner para ler a entrada do usuário e armazenar essa entrada na variável a. Como a é do tipo int, o scanner deve usar o método nextInt()
		a = leitor.nextInt();
		
		System.out.println("Por favor, digite um número inteiro para ser armazenado na variável B: ");
		b = leitor.nextInt();
		
		
		//Para realizarmos a inversão sem a ajuda de outras variáveis, podemos utilizar a matemática. Basta somarmos as duas variáveis e armazenarmos o resultado na variável A (dessa forma, o número armazenado nessa variável representará a soma das duas). 
		a = a + b;
		//Na sequência devemos armazenar na variável B o resultado da subtração entre a nova variável A (que contém a soma dos dois) e o valor da variável B. Dessa maneira, o que restará na variável B é o valor original da variável A
		b = a - b;
		//Por fim, armazenamos na variável A a subtração entre o valor atual da variável A (que ainda contém a soma dos dois valores) e o valor atual da variável B(que, agora, contém o valor original da variável A). O que restará, portanto, é o valor original da variável B
		a = a - b;
		
		//Nos resta apenas exibir os valores invertidos
		System.out.println("Agora a variável A contém o valor: " + a);
		System.out.println("Agora a variável B contém o valor: " + b);
	
		leitor.close();
	}

}
