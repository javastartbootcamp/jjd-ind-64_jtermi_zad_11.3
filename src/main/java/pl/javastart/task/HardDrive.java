package pl.javastart.task;

import pl.javastart.task.exception.IllegalParametersException;

public class HardDrive extends Component {

    int volume;

    public HardDrive(String modelName, String manufacturer, String serialNumber, int volume) {
        super(modelName, manufacturer, serialNumber);
        if (volume <= 0) {
            throw new IllegalParametersException("DYSK TWARDY: ");
        }
        this.volume = volume;
    }

    @Override
    public void printInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "volume=" + volume +
                ", modelName='" + modelName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
