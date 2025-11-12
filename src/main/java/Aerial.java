public class Aerial extends Robot{

    protected Double maximumAltitud;
    protected int flightAutonomy;

    @Override
    public String getTechnicalDescription() {
        return name + " can fly until " + maximumAltitud + " during " + flightAutonomy + "." +
                ". Fabricated in " + manufacturingYear + " by " + manufacturer;

    }
}
