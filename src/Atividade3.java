import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor, valorAtualizado; 
		System.out.print("Valor para sacar: ");
		valor = entrada.nextInt();
		
		if(valor<10 || valor>600) {
			System.out.println("Quantia Maxima ultrapassada");
		}else {
			
			valorAtualizado=valor;
			//int n200=0;
			int n100=0;
			int n50=0;
			//int n20=0;
			int n10=0;
			int n5=0;
			
			/*if (valorAtualizado >= 200) {
				n200 = (valorAtualizado / 200);
				valorAtualizado = valorAtualizado- (n200 * 200);
				
			}*/
			
			if (valorAtualizado >= 100) {
				n100 = (valorAtualizado / 100);
				valorAtualizado = valorAtualizado- (n100 * 100);
				
			}
			if (valorAtualizado >= 50) {
				n50 = (valorAtualizado / 50);
				valorAtualizado = valorAtualizado- (n50 * 50);
				
			}
			
			/*
			if (valorAtualizado >= 20) {
				n20 = (valorAtualizado / 20);
				valorAtualizado = valorAtualizado- (n20 * 20);
				
			}*/
			
			if (valorAtualizado >= 10) {
				n10 = (valorAtualizado / 10);
				valorAtualizado = valorAtualizado- (n10 * 10);
				
			}
			if (valorAtualizado >= 5) {
				n5 = (valorAtualizado / 5);
				valorAtualizado = valorAtualizado-(n5 * 5);
				
			}
			
			System.out.println(""
					//+"Nota de R$ 200 - "+n200
					+ "\n"+"Nota de R$ 100 - "+n100
					+ "\n"+"Nota de R$ 50 - "+n50
					//+ "\n"+"Nota de R$ 20 - "+n20
					+ "\n"+"Nota de R$ 10 - "+n10
					+ "\n"+"Nota de R$ 5 - "+n5
					+ "\n"+"Nota de R$ 1 - "+valorAtualizado);
			
			
		}

	}

}
