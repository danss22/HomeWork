import java.util.ArrayList;
import java.util.List;
    /*
Написать метод, который принимает список чисел и возвращает минимальное число из списка чисел.
В main продемонстрировать работу этого метода. Закоммитить, затем запушить эту з-чу в отдельный репозиторий.
Скинуть ссылку на этот репозиторий в чат.
 */
    public class Task {
        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(5);
            numbers.add(-87);
            numbers.add(15);
            numbers.add(-9);
            numbers.add(124);
            numbers.add(67);
            numbers.add(123);
            nums(numbers);
        }

        static int nums(List<Integer> numbers) {
            int min = 0;
            for (Integer number : numbers) {
                if (number < min) {
                    min = number;
                    System.out.println("Минимальное число: " + min);
                }
            }
            return min;
        }
    }

