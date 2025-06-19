package financialforecasting;

public class FinancialForecast {

    public static double futureValueRecursive(double value, double rate, int years) {
        if (years == 0) return value;
        return futureValueRecursive(value, rate, years - 1) * (1 + rate);
    }

    public static double futureValueMemo(double value, double rate, int years, double[] memo) {
        if (years == 0) return value;
        if (memo[years] != 0) return memo[years];
        memo[years] = futureValueMemo(value, rate, years - 1, memo) * (1 + rate);
        return memo[years];
    }

    public static void main(String[] args) {
        double initial = 10000;
        double rate = 0.08;
        int years = 5;

        double result1 = futureValueRecursive(initial, rate, years);
        System.out.println("Recursive Forecast: " + result1);

        double[] memo = new double[years + 1];
        double result2 = futureValueMemo(initial, rate, years, memo);
        System.out.println("Memoized Forecast: " + result2);
    }
}

