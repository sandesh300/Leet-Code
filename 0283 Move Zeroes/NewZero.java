
public class NewZero {
    public void moveZeroes(int[] num) {
        int j = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
                j++;
            }
        }
    }

}