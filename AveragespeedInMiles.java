class AveragespeedInMiles
 {
    public static void main(String[] args)
    {
        double kilometers = 14;
        double miles = kilometers / 1.6;
        double timeInHours = 45.5 / 60;
        double avgSpeed = miles / timeInHours;

        System.out.println("Average Speed in Miles Per hour - " + avgSpeed);
    }
}
