import java.util.*;

// Task 1
class Task1 {
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(key) == 0) {
                return i;
            }
        }
        return -1;
    }
}

// Task 2
class Task2 {
    public static <E extends Comparable<E>> E max(E[] list) {
        if (list == null || list.length == 0) {
            return null;
        }
        E max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(max) > 0) {
                max = list[i];
            }
        }
        return max;
    }
}

// Task 3
class Task3 {
    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        E max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        return max;
    }
}

// Task 4
class Task4 {
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();
        for (E item : list) {
            if (!result.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }
}

// Task 5
class Point implements Comparable<Point> {
    private int x;
    private int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    @Override
    public int compareTo(Point other) {
        if (this.x != other.x) {
            return Integer.compare(this.x, other.x);
        } else {
            return Integer.compare(this.y, other.y);
        }
    }


    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}


class CompareY implements Comparator<Point> {
    @Override
    public int compare(Point p1, Point p2) {
        if (p1.getY() != p2.getY()) {
            return Integer.compare(p1.getY(), p2.getY());
        } else {
            return Integer.compare(p1.getX(), p2.getX());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1: Generic linear search");
        Integer[] intArray = {1, 5, 3, 7, 9, 2};
        int index = Task1.linearSearch(intArray, 7);
        System.out.println("Index of key 7: " + index);
        System.out.println();

        // Task 2
        System.out.println("Task 2: Maximum element in an array");
        Double[] doubleArray = {3.5, 2.1, 4.8, 1.9};
        Double maxDouble = Task2.max(doubleArray);
        System.out.println("Maximum element: " + maxDouble);
        System.out.println();

        // Task 3
        System.out.println("Task 3: Largest element in ArrayList");
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "pear"));
        String maxString = Task3.max(stringList);
        System.out.println("Largest element: " + maxString);
        System.out.println();

        // Task 4
        System.out.println("Task 4: Distinct elements in ArrayList");
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5));
        ArrayList<Integer> distinctList = Task4.removeDuplicates(intList);
        System.out.println("Original list: " + intList);
        System.out.println("List with duplicates removed: " + distinctList);
        System.out.println();

        // Task 5
        System.out.println("Task 5: Sort points in a plane");
        // Creating 100 random points
        Random random = new Random();
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            points.add(new Point(x, y));
        }


        Collections.sort(points);
        System.out.println("Points sorted by x-coordinate:");
        System.out.println(points);


        Collections.sort(points, new CompareY());
        System.out.println("\nPoints sorted by y-coordinate:");
        System.out.println(points);

        // Task 6
        System.out.println("\nTask 6: Use iterators on linked lists");

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }


        long startTime = System.nanoTime();
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long iteratorTime = System.nanoTime() - startTime;


        startTime = System.nanoTime();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i);
        }
        long getIndexTime = System.nanoTime() - startTime;

        System.out.println("Time using Iterator: " + iteratorTime + " ns");
        System.out.println("Time using get(index): " + getIndexTime + " ns");
    }
}
