 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String table = getMultiplicationTable(5);
        return table;
    }

    public static String getLargeMultiplicationTable() {
        String table = getMultiplicationTable(10);
        return table;
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        for (int x = 1; x <= tableSize; x++) {
            for (int y = 1; y <= tableSize; y++) {
                int entry = (x * y);
                    if (String.valueOf(entry).length() == 1) {
                        table += ("  " + entry + " |");}
                        else if (String.valueOf(entry).length() == 2) {
                            table += (" " + entry + " |");}
                            else {table += (entry + " |");}
                if (y == tableSize) {table += "\n";}
            }
        }

        return table;
        
        
        
    }
}
