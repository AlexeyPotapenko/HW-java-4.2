public class BmiService {

    public int calculate(int weight, double height) {
        double BodyMassIndex = weight / (height * height);
        return (int) BodyMassIndex;
    }


}
