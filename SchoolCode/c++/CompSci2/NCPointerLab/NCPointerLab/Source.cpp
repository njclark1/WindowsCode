//programmer: Nickj.clark14@gmail.com
//date: 2021 09 14
//modi date:
//purpose: 

//include statements
#include <iostream>
#include <iomanip>
#include <string>
#include <algorithm>

//namespaces
using namespace std;

//initialize functions
int getNumTestScores();
double getTestScores();
double getAverageScore(int, double*);
void sortArrayAscending(int, double*);

//main function
int main()
{
	//get the number of test scores
	int numberOfTestScores = getNumTestScores();
	double* myArray = new double[numberOfTestScores];

	//get the test scores
	for (int counter = 0; counter < numberOfTestScores; counter++) {
		myArray[counter] = getTestScores();
	}

	//get the average test score
	double testScoreAverage = getAverageScore(numberOfTestScores, myArray);

	//output the array in ascending order
	sortArrayAscending(numberOfTestScores, myArray);
	for (int i = 0; i < numberOfTestScores; i++) {
		cout << fixed << setprecision(2) << "Score " << i+1 << " is: " << myArray[i] << "%\n";
	}

	//output to user
	cout << fixed << setprecision(2) << "\nThe average test score is: " << testScoreAverage << "%" << endl;

	//delete pointer values
	delete[]myArray;

	//system pause and return to close main
	system("Pause");
	return 0;
}

//sort the array in ascending order
void sortArrayAscending(int numScores, double* scoreArray) {
	sort(scoreArray, scoreArray + numScores);
}

//Get average test score
double getAverageScore(int numScores, double* scoreArray)
{
	double totalScore = 0;
	double averageScore = 0;
	for (int i = 0; i < numScores; i++) {
		totalScore += scoreArray[i];
		averageScore = totalScore / numScores;
	}
	//return average test score
	return averageScore;
}

//Get user defined number of test scores
int getNumTestScores()
{
	int num;
	cout << "\nHow many test scores?: ";
	cin >> num;

	while (num < 1)
	{
		cout << "That is not a valid number.\n";
		cout << "\nHow many test scores?: ";
		cin >> num;
	}
	//return user nuumber of test scores
	return num;
}

//get user defined test scores
double getTestScores()
{ 
	double score;
	cout << "What is the test score?: ";
	cin >> score;
	
	while (score < 0) {
		cout << "that is not a valid score.\n";
		cout << "\nWhat is the test score?: ";
		cin >> score;
	}
	//return user test score
	return score;
}