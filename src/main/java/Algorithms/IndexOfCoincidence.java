package Algorithms;

public class IndexOfCoincidence {

    public static double indexOfCoincidence(String text){

        int n = 0;
        double sum = 0.0;
        int ch;
        int[] values = new int[26];
        text = text.toUpperCase();

        for(int i=0; i<26; i++){
            values[i] = 0;
        }

        for(int i=0; i<text.length(); i++){
            ch = text.charAt(i)-65;
            if(ch>=0 && ch<26){
                values[ch]++;
                n++;
            }
        }

        for(int i=0; i<26; i++){
            ch = values[i];
            sum = sum + (ch * (ch-1));
        }

        return sum/(n*(n-1));
    }

}
