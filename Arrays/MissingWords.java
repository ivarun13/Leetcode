package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by varun on 10/26/16.
 */
public class MissingWords {

    public String[] missingwords(String s, String t)
    {
        String[] S_words = s.split("\\s+");
        String[] T_words = t.split("\\s+");
        List<String> result = new ArrayList<>();
        List<String> list1 = new ArrayList(Arrays.asList(S_words));
        List<String> list2 = new ArrayList(Arrays.asList(T_words));
        list1.removeAll(list2);
        String[] ans = new String[list1.size()];
        ans = list1.toArray(ans);
        System.out.println(ans.length);
        return result.toArray(ans);
    }


    public static void main(String[] args) {
        MissingWords m = new MissingWords();
        m.missingwords("I love lal lal lal yo","love lal");
    }
}
