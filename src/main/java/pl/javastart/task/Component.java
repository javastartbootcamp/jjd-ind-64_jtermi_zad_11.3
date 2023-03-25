package pl.javastart.task;

import pl.javastart.task.exceptions.IllegalManufacturerDetailsExcerption;

public abstract class Component {

    String modelName;
    String manufacturer;
    String serialNumber;

    public Component(String modelName, String manufacturer, String serialNumber) {

        if (modelName == null || manufacturer == null || serialNumber == null) {
            throw new IllegalManufacturerDetailsExcerption();
        }

        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
    }

    abstract void printInfo();
}
