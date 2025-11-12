import java.util.Objects;

public class Aquatic extends Robot {


    protected Double maximumDeep;

    public Aquatic(Double maximumDeep, PropulsionSystem propulsionSystem) {
        this.maximumDeep = Objects.requireNonNull(maximumDeep);
        this.propulsionSystem = Objects.requireNonNull(propulsionSystem);
    }

    protected PropulsionSystem propulsionSystem;


    @Override
    public String getTechnicalDescription() {
        return name + " can go down " + maximumDeep + " using " + propulsionSystem + " propulsion"
                + ". Manufactured by " + manufacturer + "in " + manufacturingYear;
    }


}
