package Ciphers;

import java.util.ArrayList;
import java.util.Random;

public class Polyalphabetic {

    private static int charToInt(char c) {
        switch (c) {

            case 'a':
                return 0;

            case 'b':
                return 1;

            case 'c':
                return 2;

            case 'd':
                return 3;

            case 'e':
                return 4;

            case 'f':
                return 5;

            case 'g':
                return 6;

            case 'h':
                return 7;

            case 'i':
                return 8;

            case 'j':
                return 9;

            case 'k':
                return 10;

            case 'l':
                return 11;

            case 'm':
                return 12;

            case 'n':
                return 13;

            case 'o':
                return 14;

            case 'p':
                return 15;

            case 'q':
                return 16;

            case 'r':
                return 17;

            case 's':
                return 18;

            case 't':
                return 19;

            case 'u':
                return 20;

            case 'v':
                return 21;

            case 'w':
                return 22;

            case 'x':
                return 23;

            case 'y':
                return 24;

            case 'z':
                return 25;
        }
        return 0;
    }

    private static char intToChar(int x){
        switch (x) {

            case 0:
                return 'a';

            case 1:
                return 'b';

            case 2:
                return 'c';

            case 3:
                return 'd';

            case 4:
                return 'e';

            case 5:
                return 'f';

            case 6:
                return 'g';

            case 7:
                return 'h';

            case 8:
                return 'i';

            case 9:
                return 'j';

            case 10:
                return 'k';

            case 11:
                return 'l';

            case 12:
                return 'm';

            case 13:
                return 'n';

            case 14:
                return 'o';

            case 15:
                return 'p';

            case 16:
                return 'q';

            case 17:
                return 'r';

            case 18:
                return 's';

            case 19:
                return 't';

            case 20:
                return 'u';

            case 21:
                return 'v';

            case 22:
                return 'w';

            case 23:
                return 'x';

            case 24:
                return 'y';

            case 25:
                return 'z';

        }
        return '*';
    }

    private static ArrayList<Integer> generateKey(int keyLength){

        Random rand = new Random();
        String letterkey = "";
        ArrayList<Integer> key = new ArrayList<Integer>(keyLength);
        ArrayList<Character> letterKeyArray = new ArrayList<Character>(keyLength);

        for (int i = 0; i <= keyLength; i++) {
            key.add(Math.abs(rand.nextInt()%29));
            letterKeyArray.add(intToChar(key.get(i)));
            letterkey += letterKeyArray.get(i);
        }
//        System.out.println(key);
//        System.out.println(letterKeyArray);
        System.out.println("OTP - Key: " + letterkey);

        return key;

    }

    private static String encrypt(String plainText, String key){

        ArrayList<Integer> keyValues = new ArrayList<>();
        for(int i=0; i<key.length(); i++){
            keyValues.add(charToInt(key.toLowerCase().charAt(i)));
        }

        plainText = plainText.toLowerCase().replaceAll("\\s+","");
        int stringLength = plainText.length() - 1;
        ArrayList<Integer> plainValues = new ArrayList<Integer>(stringLength);
        ArrayList<Character> cipherValues = new ArrayList<Character>(stringLength);

        for (int i = 0; i <= stringLength; i++) {
            int shift = keyValues.get(i);
            plainValues.add(charToInt(plainText.charAt(i)));
            cipherValues.add(intToChar((charToInt(plainText.charAt(i)) + shift) % 29));
        }

        String cipherText = "";
        for (int i = 0; i <= stringLength; i++) {
            cipherText = cipherText + cipherValues.get(i);
        }

        return cipherText;
    }

    public static String decrypt(String cipherText, String key){

        cipherText = cipherText.toLowerCase().replaceAll("\\s+","");;
        int stringLength = cipherText.length() - 1;
        ArrayList<Integer> cipherTextArray = new ArrayList<Integer>(stringLength);
        ArrayList<Character> plainTextArray = new ArrayList<Character>(stringLength);
        ArrayList<Integer> keyValues = new ArrayList<Integer>(stringLength);

        for (int i = 0; i <= stringLength; i++) {
            cipherTextArray.add(charToInt(cipherText.charAt(i)));
            keyValues.add(charToInt(key.charAt(i)));
            plainTextArray.add(intToChar((charToInt(cipherText.charAt(i))-keyValues.get(i)+29)%29));
        }

        String plainText = "";
        for (int i = 0; i <= stringLength; i++) {
            plainText += plainTextArray.get(i);
        }

        return plainText;
    }

}
