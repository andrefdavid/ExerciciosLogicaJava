package loopfor;

import java.util.Scanner;

public class Exercicio10 {
/*Antes da pandemia, o rodízio na cidade de São Paulo foi motivo de confusão em uma empresa: muitos dos 150 colaboradores estão se atrasando e alegando que o problema foi o horário do rodízio. Cansado disso, um dos diretores da empresa solicitou um programa que receba o NOME de cada um dos funcionários, o SETOR desses profissionais e o meio de transporte usado (CARRO ou ÔNIBUS).
Caso o profissional use um CARRO para ir até a empresa, deve ser solicitada a digitação do último dígito numérico da placa do carro e a mensagem exibida deve ser: “Seu dia de rodízio é “ seguida do dia de rodízio.
Caso o profissional use um ÔNIBUS para ir até a empresa, deve ser exibida a mensagem “rodízio não se aplica”.*/
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//Para receber os dados digitados pelo usuário, precisaremos criar uma variável do tipo String chamada nome e outra do tipo String chamada setor. 
		String nome, setor;
		//Para o meio de transporte, podemos optar por criar uma variável String, supondo que o usuário digite CARRO ou ÔNIBUS ou uma variável do tipo int, se quisermos que ele digite 1 para carro e 2 para onibus. Será necessário criar também uma variável para armazenar o último dígito da placa.
		int meioDeTransporte, placa;
		
		//O programa pede que a digitação seja feita para 150 funcionários, portanto criaremos um loop que execute 150 vezes
		for(int i=1;i<=150;i++) {
			//Para cada execução desse loop devemos, primeiro, solicitar o nome e o setor do funcionário
			System.out.println("Por favor, informe o nome do " + i + "º funcionário");
			nome = leitor.next();
			System.out.println("Por favor, informe o setor do " + i + "º funcionário");
			setor = leitor.next();
			
			//Agora precisamos solicitar o meio de transporte
			System.out.println("Digite 1 se o funcionário utiliza o CARRO e 2 se o funcionário utiliza ÔNIBUS");
			meioDeTransporte = leitor.nextInt();
			
			//Antes de solicitar a placa, precisamos verificar qual o meio de transporte escolhido. Isso pode ser feito através de um if ou de um switch. Optaremos aqui pelo if para que esse exercício contenha os exemplos das duas estruturas
			if(meioDeTransporte == 1) {
				//Caso o funcionário utilize o carro, precisamos solicitar a placa do mesmo e verificar em qual dia da semana ela se encaixa.
				System.out.println("Por favor, informe o último dígito da placa do carro do funcionário");
				placa = leitor.nextInt();
				
				//Para verificar a placa, optaremos pelo switch para que o exercício contenha os dois exemplos das estruturas
				switch(placa) {
				case 1: //Não vamos colocar nenhuma instrução no case 1, nem o break, pois queremos que as mesmas instruções do case 2 sejam aplicadas caso a placa seja 1 também
				case 2:
					System.out.println("Atenção, " + nome + " do setor "+ setor + ", seu dia de rodízio é segunda-feira");
					break;
				case 3:
				case 4:
					System.out.println("Atenção, " + nome + " do setor "+ setor + ", seu dia de rodízio é terça-feira");
					break;
				case 5:
				case 6:
					System.out.println("Atenção, " + nome + " do setor "+ setor + ", seu dia de rodízio é quarta-feira");
					break;
				case 7:
				case 8:
					System.out.println("Atenção, " + nome + " do setor "+ setor + ", seu dia de rodízio é quinta-feira");
					break;
				case 9:
				case 0:
					System.out.println("Atenção, " + nome + " do setor "+ setor + ", seu dia de rodízio é sexta-feira");
					break;
				}
			}else {
				//Caso o funcionário não tenha escolhido a opção 1, vamos verificar se escolheu a opção 2
				if (meioDeTransporte ==2) {
					//Caso a escolha tenha sido a opção dois, exibiremos a mensagem referente ao transporte de onibus
					System.out.println("Atenção, " + nome + " do setor "+ setor + ", o rodízio municipal não se aplica ao transporte de onibus");
					
				}else {
					//Caso a escolha não tenha sido 1 ou 2, exibiremos uma mensagem de erro
					System.out.println("Meio de transporte inválido");
				}
			}
		}
		leitor.close();

	}

}
