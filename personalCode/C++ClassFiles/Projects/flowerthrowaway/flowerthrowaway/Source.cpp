//programmer : parks34@icloud.com
//date: 1-28-2021
//date modi:
//This is a program to calculate cost 
//of a flower garden



#include <iostream>;
#include <iomanip>;
using namespace std;



int main()
{
    double fenceCost, soilCost, seedsCost, totalSpent;



    //How much am I spending on fencing?
    cout << "How much did you spend on fence? $";
    cin >> fenceCost;



    //How much am I spending on soil?
    cout << "How much did you spend on soil? $";
    cin >> soilCost;



    //How much am I spending on seeds?
    cout << "How much did you spend to buy the seeds? $";
    cin >> seedsCost;



    //This is calculation for sum spent. 
    totalSpent = fenceCost + soilCost + seedsCost;



    //Total $ amount spent. 
   
        
    cout << "Total amount spent to display garden flower is $" << totalSpent << setprecision(2) << fixed << endl;



    return 0;
}

//manip spelled wrong
//semicolon after calculation
//spaces after question marks then $