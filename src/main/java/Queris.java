import java.util.List;

public class Queris {

/*1. **Listar todos los robots** registrados con su descripción técnica.
2. **Filtrar robots terrestres con velocidad mayor a X km/h**.
            3. **Buscar robots por fabricante** (sin importar el tipo).*/

    protected void getRobotsByTechDescription(List<Robot> robotsToList){
        robotsToList.stream()
                .forEach((robot) ->
                {
                    System.out.println(robot.name + ". Technical description" + robot.getTechnicalDescription());
                });

    }
}
