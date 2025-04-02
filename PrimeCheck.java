package Week_1;

import java.util.*;
public class PrimeCheck {
	public boolean checkPrime(int num) {
		if(num <= 1) return false;
		if(num ==2 || num == 3) return true;
		if(num % 2 == 0) return false;
		for(int i = 3; i<=Math.sqrt(num); i += 2) {
			if(num % i == 0) return false;
			
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check: ");
		int num = sc.nextInt();
		PrimeCheck pc = new PrimeCheck();
		boolean result = pc.checkPrime(num);
		if(result == true) {
			System.out.println(num+" is a prime number.");
		}
		else {
			System.out.println(num+ " is not a prime number.");
		}
		sc.close();
	}
}
