import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EasyEvents {
	private static String nome;
	private static int idade;
	private static char sexo;
	
	public static void main (String []args) {
		try (Scanner Leitura = new Scanner (System.in)) {
			do{
				System.out.println("Digite seu nome ");
				nome= Leitura.nextLine();
			}while(nome.length()< 2 || nome.length() > 30);
			
			do{
				System.out.println("Digite sua Idade ");
				idade = Leitura.nextInt();
			}while(idade <= 0 || idade >= 100);
		
			do{
				try {
				System.out.println("Digite seu sexo: F ou M");
				sexo = (char) System.in.read();
				} catch (IOException ex){
					Logger.getLogger(EasyEvents.class.getName()).log(Level.SEVERE, null, ex);
				}
				}while(sexo != 'F' && sexo != 'M');
		}
				
		System.out.println("\nNome:" + nome);
		System.out.println("Idade:" + idade);
		System.out.println("Sexo:" + sexo);
	}}