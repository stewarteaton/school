//input and output functions
#include <stdio.h>
//memory allocation functions
#include <stdlib.h>
//includes functions for counting reading threads
#include <pthread.h>

//Global variables
int length = 0;
int maxValue = 0;
int minValue = 0;
double avgValue =0;

//function to calc average value 
void *findAvg(void *arg){
    int i=0;
    int sum=0;

    int *numbersArray;
    //convert numbers array passed from void to int
    numbersArray = (int*)arg;

    for(i = 0; i<length; i++){
        sum = sum + numbersArray[i];
    }
    // get average and convert to double
    avgValue = sum/(double)length;

    return NULL;
}

void *findMin(void *arg){
    int *numbersArray;
    //convert numbers array passed from void to int
    numbersArray = (int*)arg;

    int min = numbersArray[0];
    for(int i = 0; i<length; i++){
        if(numbersArray[i] < min){
            min = numbersArray[i];
        }
    }
    minValue = min;

    return NULL;
}

void *findMax(void *arg){
     //convert numbers array passed from void to int
    int *numbersArray = (int*)arg;
    
    int max = numbersArray[0];
    for(int i=0; i<length; i++){
        if(numbersArray[i] > max){
            max = numbersArray[i];
        }
    }
    maxValue = max;
    return NULL;
}

// Driver Function
int main(int argc, char *argv[]){
    //declare variables and allocate memory
    int *numbers;
    //sizeof(int) is the size of each integer multiplied by the number of integers passed (argc - 1)
    numbers = (int *)malloc(sizeof(int)*(argc - 1));
    int count = 1;
    char input[100];


    //Declare Threads
    pthread_t maxPth, minPth, avgPth;

    //check command line input
    if(argc <2){
        printf("Usage: %s.out <at least one integer as input\n>",argv[0]);
        return 0;
    }
    //else scan input
    for(int i=1; i < argc; i++){
        sscanf(argv[i], "%d", &numbers[i-1]);
    }

    length = (argc - 1);
  

    //create three separate threads for each operation
    pthread_create(&avgPth,NULL,findAvg,numbers);
    pthread_create(&minPth,NULL,findMin,numbers);
    pthread_create(&maxPth,NULL,findMax,numbers);

    //wait for thread to finish
    pthread_join(avgPth, NULL);
    pthread_join(minPth, NULL);
    pthread_join(maxPth, NULL);

    
    printf("\nThe average value is: %f",avgValue);
    printf("\nThe minimum value is: %d",minValue);
    printf("\nThe maximum value is: %d\n",maxValue);

}
