import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
	     Scanner entrada = new Scanner(System.in);

	     char sexo = 'N';
	     float altura, peso, pesoIdeal = 0;

	        // Abrindo campo de digitação para o Sexo
	     System.out.println("Digite seu Sexo: (Digite F - Feminino ou M - Masculino) ");
	     sexo = (entrada.next()).charAt(0);

	        // Abrindo campo de digitação para o peso
	     System.out.println("Digite seu Peso: ");
	     peso = entrada.nextFloat();

	        // Abrindo campo de digitação para o altura
	     System.out.println("Digite sua Altura : ");
	     altura = entrada.nextFloat();

	     if (sexo == 'M' || sexo == 'm') {
	    	 pesoIdeal = (float) ((72.7 * altura) - 58);
	     }
	     else if (sexo == 'F' || sexo == 'f') {
	    	 pesoIdeal = (float) ((62.1 * altura) - 44.7);
	     } 
	     else {
	    	 System.out.println("Esse sexo  não existe digite novamente: ");
	         sexo = (entrada.next()).charAt(0);
	     }

	     System.out.println("Seu sexo é " + sexo + "\n"
	                + "Sua altrura é " + altura + "\n"
	                + "Seu peso é " + peso+"\n");
	        
	        
	     if (pesoIdeal > peso) {
	         System.out.println("Você esta abaixo do peso ideal que seria:  " + pesoIdeal);
	     }
	     else if (pesoIdeal < peso) {
	         System.out.println("Você esta acima do peso ideal que seria:  " + pesoIdeal);
	     }
	     else{
	    	 System.out.println("Você esta no peso ideal!");
	     }

	}

}
