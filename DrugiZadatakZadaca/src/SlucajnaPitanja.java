import java.util.Random;

public class SlucajnaPitanja {
	
	public static void main(String [] args) {
	String[] pitanja = new String[10];
	pitanja[0]="Da li je dozovljeno dijelenje sa 0?";
	pitanja[1]="Da li je dozvoljena komutatuvnost u sabiranju?";
	pitanja[2]="Koje operacije cine kvadriranje?";
	pitanja[3]="Moze li duzina biti negativna";
	pitanja[4]="Sta je korijen negativnog broja";
	pitanja[5]="Sta je relani a sta imaginarni dio broja?";
	pitanja[6]="Ako jednom broju oduzmemo broj a drugom dodamo isti taj broj da li ce rezultat sabiranja biti isti";
	pitanja[7]="Ako jednom broju oduzmemo broj a drugom dodamo isti taj broj da li ce rezultat mnozenja biti isti";
	pitanja[8]="Ako jednom broju oduzmemo broj a drugom dodamo isti taj broj da li ce rezultat dijeljenja biti isti";
	pitanja[9]="Ako jednom broju oduzmemo broj a drugom dodamo isti taj broj da li ce rezultat oduzimanja biti isti?";
	
	int broj=0;
	while(broj!=10){
	Random r = new Random();
    int randint = Math.abs(r.nextInt()) % 11-1;
    System.out.println(pitanja[randint]);
    broj++;
  }
	}
	
	
	}


	


