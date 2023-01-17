public class Main {
    public static int longestSortedSequence(int[] list) {
        int maxLength = 0;
        int currentLength = 0;
        for (int i = 0; i < list.length; i++) {
            if (i == 0 || list[i] >= list[i - 1]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] list = new int[]{1,2,3,4,5,1,8,9,5};
        System.out.println(longestSortedSequence(list));
    }
}