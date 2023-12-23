//Problem-57
//@Author Vivek
import java.io.*;
import java.util.*;
class Solution {
    int isPalindrome(String s) {
        int n=s.length();
        for(int i=0; i<n/2; i++){
            int c=n-i-1;
            if(s.charAt(i)!=s.charAt(c)){
                return 0;
            }
        }
    return 1;
    }
}
