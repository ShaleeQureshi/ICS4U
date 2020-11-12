public class Test {
    public static void main(String[] args) {
        int[] num = { 1, 13, 17, 19, 3, 11 };
        num = SortingMethods.insertionSortAscending(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}