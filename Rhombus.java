package no.com;
import java.util.Scanner;

public class Rhombus {
	
	public static void main(String[] args) {
		int row;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the row");
		row=scan.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row -i ; j++) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=row;k++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
	}
		
		
	}
