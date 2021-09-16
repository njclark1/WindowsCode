// programmer: nickj.clark14@gmail.com
// date: 2021 02 02
// modi date:
// purpose:


#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
	// declare variables
	double eveningTicketPrice, matineeTicketPrice, eveningConcessionsPer, matineeConcessionsPer, eveningTicketPercentage, eveningConcessionsPercentage,
		matineeTicketPercentage, matineeConcessionsPercentage, totalEveningRevenue, totalMatineeRevenue;

	//assign given variable values
	eveningTicketPrice = 10;
	eveningConcessionsPer = 6.50;
	matineeTicketPrice = 3;
	matineeConcessionsPer = 8.50;
	totalEveningRevenue = 0;
	totalMatineeRevenue = 0;
	eveningTicketPercentage = 0;
	eveningConcessionsPercentage = 0;
	matineeTicketPercentage = 0;
	matineeConcessionsPercentage = 0;

	//calculate total revenues
	totalEveningRevenue = eveningTicketPrice + eveningConcessionsPer;
	totalMatineeRevenue = matineeTicketPrice + matineeConcessionsPer;

	//calculate percentage revenues
	eveningTicketPercentage /= totalEveningRevenue;
	eveningConcessionsPercentage /= totalEveningRevenue;
	matineeTicketPercentage /= totalMatineeRevenue;
	matineeConcessionsPercentage /= totalMatineeRevenue;
	
	//display welcome message
	cout << "Welcome! This program tells us what percentage of revenue a movie theater makes between tickets and concessions for both evening showing and matinee showings.\n";

	cout << "The evening ticket sales percentage of revenue is: ", eveningTicketPercentage, ".";
	cout << "\nThe evening concessions sales percentage of revenue is: ", eveningConcessionsPercentage, ".";
	cout << "\nThe matinee ticket sales percentage of revenue is: ", matineeTicketPercentage, ".";
	cout << "\n The matinee concessions sales percentage of revenue is: ", matineeConcessionsPercentage, ".";


	system("Pause");
	return 0;

}