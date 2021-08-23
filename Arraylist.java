package com.sdl;

import java.util.ArrayList;
import java.util.Scanner;



public class Arraylist {
	
		static ArrayList <String> Todolist = new  ArrayList<String>();
		static String Item;
		static int Count = 0;

		public static void main(String[] args) 
		{
			
			int choice;
			char ans;

			while(true){
			Scanner sc = new Scanner(System.in);
			int Index;
			
			
		System.out.println("Select operation:\n1: Add tasks in the list"
				+ "\n2: Delete task in the list\n3: Delete all tasks in the list\n4: Display all task in the list\n5: Exit");
		choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice)
		{
		case 1:{

			System.out.println("Enter the task ");
			String item = sc.nextLine();
			Todolist.add(item);
			//System.out.println(item + "  has been added in the list at element[" + Count + "].");
			Count++;
			}
		break;
		
			
		case 2:{

			System.out.println("Enter the index of the task you want to remove.");
			int a = sc.nextInt();
			int index=a-1;

			if(index > Count)
				System.out.println("Please enter correct index. Index not found");
			else{
				System.out.println(Todolist.get(index) + " has been removed from the list.");
			
				Todolist.remove(index);
			--Count;
			}
			
			}break;

			case 3:{

			if(Todolist.isEmpty())
				System.out.println("List is already empty.");
			else{
				System.out.println("All items in the list has been removed.");
			Todolist.clear();
			Count = 0;
			}
			}break;

			case 4:{

			//String Display ="";
            int a=1;
			if(Todolist.isEmpty())
				System.out.println(" List is empty.No items found....");
			else{
				System.out.println("----------YOUR TODO LIST---------");
				for(String str:Todolist){
					
					System.out.println(String.valueOf(a++)+". "+str);
				}
			}

			}break;

			case 5 :
			{
			System.out.println("Program terminating….");
			System.exit(0);
			}break;
		}
		//System.out.println("Do u want to continue with another operation (y/n)");
		//ans = sc.next().charAt(0);
		
		}

			
			
		}
	}
		
		



