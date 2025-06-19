package sortingcustomerorders;

public class SortOrders {

    public static void bubbleSort(Order[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j].getTotalPrice() > arr[j + 1].getTotalPrice()) {
                    Order temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void quickSort(Order[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    private static int partition(Order[] arr, int low, int high) {
        double pivot = arr[high].getTotalPrice();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j].getTotalPrice() <= pivot) {
                i++;
                Order temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Order temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Alice", 2500),
            new Order(102, "Bob", 1700),
            new Order(103, "Carol", 3800),
            new Order(104, "Dave", 900),
            new Order(105, "Eve", 4300)
        };

        Order[] bubbleSorted = orders.clone();
        bubbleSort(bubbleSorted);
        System.out.println("Bubble Sort:");
        for (Order o : bubbleSorted) System.out.println(o);

        Order[] quickSorted = orders.clone();
        quickSort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("Quick Sort:");
        for (Order o : quickSorted) System.out.println(o);
    }
}
