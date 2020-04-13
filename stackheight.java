public class Main {
    public static int SumofStack(int stk1[], int stk2[]) {
        int h1 = 0, h2 = 0;

        for (int i = 0; i < stk1.length; i++){
            h1 += stk1[i];
        }
        for (int i=0; i < stk2.length; i++){
            h2 += stk2[i];
        }
        if (h1 == h2) {
            return h1;
        }
        int stk1Index = stk1.length - 1;
        int stk2Index = stk2.length - 1;


        while (h1 != h2) {
            if (h1 > h2) {
                h1 -= stk1[stk1Index];
                stk1[stk1Index--] = 0;
            } else if (h2 > h1) {
                h2 -= stk2[stk2Index];
                stk2[stk2Index--] = 0;
            }
        }
        return h1;
    }
    public static void main(String[] args) {
        int stack1[] = { 1, 2, 4, 5, 3, 4 };
        int stack2[] = { 5, 6, 1, 1, 1, 3, 1, 2 };
        System.out.println(SumofStack(stack1, stack2));
    }
}
