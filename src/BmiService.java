public class BmiService {
    public int calculateBMI (double weight, double height ){

        return (int) (weight / (height * height));
    }
}
