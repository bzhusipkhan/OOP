import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Задание 1:
        Set<String> set1 = new LinkedHashSet<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        Set<String> set2 = new LinkedHashSet<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));

        Set<String> cloneSet1 = new LinkedHashSet<>(set1);
        Set<String> cloneSet2 = new LinkedHashSet<>(set2);

        Set<String> union = new LinkedHashSet<>(set1);
        union.addAll(set2);

        Set<String> difference1 = new LinkedHashSet<>(set1);
        difference1.removeAll(set2);

        Set<String> intersection = new LinkedHashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("Set 1: " + cloneSet1);
        System.out.println("Set 2: " + cloneSet2);
        System.out.println("Union: " + union);
        System.out.println("Difference (Set 1 - Set 2): " + difference1);
        System.out.println("Intersection: " + intersection);

        System.out.println();

        // Задание 2:
        Stack<Integer> primeStack = new Stack<>();
        int count = 0;
        int number = 2;

        while (count < 50) {
            if (isPrime(number)) {
                primeStack.push(number);
                count++;
            }
            number++;
        }

        System.out.println("First 50 prime numbers in descending order:");
        while (!primeStack.isEmpty()) {
            System.out.print(primeStack.pop() + " ");
        }

        System.out.println();

        // Задание 3:
        GenericQueue<String> queue = new GenericQueue<>();
        queue.offer("Item 1");
        queue.offer("Item 2");
        queue.offer("Item 3");

        System.out.println("GenericQueue items:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println();

        // Задание 4:
        MyPriorityQueue<Integer> priorityQueue = new MyPriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.offer(10);
        priorityQueue.offer(30);
        priorityQueue.offer(20);

        System.out.println("PriorityQueue items:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }

    // Метод для проверки prime num
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // task3
    static class GenericQueue<E> extends LinkedList<E> {
        // Методы offer и poll уже реализованы в LinkedList и используются для добавления и извлечения элементов в очереди.
        // Мы можем добавить дополнительные методы или переопределить поведение при необходимости.
    }

    // task4
    static class MyPriorityQueue<E> extends PriorityQueue<E> {
        public MyPriorityQueue(Comparator<? super E> comparator) {
            super(comparator);
        }

    }
}