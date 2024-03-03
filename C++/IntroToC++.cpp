#include <iostream>
using namespace std;

// macro definition
#define LIMIT 5
#define AREA(l,b) (l*b)

// int main() {
//     for (int i = 0; i < LIMIT; i++) {
//         cout << i << " "<<endl;
//     }
//     return 0;
// }

int main() {
    int l = 10, b = 5, a;
    a = AREA(l, b);
    cout << "The Area of the rectangle is: " << a;
    return 0;
}