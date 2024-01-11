public class Main {
    public static void main(String[] args){
        System.out.println(convertToCentimeters(500));
        System.out.println(convertToCentimeters(6, 12));
    }

    public static double convertToCentimeters(int heightInInches){
        double inchInCentimeters = 2.54;
        return heightInInches * inchInCentimeters;
    }

    public static double convertToCentimeters (int heightInFeet, int heightInInches){
        int oneFootToInches = 12;
        int result = heightInFeet * oneFootToInches + heightInInches;
        return convertToCentimeters(result);
    }
}



// one foot = 12 inches
// 1 inch = 2.54 cm;