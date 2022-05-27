#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {

	// Your code here
	int n=4;
	int arr[4];

	for(int i=0;i<n;i++){
		cin>>arr[i];
	}

	sort(arr,arr+n);
	cout<<arr[3];
	return 0;
}