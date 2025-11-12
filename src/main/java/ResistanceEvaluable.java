import java.util.List;
import java.util.stream.Stream;

public class ResistanceEvaluable {
    List<Robot> robotsToList;
    Queries queries = new Queries();

    public ResistanceEvaluable(List<Robot> robotsToList) {

    }

    private List<Robot> getResistanceReport(List<Robot> robotsToList) {
        List<Robot> evaluatedRobots = queries.getRobotsByType(this.robotsToList);

        Stream<Robot> robotStream = evaluatedRobots.stream()
                .filter(robot -> robot.getRobotType().compareTo(RobotType.TERRESTRIAL) > 0)
                //    && robot.getPropulsionSystem().compareTo(PropulsionSystem.CATERPILLAR))
                .filter(robot -> robot.getRobotType().compareTo(RobotType.AERIAL) > 0);

        return evaluatedRobots;
    }


}
