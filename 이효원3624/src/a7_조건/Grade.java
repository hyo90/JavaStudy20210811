package a7_����;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// Scanner�� ���� ǥ�� �Է�
		// grade ���� ���ڿ��� ����
		// ������ �Է����ּ���(A ~ F) : ���ڿ� �Է�
		// if(A��� true) {�л��� ������ 90 ~ 100�� �� �ϴ�.}
		// else if (B���  true) {�л��� ������ 80 ~ 89�� �Դϴ�.} 
		// .... 
		// ~ F����
		// else{ A ~ F ������ �Է��� �� �ֽ��ϴ�.}
				
		Scanner input = new Scanner (System.in);
		System.out.print("������ �Է����ּ���(A ~ F) : ");
		
		String grade = input.nextLine();   
		if (grade.equals("A") || grade.equals("a")) {
			System.out.println("�л��� ������ 90 ~ 100���Դϴ�.");}
		 else if (grade.equals("B") || grade.equals("b")) {
			System.out.println("�л��� ������ 80 ~ 89�� �Դϴ�.");}
		 else if (grade.equals("C") || grade.equals("c")) {
			System.out.println("�л��� ������ 70 ~ 79�� �Դϴ�.");}
		 else if (grade.equals("D") || grade.equals("d")) {
				System.out.println("�л��� ������ 60 ~ 69�� �Դϴ�.");}
		 else if (grade.equals("E") || grade.equals("e")) {
				System.out.println("�л��� ������ 50 ~ 59�� �Դϴ�.");}
		 else if (grade.equals("F") || grade.equals("f")) {
				System.out.println("�л��� ������ 40 ~ 49�� �Դϴ�.");}
		 else {System.out.println("A ~ F ������ �Է��� �� �ֽ��ϴ�");}
					
}}
		
		   
		   

