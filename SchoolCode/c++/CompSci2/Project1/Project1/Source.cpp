// Chapter 10 - Assignment 1, Test Scores
// This program sorts an array of test scores, and 
// prints both the sorted array and the average score.

#include <iostream>
#include <algorithm>  // Needed for STL sort algorithm
using namespace std;

double average(double score[], int size);

struct Student
{
    string name;
    double score;
};

int main()
{
    int numberOfScores;
    double* testScore;     // Pointer to dynamically allocated array of scores
    double ave;            // Average score


    // Determine number of scores and allocate array
    cout << "Enter number of Scores: ";
    cin >> numberOfScores;

    Student* pointer = nullptr;
    pointer = new Student[numberOfScores];



    // Pointer to next value to be read
    for (int k = 0; k < numberOfScores; k++)
    {
        cout << "Enter the student name: " << endl;
        cin >> pointer[k].name;
        cout << "Enter the student's test score: " << endl;
        cin >> pointer[k].score;
        // Input validation
        if (pointer < 0)
        {
            cout << "You may not use negative scores. Please restart the program.";
            exit(0);
        }

    }


    // Sort scores using STL algorithm sort library function
    sort(pointer, pointer + numberOfScores);

    // Compute average
    ave = average(pointer, numberOfScores);

    // Print the output
    cout << "\nThe list of sorted scores is:\n";

    for (int m = 0; m < numberOfScores; m++)
    {
        cout << pointer[m].name << "  ";
        cout << pointer[m].score << endl;
    }
    cout << "\nThe average is: " << ave;
    delete[] pointer;
    system("pause");
    return 0;
}

//**
//               average                                       *
// Compute and return average of array a[ ] of given size.     *
//**
double average(double a[], int size)
{
    double sum = 0;
    double* p = a;  // Pointer to next array entry to be summed
    for (int k = 0; k < size; k++)
    {
        sum = sum + *p;
        p++;
    }
    return sum / size;
}