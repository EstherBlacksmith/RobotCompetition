public class Terrestrial extends Robot{


    protected Double maximumVelocity;
    protected TractionSystem tractionSystem;

    @Override
    public void getTechnicalDescription() {
        System.out.println(name + " .Manufactured by " + manufacturer + " in " + manufacturingYear +
            ". Use traction by " + tractionSystem + " and can go until " + maximumVelocity);
    }
}
