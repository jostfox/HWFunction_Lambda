import java.util.function.Function;

public class FunctionApp {

    public static void main(String[] args) {

        // Task 1
        printTask(1);

        Function<Integer, Integer> multTen = dig -> dig * 10;
        Function<Integer, Integer> plusOne = dig -> dig + 1;
        Function<Integer, Integer> plusThree = dig -> dig + 3;

        Function<Integer, Integer> funcExercise = multTen.andThen(plusOne).andThen(plusThree).andThen(multTen);
        System.out.println(funcExercise.apply(3));

        //Task 2
        printTask(2);

        Function<Integer, Integer> factorialFunction = number -> {
            if (number == 0)
                return 1;
            int init = 1;
            for (int i = 1; i <= number; i++) {
                init = init * i;
            }
            return init;
        };

        System.out.printf("Факториал равен: %d", factorialFunction.apply(5));
    }

    public static void printTask(int num) {
        System.out.printf("\nTask %d", num);
        System.out.println("\n=================");
    }
}
