public class miniMax {

    static final int MAX = 99999;
    static final int MIN = -99999;

    public static int minimax(int depth, int nodeIndex, boolean maximizingPlayer, int[] values) {

        if (depth == 3)
            return values[nodeIndex];

        if (maximizingPlayer) {
            int best = MIN;

            for (int i = 0; i < 2; i++) {
                int val = minimax(depth + 1, nodeIndex * 2 + i, false, values);
                best = Math.max(best, val);
            }
            return best;
        } else {
            int best = MAX;

            for (int i = 0; i < 2; i++) {
                int val = minimax(depth + 1, nodeIndex * 2 + i, true, values);
                best = Math.min(best, val);
            }
            return best;
        }
    }

    public static void main(String[] args) {
        int[] values = { 3, 5, 6, 9, 1, 2, 0, -1 };
        System.out.println("The optimal value is : " + minimax(0, 0, true, values));
    }
}