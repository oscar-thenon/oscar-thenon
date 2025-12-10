public class Lasagna {
    public static int expectedMinutesInOven() {
        return 40;
    }
    
    public static int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutesInOven()-minutesInOven;
    }

    public static int preparationTimeInMinutes(int numberOfLayers) {
        return 2*numberOfLayers;
    }

    public static int totalTimeInMinutes(int numberOfLayers, int minutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + minutesInOven;
    }
}
