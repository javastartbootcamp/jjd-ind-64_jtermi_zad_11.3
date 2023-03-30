package pl.javastart.task;

import pl.javastart.task.exception.IllegalManufacturerDetailsExcerption;

public abstract class Component {

    protected String modelName;
    protected String manufacturer;
    protected String serialNumber;

    public Component(String modelName, String manufacturer, String serialNumber) {

        if (modelName == null || manufacturer == null || serialNumber == null) {
            throw new IllegalManufacturerDetailsExcerption();
        }

        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
    }

    public void printInfo() {
    }
}
