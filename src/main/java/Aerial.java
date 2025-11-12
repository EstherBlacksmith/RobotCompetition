import java.util.Objects;

public class Aerial extends Robot {

    protected Double maximumAltitud;
    protected int flightAutonomy;

    public Aerial(Double maximumAltitud, int flightAutonomy) throws Exception {
        if(flightAutonomy <0){
            throw new Exception("Velocity can't be negative");
        }
        this.maximumAltitud = Objects.requireNonNull(maximumAltitud);
        this.flightAutonomy = flightAutonomy;
    }

    @Override
    public String getTechnicalDescription() {
        return name + " can fly until " + maximumAltitud + " during " + flightAutonomy + "." +
                ". Fabricated in " + manufacturingYear + " by " + manufacturer;

    }
}
