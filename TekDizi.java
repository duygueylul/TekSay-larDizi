package TekSayılarDizi;
import java.util.Scanner;

public class TekDizi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int s = 0;
		int array[] = new int [10];
		int tek_dizi[] = new int[10];
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Dizinin " + (i + 1) + ". elemanını giriniz: ");
			array[i] = scan.nextInt();
			if(array[i] % 2 == 1) {
				tek_dizi[s] = array[i];
				s++;
			}
		}
		System.out.println("Tek Sayılar\n");
		for(int i = 0; i < s; i++) {
			System.out.println("Tek Sayılar: " + tek_dizi[i]);
		}
			
		
		
	}

}
