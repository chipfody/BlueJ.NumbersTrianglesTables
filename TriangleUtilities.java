 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String stars = "";
        for (int i = 1; i <= numberOfStars; i++) {
            stars = stars.concat("*");}
        return stars;
    }
    
    public static String getTriangle(int numberOfRows) {
        String triangle = "";
        for (int i = 1; i<= numberOfRows; i++) {
            triangle += getRow(i) + "\n";}
        return triangle;
    }


    public static String getSmallTriangle() {
      String SmallTriangle = getTriangle(4);
      return SmallTriangle;
    }

    public static String getLargeTriangle() {
        String LargeTriangle = getTriangle(9);
        return LargeTriangle;
    }
}
