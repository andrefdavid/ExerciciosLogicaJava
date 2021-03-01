package desvios;

import java.util.Scanner;

public class Exercicio06 {
/*Uma loja oferece um desconto de 3% aos clientes que tiverem o cupom “DIADEFESTA”. Faça um programa onde o funcionário digite o valor da compra e um cupom, informando o valor final a ser pago.*/
	public static void main(String[] args) {
		//Para solicitarmos que o usuário digite um dado pelo teclado, será necessário criarmos um Scanner. A linha abaixo cria um Scanner chamado "leitor" (lembre-se que a linha import java.util.Scanner; deve estar presente no início desse arquivo)
		Scanner leitor = new Scanner(System.in);
		
		//Para recebermos o valor total da compra, vamos criar uma variável double, que armazena valores com casas decimais. Criaremos também uma variável chamada valorFinal para armazenarmos o valor com o desconto
		double totalCompra, valorFinal;
		
		//Para recebermos o cupom de desconto, vamos criar uma variável String, que armazena valores de texto
		String cupom;
		
		//Para orientar o usuário, podemos exibir mensagens através do comando System.out.println, colocando entre parênteses uma mensagem de texto
		System.out.println("Sistema de vendas da JavaShop");
		System.out.println("Por favor, informe o total da compra do cliente: ");
		
		//Devemos utilizar o Scanner para ler a entrada do usuário e armazenar essa entrada na variável totalCompra. Como totalCompra é do tipo double, o scanner deve usar o método nextDouble()
		totalCompra = leitor.nextDouble();
		
		System.out.println("Por favor, informe o cupom do desconto do cliente: ");
		//Devemos utilizar o Scanner para ler a entrada do usuário e armazenar essa entrada na variável cupom. Como cupom é do tipo String, o scanner deve usar o método next()
		cupom = leitor.next();
		
		//Agora é preciso validar se o usuário digitou o cupom correto. Utilizaremos um if com a condição cupom.equals("DIADEFESTA") para verificarmos se o usuário digitou o cupom "DIADEFESTA"
		if (cupom.equals("DIADEFESTA")) {
			//Essa é a parte do if que será executada caso a condição seja verdadeira, ou seja, caso a variável cupom contenha o texto DIADEFESTA
			valorFinal = totalCompra * 0.97; //0.97 corresponde a três por cento de desconto, uma vez que multiplicar por 1 é o mesmo que considerar 100% (totalidade) de algo
		}else {
			//Essa é a parte do if que será executada caso a condição seja falsa, ou seja, caso a variável cupom não contenha o texto DIADEFESTA
			valorFinal = totalCompra;
		}
		
		System.out.println("Com o uso do cupom " + cupom + ", sua compra que tinha o valor de R$" + totalCompra + " agora tem o valor final de R$" + valorFinal);
		
		leitor.close();


	}

}
