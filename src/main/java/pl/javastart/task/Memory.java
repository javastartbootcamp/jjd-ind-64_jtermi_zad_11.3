package pl.javastart.task;

import pl.javastart.task.exception.IllegalParametersException;
import pl.javastart.task.exception.IllegalTemperatureException;
import pl.javastart.task.exception.TemperatureOverLimitException;

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

        validateSize(size);
        validateFrequency(frequency);
        validateTemperature(workingTemperature, maxSafeTemperature);

        this.size = size;
        this.baseFrequency = frequency;
        this.workingTemperature = workingTemperature;
        this.maxSafeTemperature = maxSafeTemperature;
        this.overClockedTemperature = workingTemperature;
        this.overClockedFrequency = frequency;
    }

    private void validateTemperature(double workingTemperature, double maxSafeTemperature) {
        if (workingTemperature <= 0 || maxSafeTemperature <= 0) {
            throw new IllegalParametersException("PAMIĘĆ RAM: ");
        }
        if (maxSafeTemperature < workingTemperature) {
            throw new IllegalTemperatureException("PAMIĘĆ RAM: ");
        }
    }

    private void validateSize(int size) {
        if (size <= 0) {
            throw new IllegalParametersException("PAMIĘĆ RAM: ");
        }
    }

    private void validateFrequency(int frequency) {
        if (frequency <= 0) {
            throw new IllegalParametersException("PAMIĘĆ RAM: ");
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
