package exerciciocase;

import java.util.Scanner;
public class signo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int d,m;
	
		System.out.println("insira o dia em que você nasceu: ");
		d= ler.nextInt();
		
		System.out.println("insira o mês em que você nasceu: ");
		m= ler.nextInt();
		
		switch(m) {
		   case 1:
			   if ( d<=20 ) {
				   System.out.println("capricónio");
			
			   } else if ( d<=31)   {
				   System.out.println("aquário");
				  
			   }
		   break;
		   case 2:
			   if (d<=19 ) {
				   System.out.println("aquário");
			
			   } else if (d<=28) {
				   System.out.println("peixes");
			  
			   }
		   break;
		   case 3:
			   if (d<=20  ) {
				   System.out.println("peixes");
			
			   } else if (d<=31) {
				   System.out.println("áries");
			  
			   }
		   break;
		   case 4:
			   if (d<=21 ) {
				   System.out.println("áries");
			
			   } else if (d<=30) {
				   System.out.println("touro");
			  
			   }
		   break;
		   case 5:
			   if (d<=21 ) {
				   System.out.println("touro");
			
			   } else if (d<=31) {
				   System.out.println("gêmeos");
			  
			   }
		   break;
		   case 6:
			   if (d<=20 ) {
				   System.out.println("gêmeos");
			
			   } else if (d<=30) {
				   System.out.println("câncer");
			   
			   }
		   break;
		   case 7:
			   if (d<=21) {
				   System.out.println("câncer");
			
			   } else if (d<=31) {
				   System.out.println("leão");
			  
			   }
		   break;
		   case 8:
			   if (d<=22  ) {
				   System.out.println("leão");
			
			   } else if (d<=31) {
				   System.out.println("virgem");
			  
			   }
		   break;
		   case 9:
			   if (d<=22 ) {
				   System.out.println("virgem");
			
			   } else if (d<=30) {
				   System.out.println("libra");
			  
			   }
		   break;
		   case 10:
			   if (d<=10  ) {
				   System.out.println("libra");
			
			   } else  if (d<=31){
				   System.out.println("escorpião");
			   }
		   break;
		   case 11:
			   if (d<=21 ) {
				   System.out.println("escopião");
			
			   } else  if (d<=30){
				   System.out.println("sagitário");
			  
			   }
		   break;
		   case 12:
			   if (d<=22 ) {
				   System.out.println("sagitário");
			
			   } else if (d<=31){
				   System.out.println("capricórnio");
			  
			   }
		   break;
		   default:
			
			   System.out.println("data invalida");
		
			 ler.close();
		
		
	}
  }
}