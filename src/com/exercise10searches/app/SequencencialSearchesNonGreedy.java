package com.exercise10searches.app;

import java.util.Random;
import java.util.Scanner;

public class SequencencialSearchesNonGreedy 
{

	public static void main(String[] args) 
	{
		//Declarar variables
		int numberToFind=0;
		int indexFound=-1;
		boolean isFound=false;
		int index=0;
		//declarar constantes
		final int ELEMENTS_ARRAY=10;
				
		//Array declrartion
		int[] vector = new int[ELEMENTS_ARRAY];
		
		Random numbers =new Random(System.nanoTime());
		Scanner input =new Scanner(System.in);
		
		for(int i=0; i<ELEMENTS_ARRAY;i++)
		{
			vector[i] = numbers.nextInt(101);
		}
		for(int i=0; i<ELEMENTS_ARRAY;i++)
		{
			System.out.print(vector[i]+" ");
		}
			System.out.println(" ");
		do
		{
			
			System.out.println("\n Input the value to find inside the array:");
			numberToFind=input.nextInt();
			if(numberToFind<0)
			{
				System.out.println("Number must be greater than or equal to zero!!!");
			}
		}while(numberToFind<0);
		for(int i=0; i<ELEMENTS_ARRAY; i++)
		{
			if(numberToFind==vector[i])
			{
				indexFound=i;
				break;
			}
		}
		//int i=0;
		while(isFound==false && index<ELEMENTS_ARRAY) //!isFound es igual que (isFound==false)
		{
			if(numberToFind==vector[index])
			{
				indexFound=index;
				isFound=true;
			}
			index++;
		}
			if(indexFound!=-1)
			{
				System.out.println("Elememnt found at index:"+indexFound);
			}
				else 
			{
				System.out.println("Element not found");
			}
			
				
			input.close();
		}
	}
