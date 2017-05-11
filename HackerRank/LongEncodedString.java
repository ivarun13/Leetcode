package HackerRank;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.InternetHeaders;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by varun on 2/2/17.
 */
public class LongEncodedString {

    public int[] frequency(String s){
        int[] result = new int[26];
        Map<String,Character> map = new HashMap<>();
//        map.put("1",'a');
//        map.put("2",'b');
//        map.put("3",'c');
//        map.put("4",'d');
//        map.put("5",'e');
//        map.put("6",'f');
//        map.put("7",'g');
//        map.put("8",'h');
//        map.put("9",'i');map.put("10",'j');
//        map.put("11",'k');
//        map.put("12",'l');map.put("13",'m');
//        map.put("14",'n');
//        map.put("15",'o');
//        map.put("16",'p');
//        map.put("17",'q');
//        map.put("18",'r');
//        map.put("19",'s');
//        map.put("20",'t');map.put("21",'u');
//        map.put("22",'v');map.put("23",'w');
//        map.put("24",'x');
//        map.put("25",'y');
//        map.put("26",'z');







        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=s.length()-1;i>=0;i--){

            if(s.charAt(i) == ')'){
                count = Character.getNumericValue(s.charAt(i-1));
                //System.out.println("ji"+count);
                i = i-2;
            }
           else if(s.charAt(i) == '#'){
                String num =  s.charAt(i-2) +""+ s.charAt(i-1);
                int j = Integer.parseInt(num);
                System.out.println(j);
                i = i-2;
                char sa = (char) j;
                System.out.println("hiiiis"+sa);
//                if(count != 0){
//                while(count != 0){
//                    sb.insert(0,sa);
//                    count--;
//                }}
//                else{
//                sb.insert(0,sa);}

            }
            else{
                String num = String.valueOf(s.charAt(i));
                int j = Integer.parseInt(num);
                char so = (char) j;
                if(count != 0){
                    while(count != 0){
                        sb.insert(0,so);
                        count--;
                    }}
                else{
                    sb.insert(0,so);}
            }

        }
        System.out.println(sb.toString());

        for(int i=0; i<sb.length();i++)
        {
            result[sb.charAt(i) - 'a']++;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }


    public static void main(String[] args) {
        LongEncodedString l = new LongEncodedString();
        l.frequency("1(3)26#24#23420#");
    }
}
