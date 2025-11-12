public class Aerial extends Robot{

    protected Double maximumAltitud;
    protected int flightAutonomy;

    @Override
    public void getTechnicalDescription() {
        System.out.println(name + " can fly until " + maximumAltitud + " during " + flightAutonomy + "." +
                ". Fabricated in " + manufacturingYear + " by " + manufacturer);

    }
}
