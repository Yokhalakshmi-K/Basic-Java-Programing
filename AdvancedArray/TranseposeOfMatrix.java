package AdvancedArray;

import java.util.Scanner;

public class TranseposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		int c[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
			c[i][j]=a[j][i];
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
			System.out.println(c[i][j]);
			}
		}
	}

}
