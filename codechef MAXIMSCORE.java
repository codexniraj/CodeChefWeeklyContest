import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            int minScore = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                int score = findOptimalScore(A, i);
                if (score < minScore) {
                    minScore = score;
                }
            }
            System.out.println(minScore);
        }
    }

    private static int findOptimalScore(int[] A, int i) {
        int N = A.length;
        int maxScore = Integer.MIN_VALUE;
        for (int j = 0; j < N; j++) {
            if (Math.abs(i - j) == 1) {
                int score = Math.abs(A[i] - A[j]);
                if (score > maxScore) {
                    maxScore = score;
                }
            }
        }
        return maxScore;
    }
}