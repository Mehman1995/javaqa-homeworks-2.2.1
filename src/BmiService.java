public class BmiService {
    public double calculateBMI (double weight, double height ){
        return (int) (weight / (height * height));
    }
}
