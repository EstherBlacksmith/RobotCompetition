import java.util.Objects;

public class Terrestrial extends Robot {


    protected Double maximumVelocity;
    protected PropulsionSystem propulsionSystem;

    public Terrestrial(Double maximumVelocity, PropulsionSystem propulsionSystem) throws Exception {
        if(maximumVelocity <0){
            throw new Exception("Velocity can't be negative");
        }

        this.maximumVelocity = maximumVelocity;
        this.propulsionSystem = Objects.requireNonNull(propulsionSystem);
    }

    public Double getMaximumVelocity() {
        return maximumVelocity;
    }

    protected void setMaximumVelocity(Double maximumVelocity) {
        this.maximumVelocity = maximumVelocity;
    }

    public PropulsionSystem getTractionSystem() {
        return propulsionSystem;
    }

    protected void setTractionSystem(PropulsionSystem propulsionSystem) {
        this.propulsionSystem = propulsionSystem;
    }


    @Override
    public String getTechnicalDescription() {
        return name + " .Manufactured by " + manufacturer + " in " + manufacturingYear +
                ". Use traction by " + propulsionSystem + " and can go until " + maximumVelocity;
    }
}
