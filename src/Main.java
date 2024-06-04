public class Main {
    public static void main(String[] args) {
        // let's do this
        double costWinter = 0.00;
        double costSpring = 0.00;
        double costSummer = 0.00;
        double costFall = 0.00;
        double costYear = 0.00;

        System.out.println("Please enter your home maintenance costs for Winter.");
        costWinter = 3500.43;

        System.out.println("You entered " + costWinter + " for Winter.  Please enter home " +
                "maintenance costs for Spring.");
        costSpring = 472.72;

        System.out.println("You entered " + costSpring + " for Spring.  Please enter home " +
                "maintenance costs for Summer.");
        costSummer = 1141.29;

        System.out.println("You entered " + costSummer + " for Summer.  Please enter home " +
                "maintenance costs for Fall.");
        costFall = 4843.91;

        costYear = costWinter + costSpring + costSummer + costFall;

        System.out.println("Your seasonal totals are " + costWinter + " for " +
                "Winter, " + costSpring + " for Spring, " + costSummer + " for Summer, and " + costFall + " for " +
                "Fall.");
        System.out.println("Your yearly maintenance costs total " + costYear + ".");

        // psuedocode:
        // if costYear >= 10000
        //    output "Consider a renter lifestyle."
        // endIf

    }
}