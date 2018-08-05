package PrviZadatak;

public class Fje{


 public void sabiranje(int a, int b) {
	 System.out.println(a+b);
 }
 
 public void oduzimanje(int a, int b) {
	 System.out.println(a-b);
 }
 
 public static void mnozenje(int a, int b) {
	 System.out.println(a*b);
 }

 public void dijeljenje(int a, int b) {
	 System.out.println(a/b);
 }
 public void korijenovanje(int a) {
	 System.out.println(Math.sqrt(a));
 }
 public void kvadriranje(int a){
	 System.out.println(a*a);
 } 
	 
	 
	 public static void main(String[] args) {
			mnozenje(3,9);
	 }
 }