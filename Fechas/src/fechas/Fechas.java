package fechas;
import java.util.Scanner;

public class Fechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);// este imprime
		
		System.out.printf("Ingrese la primera fecha de la siguiente forma DD/MM/AAAA\n");
        String fecha1 = sc.nextLine();
        
		 System.out.printf("Ingrese la segunda fecha de la siguiente forma DD/MM/AAAA\n");
	     String fecha2 = sc.nextLine();
	   

	     int dia1 = Integer.parseInt(fecha1.substring(0,2));
	     
	     int mes1 = Integer.parseInt(fecha1.substring(3,5));
	     
	     int anio1 = Integer.parseInt(fecha1.substring(6));
	     
	     
	     int dia2 = Integer.parseInt(fecha2.substring(0,2));
	     
	     int mes2 = Integer.parseInt(fecha2.substring(3,5));
	     
	     int anio2 = Integer.parseInt(fecha2.substring(6));
	     
	    // System.out.println(dia1);
	     //System.out.println(mes1);
	     //System.out.println(anio1);
	     //System.out.println(dia2);
	     //System.out.println(mes2);
	     //System.out.println(anio2);
	     
	     if(anio1 > anio2) { //a o1 mayor que a o 2, persona1 naci  despu s.
			System.out.printf("Persona 1 es mayor.\n");
		}
		else if (anio1 < anio2) {
			System.out.printf("Persona 2 es mayor.\n");
				
		}
		else if (mes1 > mes2) { //y a o1 es igual que a o2, mes1 mayor que mes2
	 		System.out.printf("Persona 2 es mayor.\n");
	 	}
	     else if (mes1 < mes2) {
		 	System.out.printf("Persona 1 es mayor.\n");
	     }
	 	else if (dia1 > dia2) { // y mes1 es igual que mes2 y a o 1 es igual a a o2 y d a 1 mayor a d a 2
	 		System.out.printf("Persona 2 es mayor.\n");
		}
		else if (dia1 < dia2) { //todos iguales, pero d a1 es menor a d a 2, significa persona 1 naci  antes.
			System.out.printf("Persona 1 es mayor.\n");
		}
		else { //todo igual implica que tienen misma edad.
			System.out.printf("Tienen la misma edad.\n");
		}
	     sc.close();  //debe ir fuera del main
			
	
	}	
	
}


