package loopwhile;

import java.util.Scanner;

/*Para uma sequência matemática onde cada elemento é calculado da seguinte forma:
1!/N! ; 2!/(N-1)!; 3!/(N-2)!; ... ; (N! / 1!)
Crie um programa onde o usuário digite a quantidade de elementos que deseja exibir e sejam exibidos os elementos da sequência.
*/
public class Exercicio9 {
	//Nosso problema apresenta uma série de problemas menores: precisamos calcular o fatorial do dividendo (número que será dividido), do divisor(número que dividirá), realizar a divisão e, além disso, controlar quantas divisões serão feitas. 
	//O cálculo do fatorial é feito multiplicando um número por todos os inteiros positivos anteriores a ele, até 1. Logo 5! é 5x4x3x2x1 e 10! é 10x9x8x7x6x5x4x3x2x1.
	//Para realizar o cálculo do fatorial de um valor qualquer, podemos contar com uma variável para o resultado que inicia valendo 1 e multiplica a si mesma pelo próximo valor, até chegar em no valor que desejamos calcular. Veja esse exemplo:
	/* i = 1;
	 * resultado = 1;
	 * while(i<valor){
	 * 	resultado = resultado * i;
	 *  i++;
	 * }
	 * */
	
	//No exemplo acima, supondo que a variável valor seja 5 e, portanto, que nosso desejo seja calcular o fatorial de 5, teremos as seguintes execuções do loop:
	/*1ª volta - resultado = 1 * 1
	 *2ª volta - resultado = 1 * 2
	 *3ª volta - resultado = 2 * 3
	 *4ª volta - resultado = 6 * 4
	 *5ª volta - resultado = 24 * 5 */
	//Quando o loop terminar, a variável resultado valerá 120, que é o fatorial de 5
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Para nossa sorte, o usuário só informará um único valor: n. N será usado para sabermos quantas divisões devemos realizar, mas também para avançarmos com o dividendo (que inicia em 1 e vai até N!) e retroceder com o divisor (que inicia em N! e vai até 1). Vamos criar, portanto, 6 variáveis: n, dividendo, divisor, sendo do tipo int e elemento, que representará o elemento calculado que será exibido e, por ser uma divisão, será do tipo double. Nossa 5ª variável será usada para controlar o número de voltas do nosso loop e nossa 6ª variável será usada para controlar o loop que calcula o fatorial. Ufa!
		int n, dividendo, divisor;
		double elemento;
		int i=0, iFatorial=1;
		
		//Primeiro vamos solicitar que o usuário informe n
		System.out.println("Por favor, informe quantos elementos da sequência deseja exibir: ");
		n = leitor.nextInt();
		
		//Para controlar a quantidade de elementos que precisamos calcular e exibir, vamos criar um loop que rode n vezes. Nossa condição, portanto, será i<n:
		while(i<n) {
			//Cada vez que esse loop executar, devemos calcular o dividendo, o divisor, realizar a divisão e exibir. Vamos iniciar calculando o dividendo (número de cima)
			dividendo = 1;
			iFatorial =1;
			while(iFatorial<=(i+1)) {
				//Esse loop será usado para calcular o fatorial do dividendo. Isso acontecerá fazendo a multiplicação do dividendo por iFatorial e armazenado o resultado em dividendo. 
				dividendo = dividendo * iFatorial;
				iFatorial = iFatorial + 1;
			}
			//Agora vamos calcular o fatorial do divisor. Isso acontecerá fazendo a multiplicação do divisor por IFatorial e armazenando o resultado em divisor
			iFatorial = n-i;
			divisor = 1;
			while (iFatorial>1) {
				divisor = divisor * iFatorial;
				iFatorial = iFatorial - 1;
			}
			
			//Quando chegarmos nesse ponto, já temos o nosso dividendo e nosso divisor calculados. Resta realizarmos a divisão entre eles, guardar na variável elemento e exibir:
			elemento = dividendo / (double) divisor;
			//Se você quiser verificar o valor do dividendo e do divisor a cada volta, pode remover o comentário (//) no início da linha 61 e colocar na linha 62
			//System.out.println(dividendo + "/" + divisor + "=" + elemento);
			System.out.print(elemento + ";");
			
			//Não podemos esquecer de incrementar a variável i para que nosso loop eventualmente se encerre
			i++;
		}
		leitor.close();
		
	}

}
