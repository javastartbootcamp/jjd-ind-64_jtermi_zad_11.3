package pl.javastart.task;

import pl.javastart.task.exception.IllegalParametersException;
import pl.javastart.task.exception.IllegalTemperatureException;
import pl.javastart.task.exception.TemperatureOverLimitException;

public class Processor extends Component implements Overclockable {
    private static final int TEMPERATURE_RISE = 10;
    private static final int OVERCLOCKING_STEP = 100;
    private int baseFrequency;
    private double workingTemperature;
    private double maxSafeTemperature;
    private double overClockedTemperature;
    private double overClockedFrequency;

    public Processor(String modelName, String manufacturer, String serialNumber, int frequency, double workingTemperature, double maxSafeTemperature) {
        super(modelName, manufacturer, serialNumber);
        validateFrequency(frequency);
        validateTemperature(workingTemperature, maxSafeTemperature);

        this.baseFrequency = frequency;
        this.workingTemperature = workingTemperature;
        this.maxSafeTemperature = maxSafeTemperature;
        this.overClockedTemperature = workingTemperature;
        this.overClockedFrequency = frequency;
    }

    private void validateTemperature(double workingTemperature, double maxSafeTemperature) {
        if (workingTemperature <= 0 || maxSafeTemperature <= 0) {
            throw new IllegalParametersException("PROCESOR: ");
        }
        if (maxSafeTemperature < workingTemperature) {
            throw new IllegalTemperatureException("PROCESOR: ");
        }
    }

    private void validateFrequency(int frequency) {
        if (frequency <= 0) {
            throw new IllegalParametersException("PROCESOR: ");
        }
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
    public void printInfo() {
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
