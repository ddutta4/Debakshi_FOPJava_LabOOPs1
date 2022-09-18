package com.lab1;

import java.util.Scanner;

public class ItSupport {

	public static void main(String[] args) {
		CredentialService c1 = new CredentialService();
		
		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		
		Scanner sc = new Scanner(System.in);
		int key=sc.nextInt();
		switch(key) {
		
		case 1:{
			String department="tech";
			c1.showCredentials(c1.first_name,c1.last_name,department);
			break;
		}
		case 2:{
			String department="admin";
			c1.showCredentials(c1.first_name,c1.last_name,department);
			break;
		}
		case 3:{
			String department="hr";
			c1.showCredentials(c1.first_name,c1.last_name,department);
			break;
		}
		case 4:{
			String department="legal";
			c1.showCredentials(c1.first_name,c1.last_name,department);
			break;
		}
		default:{
			System.out.println("Invalid choice");
				break;
			}
		}
		
		
		}

	}


