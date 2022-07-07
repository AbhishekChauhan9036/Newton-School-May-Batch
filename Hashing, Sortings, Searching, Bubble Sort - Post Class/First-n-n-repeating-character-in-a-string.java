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
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String non = sc.nextLine();

        Map<Character, Integer> m = new HashMap<Character, Integer>();

        for (int i = 0; i < non.length(); i++) {
            if (m.get(non.charAt(i)) != null) {
                m.put(non.charAt(i), m.get(non.charAt(i)) + 1);
            } else {
                m.put(non.charAt(i), 1);
            }
        }

        for (int i = 0; i < non.length(); i++) {

            if (m.get(non.charAt(i)) == 1) {
                System.out.println(i);
                break;
            } else {
                if (i == non.length() - 1) {
                    System.out.println("-1");
                }
            }
        }
    }
}
/******************************************************************************************************************************************/
/***********End****************/