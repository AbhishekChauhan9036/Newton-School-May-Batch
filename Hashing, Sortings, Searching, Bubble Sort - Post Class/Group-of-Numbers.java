/* Author = Chauhan Abhishek */
/* Codechef Id = https://www.codechef.com/users/abhishekchauha */
/* Codeforces Id = https://codeforces.com/profile/abhishekchauhan903 */
/* Newton School Id = https://my.newtonschool.co/user/abhishekchauhan9036/ */
/* GitHub Id = https://github.com/AbhishekChauhan9036 */
/* Language = JAVA */
/* Address = Ballia,UP,INDIA (221716)*/

/******************************************************************************************************************************************/
/***********Start****************/
import java.io.*;
import java.util.*;
public class Main{
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for(int i=0;i<n;i++){
    arr[i] = sc.nextInt();
}

int maxE = -1;
for (int i = 0; i < n; i++) {
 maxE = Math.max(maxE, arr[i]);
}

int[] freq = new int[maxE + 1];
for (int i = 0; i < n; i++) {
 freq[arr[i]]++;
}

int maxF = -1;
for (int i = 0; i <= maxE; i++) {
 maxF = Math.max(maxF, freq[i]);
}

while(maxF > 0){
for(int i=maxE; i>=0;i--){
 if(maxF == freq[i]){
     System.out.print(i + " ");
 }
}
maxF--;
}}}
/******************************************************************************************************************************************/
/***********End****************/