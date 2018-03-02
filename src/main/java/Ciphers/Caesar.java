package Ciphers;

import java.util.ArrayList;

public class Caesar {

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

    public static void encrypt(String plainText,int shift){
        plainText = plainText.toLowerCase();
        int stringLength = plainText.length()-1;
        ArrayList<Integer> plainValues = new ArrayList<Integer>(stringLength);
        ArrayList<Character> cipherValues = new ArrayList<Character>(stringLength);

        for (int i = 0; i <= stringLength; i++) {
            plainValues.add(charToInt(plainText.charAt(i)));
            cipherValues.add(intToChar((charToInt(plainText.charAt(i))+shift)%29));

        }

        String cipherText = "";
        for (int i = 0; i <= stringLength; i++) {
            cipherText = cipherText + cipherValues.get(i);
        }

        System.out.println(cipherText);

    }

    public static void decrypt(String cipherText){

        cipherText = cipherText.toLowerCase();
        int stringLength = cipherText.length()-1;

        ArrayList<Character> plainValues1  = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues2  = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues3  = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues4  = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues5  = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues6  = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues7  = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues8  = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues9  = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues10 = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues11 = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues12 = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues13 = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues14 = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues15 = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues16 = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues17 = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues18 = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues19 = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues20 = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues21 = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues22 = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues23 = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues24 = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues25 = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues26 = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues27 = new ArrayList<Character>(stringLength);
        ArrayList<Character> plainValues28 = new ArrayList<Character>(stringLength);

        for (int i = 0; i <= stringLength; i++) {
            plainValues1.add(intToChar((charToInt(cipherText.charAt(i))+1)%29));
            plainValues2.add(intToChar((charToInt(cipherText.charAt(i))+2)%29));
            plainValues3.add(intToChar((charToInt(cipherText.charAt(i))+3)%29));
            plainValues4.add(intToChar((charToInt(cipherText.charAt(i))+4)%29));
            plainValues5.add(intToChar((charToInt(cipherText.charAt(i))+5)%29));
            plainValues6.add(intToChar((charToInt(cipherText.charAt(i))+6)%29));
            plainValues7.add(intToChar((charToInt(cipherText.charAt(i))+7)%29));
            plainValues8.add(intToChar((charToInt(cipherText.charAt(i))+8)%29));
            plainValues9.add(intToChar((charToInt(cipherText.charAt(i))+9)%29));
            plainValues10.add(intToChar((charToInt(cipherText.charAt(i))+10)%29));
            plainValues11.add(intToChar((charToInt(cipherText.charAt(i))+11)%29));
            plainValues12.add(intToChar((charToInt(cipherText.charAt(i))+12)%29));
            plainValues13.add(intToChar((charToInt(cipherText.charAt(i))+13)%29));
            plainValues14.add(intToChar((charToInt(cipherText.charAt(i))+14)%29));
            plainValues15.add(intToChar((charToInt(cipherText.charAt(i))+15)%29));
            plainValues16.add(intToChar((charToInt(cipherText.charAt(i))+16)%29));
            plainValues17.add(intToChar((charToInt(cipherText.charAt(i))+17)%29));
            plainValues18.add(intToChar((charToInt(cipherText.charAt(i))+18)%29));
            plainValues19.add(intToChar((charToInt(cipherText.charAt(i))+19)%29));
            plainValues20.add(intToChar((charToInt(cipherText.charAt(i))+20)%29));
            plainValues21.add(intToChar((charToInt(cipherText.charAt(i))+21)%29));
            plainValues22.add(intToChar((charToInt(cipherText.charAt(i))+22)%29));
            plainValues23.add(intToChar((charToInt(cipherText.charAt(i))+23)%29));
            plainValues24.add(intToChar((charToInt(cipherText.charAt(i))+24)%29));
            plainValues25.add(intToChar((charToInt(cipherText.charAt(i))+25)%29));
            plainValues26.add(intToChar((charToInt(cipherText.charAt(i))+26)%29));
            plainValues27.add(intToChar((charToInt(cipherText.charAt(i))+27)%29));
            plainValues28.add(intToChar((charToInt(cipherText.charAt(i))+28)%29));
        }

        String plainText1 = "";
        String plainText2 = "";
        String plainText3 = "";
        String plainText4 = "";
        String plainText5 = "";
        String plainText6 = "";
        String plainText7 = "";
        String plainText8 = "";
        String plainText9 = "";
        String plainText10 = "";
        String plainText11 = "";
        String plainText12 = "";
        String plainText13 = "";
        String plainText14 = "";
        String plainText15 = "";
        String plainText16 = "";
        String plainText17 = "";
        String plainText18 = "";
        String plainText19 = "";
        String plainText20 = "";
        String plainText21 = "";
        String plainText22 = "";
        String plainText23 = "";
        String plainText24 = "";
        String plainText25 = "";
        String plainText26 = "";
        String plainText27 = "";
        String plainText28 = "";



        for (int i = 0; i <= stringLength; i++) {
            plainText1 = plainText1 + plainValues1.get(i);
            plainText2 = plainText2 + plainValues2.get(i);
            plainText3 = plainText3 + plainValues3.get(i);
            plainText4 = plainText4 + plainValues4.get(i);
            plainText5 = plainText5 + plainValues5.get(i);
            plainText6 = plainText6 + plainValues6.get(i);
            plainText7 = plainText7 + plainValues7.get(i);
            plainText8 = plainText8 + plainValues8.get(i);
            plainText9 = plainText9 + plainValues9.get(i);
            plainText10 = plainText10 + plainValues10.get(i);
            plainText11 = plainText11 + plainValues11.get(i);
            plainText12 = plainText12 + plainValues12.get(i);
            plainText13 = plainText13 + plainValues13.get(i);
            plainText14 = plainText14 + plainValues14.get(i);
            plainText15 = plainText15 + plainValues15.get(i);
            plainText16 = plainText16 + plainValues16.get(i);
            plainText17 = plainText17 + plainValues17.get(i);
            plainText18 = plainText18 + plainValues18.get(i);
            plainText19 = plainText19 + plainValues19.get(i);
            plainText20 = plainText20 + plainValues20.get(i);
            plainText21 = plainText21 + plainValues21.get(i);
            plainText22 = plainText22 + plainValues22.get(i);
            plainText23 = plainText23 + plainValues23.get(i);
            plainText24 = plainText24 + plainValues24.get(i);
            plainText25 = plainText25 + plainValues25.get(i);
            plainText26 = plainText26 + plainValues26.get(i);
            plainText27 = plainText27 + plainValues27.get(i);
            plainText28 = plainText28 + plainValues28.get(i);

        }

        System.out.println("\n");
        System.out.println(plainText1 + "\n");
        System.out.println(plainText2 + "\n");
        System.out.println(plainText3 + "\n");
        System.out.println(plainText4 + "\n");
        System.out.println(plainText5 + "\n");
        System.out.println(plainText6 + "\n");
        System.out.println(plainText7 + "\n");
        System.out.println(plainText8 + "\n");
        System.out.println(plainText9 + "\n");
        System.out.println(plainText10 + "\n");
        System.out.println(plainText11 + "\n");
        System.out.println(plainText12 + "\n");
        System.out.println(plainText13 + "\n");
        System.out.println(plainText14 + "\n");
        System.out.println(plainText15 + "\n");
        System.out.println(plainText16 + "\n");
        System.out.println(plainText17 + "\n");
        System.out.println(plainText18 + "\n");
        System.out.println(plainText19 + "\n");
        System.out.println(plainText20 + "\n");
        System.out.println(plainText21 + "\n");
        System.out.println(plainText22 + "\n");
        System.out.println(plainText23 + "\n");
        System.out.println(plainText24 + "\n");
        System.out.println(plainText25 + "\n");
        System.out.println(plainText26 + "\n");
        System.out.println(plainText27 + "\n");
        System.out.println(plainText28 + "\n");

    }

    public static void decrypt(String cipherText,int shift){
        cipherText = cipherText.toLowerCase();
        int stringLength = cipherText.length()-1;
        ArrayList<Character> plainValues = new ArrayList<Character>(stringLength);
        ArrayList<Integer> cipherValues = new ArrayList<Integer>(stringLength);

        for (int i = 0; i <= stringLength; i++) {
            cipherValues.add(charToInt(cipherText.charAt(i)));
            plainValues.add(intToChar((charToInt(cipherText.charAt(i))-shift+29)%29));

        }

        String plainText = "";
        for (int i = 0; i <= stringLength; i++) {
            plainText += plainValues.get(i);
        }

        System.out.println(plainText);
        System.out.println(plainValues);

    }
}
