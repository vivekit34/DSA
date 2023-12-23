//Auther@vivek
//Problem 56- Reverse a String
class Solution56 {
    public void reverseString(char[] s) {
        int n=s.length;
        char t;
        for (int i=0; i<n/2;i++){
             if(s[i]!=s[n-i-1]){
                 t=s[i];
                 s[i]=s[n-i-1];
                 s[n-i-1]=t;
             }
        }
        System.out.println(s);
    }
}
