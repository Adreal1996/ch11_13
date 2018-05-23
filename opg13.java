package ch11;

/* Write a method isUnique that accepts a map whose keys and values are strings as a parameter
and returns true if no two keys map to the same value (and false if any two or more keys do map to the same value).
For example, if themapcontainsthefollowingkey/valuepairs,yourmethodwouldreturntrue:{Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}.
But calling it on the following map would return false, because of two mappings for Perkins and Reges: {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}. */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class opg13
{
    public static void main(String[] args)
    {
        Map<String, String> mapOne = new HashMap<>();
        mapOne.put("Kendrick", "Perkins");
        mapOne.put("Suart", "Reges");
        mapOne.put("Jessica", "Miller");
        mapOne.put("Bruce", "Reges");
        mapOne.put("Hal", "Perkins");

        System.out.println(isUnique(mapOne));
    }

    public static boolean isUnique (Map<String, String> map)
    {
        Set<String> temportSet = new HashSet<>();
        for (Map.Entry<String, String> mapValue : map.entrySet())

        {
            temportSet.add(mapValue.getValue());
        }

        if (temportSet.size() == map.size())
        {
            return true;
        }

        return false;
    }
}
