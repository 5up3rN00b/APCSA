package Practice12020.Practice12020FRE3;

import java.util.*;

public class Recipients {
    private ArrayList<String> lines;

    public Recipients() {

    }

    public String extractCity(String cityZip) {
        int commaIndex = cityZip.indexOf(",");

        return cityZip.substring(0, commaIndex);
    }

    public String getAddress(String name) {
        int size = lines.size();
        for (int i = 0; i < size; i++) {
            if (lines.get(i).equals(name)) {
                int index = i;
                String addStr = lines.get(index), finalStr = "";
                while (!addStr.equals("")) {
                    finalStr += addStr + "\n";
                    index++;
                    addStr = lines.get(index);
                }

                return finalStr.trim();
            }
        }

        return "Not found";
    }
}
