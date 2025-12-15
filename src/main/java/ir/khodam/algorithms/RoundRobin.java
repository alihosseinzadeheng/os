package ir.khodam.algorithms;

import java.util.ArrayList;
import java.util.List;

public class RoundRobin extends Algorithm {
    private final int slice;
    private final List<ProcessTable> processList = new ArrayList<>();

    public RoundRobin(int slice) {
        this.slice = slice;
        execute();
    }

    public void execute() {
        System.out.println(slice);
        createProcessTable();
        processList.forEach(x -> System.out.println(x));
    }

    public void createProcessTable() {
        processList.addAll(List.of(
                new ProcessTable(1, "P1", 10, 0, 0, 0),
                new ProcessTable(2, "P2", 10, 5, 0, 0),
                new ProcessTable(3, "P3", 10, 10, 0, 0))
        );
    }
}
