//input and output functions
#include <stdio.h>
//memory allocation functions
#include <stdlib.h>
//includes functions for counting reading threads
#include <pthread.h>
//include math functions
#include <math.h>

//declare global variables 
int threadCount = 0;
double pointsTotal = 50000000;
double pointsIn = 0;
double pi = 0;
//define mutex struct 
pthread_mutex_t mutex;

//function for generating random double
double random_double(){
 return random() / ((double)RAND_MAX + 1);
} 

//function to check whether point is in circle
void *checkPoints(void *arg){

    for(int i=0; i< (pointsTotal/threadCount); i++){
        pthread_mutex_lock(&mutex);

        double x = random_double();
        double y = random_double();
        if( sqrt(x*x + y*y) < 1){
            pointsIn = pointsIn + 1;
        }

        pthread_mutex_unlock(&mutex);
    }

    return NULL;
}



// Driver Function
int main(int argc, char *argv[]){

    int i=0;
    int j=0;

    if(argc != 2){
        printf("\nUsage: %s.out <number of threads>\n\n",argv[0]);
        return 0;
    } 
    threadCount = atoi(argv[1]);
    if(threadCount <= 0){
        printf("\n<number of threads> should be a positive integer\n\n");
        return 0;
    }


    //declare pthreadss
    pthread_t tid[threadCount -1];

 /* create the mutex lock */
	pthread_mutex_init(&mutex, NULL);

    //create the thread
    while(i < threadCount){
        pthread_create(&(tid[i]), NULL, checkPoints, NULL); 
        i++; 
    }

    while(j < threadCount){
        pthread_join(tid[j], NULL);
        j++;
    }

    //must recalc total points used because might be uneven division from total thread and number points
    double newTotal = ceil(pointsTotal/threadCount) * threadCount;

    pi = (4*pointsIn)/pointsTotal;

    printf("\nPi =  %f\n", pi);


}