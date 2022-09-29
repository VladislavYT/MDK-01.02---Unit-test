public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.print("Результат сложения: ");
        calculator.plus(2,3);
        System.out.print("Результат вычетания: ");
        calculator.minus(6,3);
        System.out.print("Результат умножения: ");
        calculator.multi(5,5);
        System.out.print("Результат деления: ");
        calculator.division(10,5);
        System.out.print("Периметр квадрата: ");
        calculator.perimeter(5);
    }
}