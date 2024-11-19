public class Main {
    public static void main(String[] args) {
        double weight = 95.0; // Вес в килограммах
        double height = 1.85; // Рост в метрах

        // Создание объекта и вызов метода calculate
        BmiService bmiService = new BmiService();
        double bmi = bmiService.calculateBMI(weight, height);

        // Вывод результата в консоль
        System.out.print("Ваш индекс массы тела (ИМТ) составляет: " + bmi + " ");

        // Использование условных операторов для вывода категории ИМТ
        if (bmi < 18.5) {
            System.out.println("Вы недостаточно толсты.");
        } else if (bmi < 25) {
            System.out.println("Нормальный.");
        } else if (bmi < 30) {
            System.out.println("Избыточный вес");
        } else {
            System.out.println("Страдающий ожирением.");
        }

    }
}
