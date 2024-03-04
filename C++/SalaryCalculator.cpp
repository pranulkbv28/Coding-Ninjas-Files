#include <bits/stdc++.h> 
#include <iostream>
using namespace std;

int main() {
    //Write your code here
    int basic;
    char grade;
    cin>>basic>>grade;
    double hra,da,pf;
    int allow;
    hra =  0.2*basic;
    da = 0.5*basic;
    pf = 0.11*basic;
    if(grade == 'A'){
        allow = 1700;
    }else if(grade == 'B'){
        allow = 1500;
    }else{
        allow = 1300;
    }

    double salary =  basic+hra+da+allow-pf;
    cout<<salary;
    return 0;
}