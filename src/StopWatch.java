import java.util.Scanner;

public class StopWatch {
    private static long startTime;
    private static long endTime;

    public static long getStartTime() {
        startTime = System.currentTimeMillis();
        return startTime;
    }


    public static long getEndTime() {
        return endTime = System.currentTimeMillis();
    }

    static void Swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void InsectionSoft(int a[], int soluong) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[i] < a[j]) {
                    Swap(a[i], a[j]);
                }
            }
        }
    }

    static void Output(int a[], int soluong) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf(a[i]+ "\t");
        }
    }

    public static void main(String[] args) {
        long start = getStartTime();
        System.out.println("Nhap so luong: ");
        Scanner scanner = new Scanner(System.in);
        int soluong = scanner.nextInt();
        int a[] = {6,3,6,3,7,3,0};
        InsectionSoft(a, soluong);
        Output(a,soluong);
        long end = getEndTime();
        System.out.println("Time of running app: " + (end - start));
    }
}
