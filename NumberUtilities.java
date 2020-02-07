


public class NumberUtilities {

    public static String getRange(int stop) {
        String range = "";
        range = getRange(0,stop,1);
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = "";
        range = getRange(start, stop, 1);
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        for (int i = start; i < stop; i += step) {
            range += i;}
            return range;
    }

    public static String getEvenNumbers(int start, int stop) {
        String range = "";
        if (start % 2 == 0){
            start = start;}
        else {start = start + 1;}
        range = getRange(start, stop, 2);
        return range;
    }


    public static String getOddNumbers(int start, int stop) {
        String range = "";
        if (start % 2 == 1) { 
            start = start;}
        else {start = start + 1;}
        range = getRange(start, stop, 2);
        return range;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String range = "";
        for (int i = start; i <= stop; i++) {
            int last = (int)Math.pow(i, exponent);
            range += last;}
        return range;
    }
}
