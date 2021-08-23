package com.sdl;

import java.util.Scanner;

public class Vending_mc {
		
	
	public static void main(String[] args)
		{
		Scanner input=new Scanner(System.in);
		int choice,gum=0,chocolate=0,popcorn=0,juice=0;
		do
		{
			System.out.println(" [1] Get gum\n [2]Get chocolate\n [3]Get popcorn\n [4]Get juice\n [5]Display total\n [6]Quit");
			choice=input.nextInt();
			switch(choice)
			{
			case 1:
				int pr;
				
				System.out.println("Put Rs.10 in the machine");
				pr=input.nextInt();
				
				if(pr==10) {
				System.out.println("Here is your gum ");
				gum++;
				}
				else
					System.out.println("Please enter money ");

			break;
			case 2:
				int choco=0;
				System.out.println("Put Rs.20 in the machine");
				pr=input.nextInt();
				if(choco==20) {
					System.out.println("Here is your chhocolate ");
				    chocolate++;
				}
				else
					System.out.println("Please enter money ");
			break;
			case 3:
				int pop;
				System.out.println("Put Rs.50 in tne machine");
				pop=input.nextInt();
				if(pop==50) {
					System.out.println("Here is your popcorn ");
				   popcorn++;
				}
				else
					System.out.println("Please enter money ");

			break;
			case 4:
				int jc;
				System.out.println("Put Rs.20 in the machine");
				jc=input.nextInt();
				if(jc==20) {
					System.out.println("Here is your juice ");
   				   juice++;	
				}
				else
					System.out.println("Please enter money ");

			break;
			case 5:
				System.out.println();
				System.out.println(gum+" items of gum sold ");
				System.out.println(chocolate+" items of chocolate sold ");
				System.out.println(popcorn+" items of popcorn sold ");
				System.out.println(juice+" items of juice sold ");
				System.out.println();
			break;
			case 6:
				System.out.println("Bye!!!");
			break;
			default:
				System.out.println("Error,options 1-6 only!");
			}
		}while(choice!=6);
		}
	}


