package pl.javastart.task;

import pl.javastart.task.exceptions.IllegalParametersException;

public class HardDrive extends Component {

    int volume;

    public HardDrive(String modelName, String manufacturer, String serialNumber, int volume) {
        super(modelName, manufacturer, serialNumber);

        if (volume <= 0) {
            System.out.print("DYSK TWARDY");
            throw new IllegalParametersException();
        }
        this.volume = volume;
    }

    @Override
    void printInfo() {
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
