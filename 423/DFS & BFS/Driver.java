
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    public static int[][] matrixGraph;
    static Scanner scan = new Scanner(System.in);
    static Scanner fileScanner = new Scanner(System.in);
    static Scanner consoleScanner = new Scanner(System.in);

    static String fileName = "";
    public static int matrixLength = 0;

    public static void main(String[] args) throws FileNotFoundException{
        System.out.print("Welcome to my DFS/BFS 433 Project");
        
        
        System.out.print("\n\nDo you want to run sample1.txt: y or n?");
        String run = scan.nextLine();
        if (run.equals("y")) {
        	fileName = "sample1.txt";

        	try {
        		fileScanner = new Scanner(new File(fileName));
        		String line0 = fileScanner.nextLine();
        		String[] stringArray = line0.split(" ");
        		matrixLength = stringArray.length;
        		//Declare matrix with size length read from file
        		matrixGraph = new int[matrixLength][matrixLength];
        		
        		//for matrix rows
        		for(int i=0;i <= matrixLength-1; i++) {
        			//for matrix columns
        			for(int j=0; j <= matrixLength-1; j++) {
        				matrixGraph[i][j] = Integer.parseInt(stringArray[j]);
        			}
        			
        			//move to next line of matrix if possible
        			if(fileScanner.hasNextLine()) {
        				line0 = fileScanner.nextLine();
        				stringArray = line0.split(" ");
   
        			}
        		}
        		
        		fileScanner.close();
        		
        	} catch (FileNotFoundException e) {
        		System.out.println("The file was not found");
        	}
        	
        	printGraph("Sample1 Graph",matrixGraph);
        	
        	ArrayList<Integer> vertexList = new ArrayList<Integer>();
        	ArrayList<Integer> iList = new ArrayList<Integer>();

        	DFS(vertexList, iList);
        	BFS(vertexList, iList);

        }
        
        
        
    }
    
    	public static void printGraph(String graphName, int[][] graph) {
    		System.out.println("\n"+graphName);
    		
    		//for matrix rows
    		for(int i=0;i <= matrixLength-1; i++) {
    			
    			for(int j=0; j <= matrixLength-1; j++) {
    				System.out.print(graph[i][j] + " ");
    			}
    			System.out.println();
    		}
    	System.out.println();
    	}
    	
    	
    	public static void DFS(ArrayList<Integer> vertexList, ArrayList<Integer> iList) {
    		
    		boolean[] arrayOfVisited = new boolean[matrixLength];
    		boolean[] arrayOfVisited2 = new boolean[matrixLength];
    		ArrayList<Integer> DFSvertexList = new ArrayList<Integer>();
    		ArrayList<Integer> DFSdeadEndList =  new ArrayList<Integer>();
    		
    		
    		int[][] treeEdgeGraph = new int[matrixLength][matrixLength];
    		int DFSsumOfComponents = 0;
    		//set all values in arrayOfVisited to false, will be true when visited
    		for(int x=0;x <= matrixLength-1;x++) {
    			arrayOfVisited[x] = false;
    		}
    		
    		//initialize tree edge graph to zeros
    		for(int i=0;i < matrixLength; i++) {
    			
    			for(int j=0; j < matrixLength; j++) {
    				treeEdgeGraph[i][j] = 0;
    			}
    		}
    		
    		//Loop through all nodes and call dfs() method which uses recursion
    		for(int i=0;i < matrixLength;i++) {
    			//Check if node has been visited
    			if(!arrayOfVisited[i]) {
    				dfs(vertexList, iList, arrayOfVisited2, DFSvertexList, DFSdeadEndList,treeEdgeGraph,arrayOfVisited, i );
					DFSdeadEndList.add(i);
					DFSsumOfComponents++;
					arrayOfVisited2[i] = true;
    			}
    		}
    		System.out.println("\nNumber of connected components in graph (DFS): "+ DFSsumOfComponents);
    		System.out.print("Order in which vertices first encountered (DFS): ");
    		for(int i: DFSvertexList)
    			System.out.print(i+1+" ");
    		System.out.println();
    		System.out.print("Order in which dead ends were encountered (DFS); ");
    		for(int i: DFSdeadEndList)
    			System.out.print(i+1+" ");
    		System.out.print("\n\n");
    		printGraph("DFS Tree Edge Graph", treeEdgeGraph);
    		
    		int[][] backEdgeGraph = new int[matrixLength][matrixLength];
    		for(int i=0;i<=matrixLength-1;i++) {
    			for(int j=0;j<=matrixLength-1;j++) {
    				backEdgeGraph[i][j] = 0;
    			}
    		}
    		
    		for(int i=0; i<= iList.size()-1; i++) {
    			backEdgeGraph[iList.get(i)-1][vertexList.get(i)-1] = 1;
    		}
    		printGraph("DFS Back Edge Graph", backEdgeGraph); 
    	}
    	
    	public static void dfs(ArrayList<Integer> vertexList, ArrayList<Integer> iList, boolean[] arrayOfVisited2, ArrayList<Integer> DFSvertexList, ArrayList<Integer> DFSdeadEndList,int[][] treeEdgeGraph,boolean[] arrayOfVisited, int vertex) {
    		int x=0;
    		//add vertex position to DFS vertex list
    		DFSvertexList.add(vertex);
    		//mark array as visited
    		arrayOfVisited[vertex] = true;
    		
    		
    		
    		for(int i=0; i < matrixLength; i++) {
    			if(matrixGraph[vertex][i]==1) {
    				if(!arrayOfVisited[i]) {
    					x=i;
    					treeEdgeGraph[vertex][i]=1;
    					//Recursive call on dfs() function to keep visiting unvisited vertexes until dead end is reached
    					dfs(vertexList, iList, arrayOfVisited2, DFSvertexList, DFSdeadEndList,treeEdgeGraph,arrayOfVisited, i );
    					DFSdeadEndList.add(i);
    				}
    				
    				else if(vertex <= i && x != i) {
    					vertexList.add(1 + vertex);
    					iList.add(1 + i);
    				}
    			}
    		}
    	}
    	
    	public static void BFS(ArrayList<Integer> vertexList, ArrayList<Integer> iList) {
    		
    		ArrayList<Integer>BFSvertexList = new ArrayList<Integer>();
    		int[][] treeEdgeGraph = new int[matrixLength][matrixLength];
    		int numberOfComponents = 0;
    		boolean[] arrayOfVisited = new boolean[matrixLength];
    		boolean[] arrayOfVisited2 = new boolean[matrixLength];
    		
    		for(int i=0;i <= matrixLength-1; i++) 
    			for(int j=0; j <= matrixLength-1; j++) {
    				treeEdgeGraph[i][j] = 0;
    			}
    		
    	
    		for(int i=0; i < matrixLength; i++) {
    			
    			if(!arrayOfVisited[i]){
    				BFSvertexList.add(i);
    				arrayOfVisited[i] = true;
    				arrayOfVisited2[i] = true;
    				bfs(i, arrayOfVisited, BFSvertexList, treeEdgeGraph, vertexList, iList, arrayOfVisited2);
    				numberOfComponents++;
    			}
    		}
    		
    		System.out.println("\nNumber of connected components in graph BDFS): "+ numberOfComponents);
    		System.out.print("Order in which vertices first encountered (BFS): ");
    		for(int i: BFSvertexList)
    			System.out.print((i+1) +" ");
    		System.out.println();
    		printGraph("BFS Tree Edge Graph",treeEdgeGraph);
    	}
    	
    	public static void bfs(int vertex, boolean[] arrayOfVisited, ArrayList<Integer> BFSvertexList, int[][] treeEdgeGraph, ArrayList<Integer> vertexList, ArrayList<Integer> iList, boolean[] arrayOfVisited2) {
    		for(int i=0;i<=matrixGraph.length-1;i++) {
    			if(matrixGraph[vertex][i] !=0 ) {
    				if(!arrayOfVisited[i]) {
    					treeEdgeGraph[vertex][i] = 1;
    					BFSvertexList.add(i);
    					arrayOfVisited[i] = true;
    				}
    			}
    		}
    		
    		for(int i = BFSvertexList.indexOf(vertex) +1; i < BFSvertexList.size(); i++) {
    			int x = BFSvertexList.get(i);
    			bfs(x,arrayOfVisited,BFSvertexList,treeEdgeGraph,vertexList,iList,arrayOfVisited2);
    		}
    	}

}





