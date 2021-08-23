package practice;
import java.util.Scanner;
public class Quiz_1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 String str = sc.nextLine();
		 String str2 = sc.nextLine();
		 
		 int a = Integer.parseInt(str); //Çüº¯È¯
		 int b = Integer.parseInt(str2);
		 
		 
		 if(a > b) {
			 System.out.println('>');
		 }
		 else if (a < b) {
			 System.out.println('<');
		 }
		 else {
		 	 System.out.println('=');
		 }
		 
	}
	 
		


