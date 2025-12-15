package ir.khodam;

public class AlgorithmSelector {
    public AlgorithmSelector() {
    }

    public Algorithm select(String number) {
        return switch (number) {
            case "1" -> Algorithm.ROUND_ROBIN;
            default -> Algorithm.UNKNOWN;
        };
    }

    public enum Algorithm {
        ROUND_ROBIN,
        UNKNOWN
    }
}
