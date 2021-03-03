package loopwhile;

import java.util.Scanner;

public class Exercicio8 {
/*Um professor quer saber quantos alunos de uma sala de 50 tiveram nota maior do que a média. Faça um programa onde o professor informe a média e as notas de cada um dos 50 alunos e, ao final, seja exibido quantos alunos tiveram nota superior à média e quantos tiveram nota inferior à média.*/
	public static void main(String[] args) {
		//Para solicitarmos que o usuário digite um dado pelo teclado, será necessário criarmos um Scanner. A linha abaixo cria um Scanner chamado "leitor" (lembre-se que a linha import java.util.Scanner; deve estar presente no início desse arquivo)
		Scanner leitor = new Scanner(System.in);
		//Nosso enunciado exige que o professor digite a média da sala, portanto criaremos uma variável chamada media que seja do tipo double
		double media;
		//Além disso, ao longo do programa o professor deverá digitar uma nota para cada aluno. Vamos criar uma variável chamada nota, também do tipo double
		double nota;
		//Por fim, nosso programa quer calcular quantas notas foram superiores à média e quantas foram inferiores. Vamos criar duas variáveis para essa finalidade: totalInferior, totalSuperior
		int totalInferior=0, totalSuperior=0;
		//Para controlarmos quantas vezes pediremos ao professor que digite as notas (50), vamos criar uma variável que servirá para controlar as voltas do nosso loop. Chamaremos essa variável de i
		int i = 0;
		
		//Agora é preciso solicitar que o professor digite a média da turma
		System.out.println("Por favor, informe a média de notas dessa turma: ");
		media = leitor.nextDouble();
		
		//Para solicitarmos as 50 notas dos alunos, usaremos um loop. Como condição, verificaremos se a variável i é menor do que 50 e a cada volta do loop somaremos 1 nessa variável. Com essa lógica, garantiremos que as instruções serão executadas 50 vezes
		while (i<50) {
			//Em cada uma das 50 vezes que o loop for executado, solicitaremos que o professor digite a nota. É importante ressaltar que a instrução (i+1) não altera o valor da variável i e apenas funcionará para a EXIBIÇÃO
			System.out.println("Por favor, informe a nota do " + (i+1) + "º aluno");
			nota= leitor.nextDouble();
			
			//Com a nota digitada, precisamos verificar se ela é superior ou inferior à média. Para isso, usaremos o nosso conhecido if
			if (nota>=media) {
				//Caso a condição seja verdadeira, vamos somar 1 na variável totalSuperior
				totalSuperior = totalSuperior + 1;
			}else {
				//Caso a condição seja falsa, vamos somar 1 na variável totalInferior
				totalInferior = totalInferior + 1;
			}
			
			//Ao final do nosso loop, precisamos incrementar a variável i para garantir que ela, futuramente, chegue ao valor 50 e o loop termine. Faremos isso somando 1 nessa variável. Além da notação i = i + 1, podemos usar também i++ ou i+=1
			i++;
		}
		//Uma vez que nosso loop for encerrado e já tivermos lido todas as 50 notas, além de verificado quais estão acima da média e quais estão abaixo, precisamos exibir a informação final para nosso usuário
		System.out.println("Para a turma informada, um total de " + totalSuperior + " alunos obtiveram nota igual ou acima da média, enquanto um total de " + totalInferior + " alunos obtiveram nota abaixo da média.");
		
		leitor.close();

	}

}
