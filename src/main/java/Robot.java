import java.util.Date;

public abstract class Robot {
    String name;
    String manufacturer;
    int manufacturingYear;
    Date registrationDate;
    RobotType robotType;
    PropulsionSystem propulsionSystem;

    public PropulsionSystem getPropulsionSystem() {
        return propulsionSystem;
    }

    protected void setPropulsionSystem(PropulsionSystem propulsionSystem) {
        this.propulsionSystem = propulsionSystem;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public RobotType getRobotType() {

        return robotType;
    }

    String getTechnicalDescription() {
        return "";
    }
}
