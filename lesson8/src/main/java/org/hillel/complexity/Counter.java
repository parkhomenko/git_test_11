package org.hillel.complexity;

public class Counter {

    private int n;

    public Counter(int n) {
        this.n = n;
    }

    public int countInCycle() {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public int countByFormula() {
        int result = (1 + n) * n / 2;
        return result;
    }
}
