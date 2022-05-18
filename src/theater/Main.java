package theater;

import java.util.Scanner;

public class Main {
	static char arr[][] = {{'-','-','-','-','-','-','-','-','-','-',},
			{'-','-','-','-','-','-','-','-','-','-'},
			{'-','-','-','-','-','-','-','-','-','-'},
			{'-','-','-','-','-','-','-','-','-','-'},
			{'-','-','-','-','-','-','-','-','-','-'},
			{'-','-','-','-','-','-','-','-','-','-'},
			{'-','-','-','-','-','-','-','-','-','-'},
			{'-','-','-','-','-','-','-','-','-','-'},
			{'-','-','-','-','-','-','-','-','-','-'},
			{'-','-','-','-','-','-','-','-','-','-'}};
	
	static void list() {
		System.out.println("   A B C D E F G H I J");
		for(int i=0; i<10; i++) {
			System.out.print((i+1)+"  ");
			for(int j=0; j<10; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void book(String k) {
		k = k.toUpperCase();
		String str[] = k.split(",");
		for(int i=0; i<str.length; i++) { // for multiple seat booking
			String s = str[i];
			char key[] = s.toCharArray();
			int col = key[0];
			int row =0;
			if(key.length == 3) row = 58;
			else row = key[1];
			if(arr[row-49][col-65] == '*') System.out.println(s+" is already booked");
			else arr[row-49][col-65] = '*';
		}
//		char key[] = k.toCharArray();
//		int col = key[0];
//		int row =0;
//		if(key.length == 3) row = 58;
//		else row = key[1];
//		arr[row-49][col-65] = '*';
		list();
		System.out.println("Your seats is booked at " +k);
	}
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = 0;
			do {
				System.out.print("1.check  2.book  0.exit  :");
				n = sc.nextInt();
				switch(n) {
				case 1: list(); break;
				case 2: System.out.print("Enter the seats to book : ");
				 		String str = sc.next();
				 		book(str); break;
				case 0: System.out.print("Bey");
				}
			}while(n != 0);
		}
		
	}

}
