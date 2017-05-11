package Others;

import ClassDesign.Apartment;

import java.util.*;

/**
 * Created by varun on 12/10/16.
 */
public class  Fundomates {



    public static void main(String[] args) {
        Apartment a1 = new Apartment(1,1);
        Apartment a2 = new Apartment(2,1);
        Apartment a3 = new Apartment(1,1);
        Apartment a4 = new Apartment(2,1);
        Apartment a5 = new Apartment(2,1.5);
        Apartment a6 = new Apartment(2,1.5);
        Apartment a7 = new Apartment(3,2);
        Apartment a8 = new Apartment(3,2);
        Apartment a9 = new Apartment(1,1.5);
        Apartment a10 = new Apartment(3,2);

        List<Apartment> apartmentList = new ArrayList<>();
        apartmentList.addAll(Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10));

        Fundomates f = new Fundomates();
        f.solution(apartmentList);


    }

    public Map<String, List<Apartment>> solution(List<Apartment> apartmentList)
    {
        Map<String,List<Apartment>> map = new HashMap<>();
        for(Apartment a : apartmentList)
        {
            String key = a.getBed()+"B"+a.getBath()+"b";
            List<Apartment> list = map.get(key);

            if(list == null)
            {
                list = new ArrayList<>();
                map.put(key,list);
            }
            list.add(a);
        }

        for (Map.Entry<String,List<Apartment>> entry : map.entrySet())
        {
            System.out.print(entry.getKey());
            for(Apartment apt : entry.getValue())
            {
                System.out.println("  ---  "+ apt.getBed()+"bed && "+apt.getBath()+"bath" );
            }
        }
        return map;
    }

}
