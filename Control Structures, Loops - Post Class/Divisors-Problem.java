static int DivisorProblem(int N){
//Enter your code here
int count=0;
  while(N>1){
  N=second_max(N);
  count++;
  }
  return count;
}
public static int second_max(int N){
for(int i=2;i*i<=N;i++){
  if(N%i==0){
    return N/i;
   }
  } 
   return 1;
   
}