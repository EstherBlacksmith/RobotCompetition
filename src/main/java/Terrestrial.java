public class Terrestrial extends Robot{


    protected Double maximumVelocity;
    protected TractionSystem tractionSystem;



    public Double getMaximumVelocity() {
        return maximumVelocity;
    }

    protected void setMaximumVelocity(Double maximumVelocity) {
        this.maximumVelocity = maximumVelocity;
    }

    public TractionSystem getTractionSystem() {
        return tractionSystem;
    }

    protected void setTractionSystem(TractionSystem tractionSystem) {
        this.tractionSystem = tractionSystem;
    }


    @Override
    public String getTechnicalDescription() {
        return name + " .Manufactured by " + manufacturer + " in " + manufacturingYear +
                ". Use traction by " + tractionSystem + " and can go until " + maximumVelocity;
    }
}
