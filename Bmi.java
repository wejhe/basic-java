public class Bmi {
    public static void main(String[] args) {
        float weight = 70;
        float height = 170;
        float heightInMeters = height / 100;
        float bmi = weight / (heightInMeters * heightInMeters);
        System.out.println("Your BMI is: " + bmi);
    }
}