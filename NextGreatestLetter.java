package com.company;

public class NextGreatestLetter {
    public static void main(String[] args) {
        FindNextGreatLtr p = new FindNextGreatLtr();
        char[] letter = {'c','f','j'};
        char target = 'c';
        System.out.println(p.nextGreatestLetter(letter,target));
    }
}
class FindNextGreatLtr extends NextGreatestLetter{
    public char nextGreatestLetter(char[] letters, char target) {
        // smallest character greater then target character
        int strtIdx = 0, endIdx = letters.length -1, m=0;
        if(target >= letters[endIdx])
            return letters[0];

        while(strtIdx <= endIdx){
            m = strtIdx+(endIdx-strtIdx)/2;

            if(target < letters[m]) {
                endIdx = m - 1;
            }
            else {
                strtIdx = strtIdx + 1;
            }
        }
        return letters[strtIdx];
    }
}
