package pl.javastart.task;

import pl.javastart.task.exceptions.IllegalParametersException;
import pl.javastart.task.exceptions.IllegalTemperatureException;
import pl.javastart.task.exceptions.TemperatureOverLimitException;

public class Memory extends Component implements Overclockable {

    private static final int TEMPERATURE_RISE = 15;
    private static final int OVERCLOCKING_STEP = 100;

    private int size;
    private int baseFrequency;
    private double workingTemperature;
    private double maxSafeTemperature;

    private double overClockedTemperature;
    private double overClockedFrequency;

    public Memory(String modelName, String manufacturer, String serialNumber, int size, int frequency, double workingTemperature, double maxSafeTemperature) {
        super(modelName, manufacturer, serialNumber);
        if (size <= 0 || frequency <= 0 || workingTemperature <= 0 || maxSafeTemperature <= 0) {
            System.out.print("PAMIĘĆ RAM:");
            throw new IllegalParametersException();
        }
        if (maxSafeTemperature < workingTemperature) {
            System.out.print("PAMIĘĆ RAM:");
            throw new IllegalTemperatureException();
        }
        this.size = size;
        this.baseFrequency = frequency;
        this.workingTemperature = workingTemperature;
        this.maxSafeTemperature = maxSafeTemperature;
        this.overClockedTemperature = workingTemperature;
        this.overClockedFrequency = frequency;
    }

    @Override
    public void overclock() {
        if (maxSafeTemperature < overClockedTemperature + TEMPERATURE_RISE) {
            throw new TemperatureOverLimitException();
        }
        overClockedTemperature += TEMPERATURE_RISE;
        overClockedFrequency += OVERCLOCKING_STEP;
    }

    @Override
    void printInfo() {
        System.out.println("Parametry pracy: \n" + toString());
    }

    @Override
    public String toString() {
        return "Memory{" +
                "frequency=" + baseFrequency +
                ", workingTemperature=" + workingTemperature +
                ", maxSafeTemperature=" + maxSafeTemperature +
                "\noverClockedTemperature=" + overClockedTemperature +
                ", overClockedFrequency=" + overClockedFrequency +
                '}';
    }
}
