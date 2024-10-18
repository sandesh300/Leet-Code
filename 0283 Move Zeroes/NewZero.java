
public class NewZero {
    public void moveZeroes(int[] num) {
        int j = 0, t;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                t = num[i];
                num[i] = num[j];
                num[j] = t;
                j++;
            }
        }
    }

}