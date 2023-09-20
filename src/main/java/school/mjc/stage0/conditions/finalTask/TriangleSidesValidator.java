package school.mjc.stage0.conditions.finalTask;

public class TriangleValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide + secondSide > thirdSide &&
                firstSide + thirdSide > secondSide &&
                secondSide + thirdSide > firstSide) {
            System.out.println("This is a valid triangle");
        } else {
            System.out.println("It's not a triangle");
        }
    }
}