package exJobRotacion;

import java.util.Scanner;

public class ex1Fibonacci {

    static int fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    
    static void pertence(int num) {
    	for(int i = 0; i <= num;i++) {
    		if(num == fibo(i)) {
    			System.out.println("Pertence");
    			break;
    		}
    		else {
    			if(i==num) {
    				System.out.println("Não Pertence");
    			}
    		}
    	}
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int num = sc.nextInt();
		
		pertence(num);
		
		sc.close();
	}

}
