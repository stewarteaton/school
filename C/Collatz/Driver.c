// defines fork()
#include <unistd.h> 
// include strings
#include <string.h>
// declares input/output functions
#include <stdio.h> 
//declares memory allocation malloc()
#include <stdlib.h> 

//recursive logic funtion 
int collatz(int n) {
    if(n ==1){
        // printf("\t%d",n);
        return 0;
    }
    // if number is even. Divide by two, print, and send back recursively
    if(n%2 == 0){
        n = n/2;
        printf("\t%d",n);
        collatz(n);
    //If number is odd
    } else {
        n = 3*n + 1;
        printf("\t%d",n);
        collatz(n);
    }
    return 0;
}

//argc is argument count  argv is argument vector
//argc is # of strings pointed to by argv(always 1 plus # of arguments)
int main(int argc, char *argv[]){
    
int number;

if(argc ==2){
    //declare variable and convert string input to int
    number = atoi(argv[1]);
}
    // Check if the number of passed is positive
    if(argc == 2 && number >0){
        printf("Correct input\n");

    } 
    else if(argc >= 3 || argc <=1){
        printf("Usage: %s <starting value> Input should be only 1 number\n",argv[0]);
        exit(0);
    }
    else if(argc == 2 && number <= 0){
        printf("<starting value: %s> should be a positive integer\n",argv[1]);
        exit(0);
    }
 

    pid_t childPid;
    childPid = fork();

    // check if fork worked
    if(childPid >= 0){
        //invoke wait call so child process finsihes
        wait(0);

        //child process created when equal to 0
        if(childPid == 0){
            //begins function call of arugment passed in command line
            printf("\t%d",number);
            collatz(number);
        } else {
            printf("\nFinished\n\n");
        }
    } else {
        printf("Fork failure\n");
        return 1;
    }

    return 0;
}