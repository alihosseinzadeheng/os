package ir.khodam.algorithms;

public class ProcessTable {
    private int code;
    private String name;
    private int durationInSeconds;
    private int arrivalTime;
    private int elapsedTime;
    private int finishTime;

    public ProcessTable(int code, String name, int durationInSeconds, int arrivalTime, int elapsedTime, int finishTime) {
        this.code = code;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
        this.arrivalTime = arrivalTime;
        this.elapsedTime = elapsedTime;
        this.finishTime = finishTime;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getElapsedTime() {
        return elapsedTime;
    }

    public int getFinishTime() {
        return finishTime;
    }

    @Override
    public String toString() {
        return "ProcessTable{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", durationInSeconds=" + durationInSeconds +
                ", arrivalTime=" + arrivalTime +
                ", elapsedTime=" + elapsedTime +
                ", finishTime=" + finishTime +
                '}';
    }
}
