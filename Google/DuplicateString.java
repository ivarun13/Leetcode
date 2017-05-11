import java.util.*;
public class DuplicateString{

  public static void solution(String s){
    Map<Character,Integer> treeMap = new TreeMap<>();
    for (int i=0;i<s.length();i++) {
      if(!treeMap.containsKey(s.charAt(i))){
        treeMap.put(s.charAt(i),1);
      }
      else{
        treeMap.put(s.charAt(i),treeMap.get(s.charAt(i))+1);
      }
    }

    StringBuilder sb = new StringBuilder();
    for(Character c : treeMap.keySet()){
      sb.append(c);
    }
    System.out.println(sb);
  }

  public static void main(String[] args) {
    solution("bcabc");
  }
}
