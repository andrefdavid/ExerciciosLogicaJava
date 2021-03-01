package basicos;

import java.util.Scanner;

public class Exercicio01 {
/*– Para um ano de nascimento fornecido pelo usuário, informe a idade que ele terá no
dia 31 de dezembro de 2021.
 * */
	public static void main(String[] args) {
		//Para solicitarmos que o usuário digite um dado pelo teclado, será necessário criarmos um Scanner. A linha abaixo cria um Scanner chamado "leitor" (lembre-se que a linha import java.util.Scanner; deve estar presente no início desse arquivo)
		Scanner leitor = new Scanner(System.in);
		//Para recebermos o ano de nascimento, criaremos uma variável do tipo int, que guarda números inteiros
		int anoNascimento;
		//Para armazenarmos o resultado do cálculo da idade do usuário, criaremos outra variável do tipo int
		int idade;
		
		//Para orientar o usuário, podemos exibir mensagens através do comando System.out.println, colocando entre parênteses uma mensagem de texto
		System.out.println("Esse programa calcula que idade você terá ao final do ano de 2021");
		System.out.println("Por favor, insira o seu ano de nascimento: ");
		
		//Devemos utilizar o Scanner para ler a entrada do usuário e armazenar essa entrada na variável anoNascimento. Como anoNascimento é do tipo int, o scanner deve usar o método nextInt()
		anoNascimento = leitor.nextInt();
		
		//Para realizarmos operações matemáticas utilizamos os operadores + (soma), - (subtração), / (divisão) e * (multiplicação)
		idade = 2021 - anoNascimento;
		
		//Podemos exibir o conteúdo da variável idade ao utilizarmos um System.out.println. Como queremos exibir o conteúdo da variável e não seu nome, ela não deve estar entre aspas
		System.out.println("Ao final de 2021 você terá " + idade + " anos!");
		
		//Ao final, é importante fechar o scanner e liberar esse recurso:
		leitor.close();
		
	}

}
