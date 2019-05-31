package project2;

import java.io.File;

//Given an array (m x n) of positive integers, find, in Θ(mn) time, the maximum size square submatrix 
//such that all values of the submatrix are larger than a given input k. For example, consider the following matrix

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Driver {
	
	public static int[][] matrixGraph;
	static Scanner scan = new Scanner(System.in);
	
    static String fileName = "";
    static Scanner fileScanner = new Scanner(System.in);
    static Scanner fileScanner2 = new Scanner(System.in);


    static int numberCols =0;
    static int numberRows =0;
	
	public static void main(String[] args) throws FileNotFoundException{
        System.out.print("Welcome to my Sub-Matrix 433 Project");
        
        System.out.print("\n\nWhich sample text do you want to run? Enter ( 1, 2, or 3): ");
        int run = scan.nextInt();
        
        if (run ==1) {
        	fileName = "sample1.txt";

        } else if (run == 2) {
        	fileName = "sample2.txt";
        } else if (run ==3) {
        	fileName = "sample3.text";
        }
        	//Try to read in file
        	try {
        		fileScanner = new Scanner(new File(fileName));
        		String line0 = fileScanner.nextLine();
        		numberRows = numberRows +1;
        		StringTokenizer columnTokens = new StringTokenizer(line0, " ");
        		//numbers in column disregarding spaces
        		numberCols = columnTokens.countTokens();
        		
        		//count rows in input file
        		while(fileScanner.hasNextLine()) {
        			fileScanner.nextLine();
        			numberRows++;
        		}

        		//Check if numbre of rows and columns are correct 
//        		System.out.print("\n number cols" +numberCols);
//        		System.out.print("\n number rows"+numberRows);
        		
        		matrixGraph = new int [numberRows][numberCols];
        		
        		System.out.print("\n\n Enter a value k: ");
        		int k = scan.nextInt();
        		
        	
        		fileScanner2 = new Scanner(new File(fileName));
        		String line00 = fileScanner2.nextLine();
        		
        		//Create matrix graph to represent indexes that are greater than or less than given number (k)
        		System.out.print("\nThis graph represents which indexes are higher(1) and lower(0) than given input (k)");
        		for(int i=0; i<numberRows; i++) {

        			StringTokenizer colTokens = new StringTokenizer(line00," ");
        			for(int j=0; j<numberCols; j++) {
        				int token = Integer.parseInt(colTokens.nextToken());
        				if (k < token) {
            				matrixGraph[i][j] = 1;

        				} else {
            				matrixGraph[i][j] = 0;
        				}
        			}
        			//iterate to next line of input
        			if(fileScanner2.hasNext()) {
            			line00 = fileScanner2.nextLine();

        			}

        		}
        		//print matrix graph for visualization
        		for(int i=0; i<numberRows; i++) {
        			System.out.print("\n");
        			for(int j=0; j<numberCols; j++) {
        				System.out.print(matrixGraph[i][j]);
        			}
        		}        		
        		
        		//call function to determine max sub matrix
        		findMaxSub(matrixGraph);
        		
        	} catch (FileNotFoundException e) {
        		System.out.println("The file was not found");
        	}
//        }
        
        
	}
	
	static void findMaxSub(int[][] graph1) {
		//declare new matrix graph
		int[][] graph2 = new int[numberRows][numberCols];
		
		//set first row and column of new graph to that of the original graph
		for(int i=0; i<numberRows; i++) {
			graph2[i][0] = graph1[i][0];
		
		}
		for(int j=0; j<numberCols; j++) {
			graph2[0][j] = graph1[0][j];
		}
		
		//set remaining indexes of new graph using the minimum of the three preceding 
		for(int i=1; i< numberRows; i++) {
			for(int j=1; j<numberCols; j++) {
				if(graph1[i][j] == 1){
					graph2[i][j] = min(graph2[i-1][j], graph2[i][j-1], graph2[i-1][j-1]);
					//By adding 1 to bottom right each we can determine where the max submatrix exist 
					graph2[i][j] = graph2[i][j] + 1;
				} else {
					graph2[i][j] = 0;
				}
			}
		}
		
		System.out.print("\n\nThis graph is shows the largest number(s) at the bottom right index of where the max square submatrix can exist");
		//print matrix graph for visualization
		for(int i=0; i<numberRows; i++) {
			System.out.print("\n");
			for(int j=0; j<numberCols; j++) {
				System.out.print(graph2[i][j]);
			}
		}       
		
		//determine largest submatrix and coordinates
		int maxSubMatrix = 0;
		for(int i=0; i < numberRows; i++) {
			for(int j=0; j< numberCols; j++) {
				if(maxSubMatrix < graph2[i][j]) {
					maxSubMatrix = graph2[i][j];
				}
			}
		}
		
		System.out.print("\n\nMax Submatrix is: " +maxSubMatrix + "x" + maxSubMatrix);
		
		
		for(int i=0; i<numberRows; i++) {
			for(int j=0; j<numberCols; j++) {
				if(maxSubMatrix == graph2[i][j]) {
					System.out.print("\nBottom right coordinate of max: (" + (i+1) + ","+ (j+1)+")");
				}
			}
		}
		//give space at bottom of output
		System.out.print("\n\n");
	}
	
	
	static int min(int x, int y, int z) {
		int min = x;
		
		if(min > y) {
			min = y;
		} 
		if (min >z) {
			min = z;
		}
		
		return min;
	}

}
