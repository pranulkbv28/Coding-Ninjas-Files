#include <iostream>
using namespace std;
int main() {
    int arr[] = {1, 2, 3, 4};
    // Printing elements of an array using foreach loop 
    for (int x: arr)
        cout << x << ' ';
    return 0;
}