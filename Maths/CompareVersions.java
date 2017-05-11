package Maths;

/**
 * Created by varun on 10/17/16.
 */
public class CompareVersions {

    public int solution(String version1, String version2)
    {
        String[] parts1 = version1.split("\\.");
        String[] parts2 = version2.split("\\.");
        int length = Math.max(parts1.length,parts2.length);
        for(int i=0; i<length; i++)
        {
            Integer v1 = i < parts1.length ? Integer.parseInt(parts1[i]) : 0;
            Integer v2 = i < parts2.length ? Integer.parseInt(parts2[i]) : 0;
            int result = v1.compareTo(v2);
            if(result != 0) return result;

        }
        return 0;
    }

    public static void main(String[] args) {
        CompareVersions c = new CompareVersions();
        System.out.println(c.solution("1.1","1"));
    }
}
