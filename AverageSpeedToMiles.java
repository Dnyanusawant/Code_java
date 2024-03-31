class AverageSpeedToMiles
 {
    public static void main(String[] args)
 {
        double kilometers = 14;
        double miles = kilometers / 1.6;
        double time = (45 * 60 + 30) / 3600.0; // Convert 45 minutes and 30 seconds to hours

        double avgSpeed = miles / time;
        System.out.println("Average Speed in Miles Per Hour: " + avgSpeed);
    }
}
