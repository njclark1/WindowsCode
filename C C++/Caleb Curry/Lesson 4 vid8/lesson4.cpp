//getting user input with cin

#include <iostream>

using std::cout;
using std::cin;

int main()
{
    int slices;
    cout << "How many slices you eat?: ";
    cin >> slices;
    cout << "You Have " << slices << " slices of pizza." << std::endl;


    return 0;
}