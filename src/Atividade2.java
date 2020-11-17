import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		float salario= 0, aumento = 0;
		int percentualAumento=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu Salario: ");
		salario= entrada.nextFloat();
		
		if(salario <= 280 ) {
			aumento = (float)(salario*0.2);
			percentualAumento = 20;
		}
		else if(salario > 280 && salario <= 700) {
			aumento = (float)(salario*0.15);
			percentualAumento = 15;
		}
		else if(salario > 700 && salario <= 1500) {
			aumento = (float)(salario*0.10);
			percentualAumento = 10;
		}
		else {
			aumento = (float)(salario*0.05);
			percentualAumento = 5;
		}
		
		System.out.println("---------------"
				+ "\nSeu salario: "+salario
				+ "\nSeu percentual de aumento foi: "+percentualAumento + "%"
				+ "\nAumento: "+aumento
				+ "\nSeu novo salario: "+ (salario+aumento)+" \n"
				);
		

	}

}
