package Algorithms;

import java.util.HashMap;

public class FrequencyAnalysis {

    public static HashMap<Character,Integer> frequencyAnalysis(String text){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        text = text.toLowerCase().replaceAll("\\s+","");
        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            Integer val = map.get(c);
            if(val != null){
                map.put(c, new Integer(val + 1));
            }else{
                map.put(c,1);
            }
        }
        return map;
    }

}
