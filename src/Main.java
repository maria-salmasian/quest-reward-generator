public class Main {
    final static double STEEPNESS = 0.1; //larger for small datasets, smaller for larger datasets

    public static String questRewardGenerator(int n) {
        StringBuilder chest = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            double deterministicRandom = (Math.sin(i) + 1) / 2;
            if (deterministicRandom > logistic(i, n)) {
                chest.append('b');
            } else {
                chest.append('s');
            }
        }
        return chest.toString();
    }

    private static double logistic(int x, int n) {
        return 1 / (1 + Math.exp(-STEEPNESS * (x - (n / 2.0)))); //where n/2.0 is the mid
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println(questRewardGenerator(n));
    }
}