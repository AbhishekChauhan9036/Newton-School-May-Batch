
void patternPrinting(int n){
//Enter your code here
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(j<=i){
                cout<<j<<" ";
            }else{
                cout<<" ";
            }
        }
        cout<<endl;
    }
}