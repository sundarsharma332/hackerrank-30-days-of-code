import java.util.Scanner;
import java.io.*;

public class LetsReview {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TestCases =  sc.nextInt();
		sc.nextLine();
		String first = "";
		String second = "";
		for(int i = 0 ; i < TestCases ; i++) {
			String input = sc.next();
			char[] char1 = input.toCharArray();
			for(int j = 0 ; j < char1.length;j++) {
				if(j%2==0) {
					first = first + char1[j];
				}else {
					second = second + char1[j];
				}
			}
			System.out.println(first+ " " + second);
			first = second = "";
			
			
		}
		sc.close();
	}

}
// simple loops program in java
