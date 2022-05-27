#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
int main() {

	int a;
	int b;
	cin>>a>>b;
	if(a<=10 && b >=10){cout<<("true ");}
		else {cout<<("false ");}

	if(a%2==0||b%2==0){cout<<("true ");}
	else {cout<<("false ");}

	if(a!=b){cout<<("true ");}
	else {cout<<("false ");}
	
	return 0;
}