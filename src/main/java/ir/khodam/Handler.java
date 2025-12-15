package ir.khodam;

import ir.khodam.algorithms.RoundRobin;

public class Handler {
    public Handler() {
        handle();
    }

    public void handle() {
        var algorithmSelector = new AlgorithmSelector();
        var select = algorithmSelector.select("1");
        if (AlgorithmSelector.Algorithm.ROUND_ROBIN == select) {
            new RoundRobin(5);
        }
    }
}
