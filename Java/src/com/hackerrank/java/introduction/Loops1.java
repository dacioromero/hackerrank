package com.hackerrank.java.introduction;

import java.util.Scanner;

public class Loops1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d%n", N, i, N * i);
		}
	}
}
