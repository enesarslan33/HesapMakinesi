package hesapMakinesi;

import java.util.Scanner;

public class Main {

	/*
	 * Method overloading kullanarak bir tane hesap makinesi tasarlama yapımı ve
	 * toplama çarpma metodlarını 2 veya3 paremetre olacak şekile tasarlama yapacaz
	 */

	public static int cıkarma(int a, int b) {
		return (a - b);

	}

	public static double bölme(int a, int b) {
		return ((double) a / b);

	}

	public static int toplama(int a, int b) {
		return (a + b);

	}

	public static int toplama(int a, int b, int c) {
		return (a + b + c);
	}

	public static int çarpma(int a, int b) {
		return (a * b);

	}

	public static int çarpma(int a, int b, int c) {
		return (a * b * c);
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String işlemler = "1. Toplama İşlemi\n"
			                   + "2. Çıkarma İşlemi\n"
				               + "3. Çarpma İşlemi\n"
			                   + "4. Bölme İşlemi\n"
					           + "Çıkış olarak q'ye basın.";
			
			System.out.println("...................................");
			System.out.println(işlemler);
			System.out.println("...................................");
			while (true) {
				System.out.print("İşlemi Seçiniz : ");
				String işlem = scanner.nextLine();
				if (işlem.equals("q"))
				{

					System.out.println("programdan çıkılıyor..");
					break;
					
				} 
				else if (işlem.equals("1")) {
					
				System.out.println("Kaç Değer Toplayacaksınız? (2 veya 3) : ");
        
				int kacsayi = scanner.nextInt();

				if (kacsayi == 2) {
					System.out.println("a:");
					int a = scanner.nextInt();
					System.out.println("b:");
					int b = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Girilen Sayıların Toplamları :" + (toplama(a, b)));
					

				} 
				else if (kacsayi == 3) 
				{
					System.out.println("a:");
					int a = scanner.nextInt();
					System.out.println("b:");
					int b = scanner.nextInt();
					System.out.println("c:");
					int c = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Girilen Sayıların Toplamları :" + (toplama(a, b, c)));

				} 
				else {

					System.out.println("Bunun İçin Uygun Metod Bulunmuyor...");
				}
				}
				else if (işlem.equals("2")) {
					System.out.println("a:");
					int a = scanner.nextInt();
					System.out.println("b:");
					int b = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Girilen Sayıların Farkları : " + cıkarma(a,b));
							
				

			}
			
				else if (işlem.equals("3")) {
				
				System.out.println("Kaç Değer Çarpacaksınız? (2 veya 3) : ");

				int kaçsayi = scanner.nextInt();

				if (kaçsayi == 2) {
					System.out.println("a:");
					int a = scanner.nextInt();
					System.out.println("b:");
					int b = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Girilen Sayıların Çarpımları :" + (çarpma(a , b)));

				} else if (kaçsayi == 3) {
					System.out.println("a:");
					int a = scanner.nextInt();
					System.out.println("b:");
					int b = scanner.nextInt();
					System.out.println("c:");
					int c = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Girilen Sayıların Çarpımları :" + (çarpma(a, b, c)));

					
					

				} else {

					System.out.println("Bunun İçin Uygun Metod Bulunmuyor...");
				
			}
			
			
				
				
			}
				else if(işlem.equals("4")) {
					System.out.println("a:");
					int a = scanner.nextInt();
					System.out.println("b:");
					int b = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Girilen Sayıların Bölümü : " + bölme(a,b));
							
					
				}
			
				else {
					System.out.println("Geçersiz İşlem...");
				}
			

}
		}
	

	}
}
