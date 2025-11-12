public class Aquatic extends Robot{


    protected Double maximumDeep;
    protected PropulsionSystem propulsionSystem;


    @Override
    public void getTechnicalDescription() {
        System.out.println( name + " can go down " + maximumDeep + " using "  + propulsionSystem + " propulsion"
                + ". Manufactured by " + manufacturer + "in " + manufacturingYear);
    }


}
