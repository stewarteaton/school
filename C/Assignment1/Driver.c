#include <stdio.h>
#include <string.h>
#include <stdlib.h>

//main function
int main(int argc, char *argv[]){

     //declare the variables, allocate memory
     int *numbers;
     numbers = (int *)malloc(sizeof(int));
     int count = 0, i = 0;
     FILE *fileIn, *fileOut;
     char input[20], output[20];
  
    //Check command line arguments
     if (argc != 3){
          printf("Please provide the input and output textfile name as %s.out  name1 name2\n",argv[0]);
          return 0;
     }
    //read text file
     else{
          sscanf(argv[1], "%s", input);
          sscanf(argv[2], "%s", output);
     }
    //open the files
    fileIn = fopen(input, "r");
    fileOut = fopen(output, "w");
    
    //Check if input or output files are NULL
    if (fileIn == NULL)   {
        printf("Input file %s cannot be opened.\n", input);
        return 0;
    } else if (fileOut == NULL){
        printf("Input file %s cannot be opened. \n", output);
        return 0;
    }
    //read the data from the file
    else  {
        fscanf(fileIn, "%d", &numbers[i]);
        printf("The integers in file %s.out \n",argv[0]);
        printf("%d ", numbers[i]);
        while (!feof(fileIn))
        {
            i++;
            numbers = (int *)realloc(numbers, 4 * sizeof(int));
            fscanf(fileIn, "%d", &numbers[i]);
            printf("%d ", numbers[i]);
        }

    }
    count =i;
    fclose(fileIn);
   
    // selection sort and swap
    for (int x = 0; x < count; x++){
          int temp = 0;
          for (int y = x+1; y <= count; y++){
              if (numbers[y] < numbers[x]){
                   temp = numbers[x];
                   numbers[x] = numbers[y];
                   numbers[y] = temp;
              }
          }
     }

     printf("\nSorted Elements: \n");
     //display sorted numbers on screen and write to output file
     for (int x = 0; x <= i; x++){
          fprintf(fileOut, "%d ", numbers[x]);
          printf("%d ", numbers[x]);
     }
     fclose(fileOut);

     //de-allocate memeory
     free(numbers);

     printf("\n");
     return 0;

}



