import java.util.ArrayList;
import java.util.List;

public class Queris {


    protected void getRobotsByTechDescription(List<Robot> robotsToList){
        robotsToList.stream()
                .forEach((robot) ->                {
                    System.out.println(robot.getName() +". Technical description" + robot.getTechnicalDescription());
                });
    }

    protected List<Terrestrial> getTerrestrialRobots(List<Terrestrial> robotsToList){

        List<Terrestrial> robotsByTypeTerrestrial = new ArrayList<>();

        for (Robot robot : robotsToList) {
            if (robot.getRobotType().compareTo(RobotType.TERRESTRIAL) > 0) {
                robotsByTypeTerrestrial.add((Terrestrial) robot);
            }
        }
        return robotsByTypeTerrestrial;
    }


    protected List<Robot> getRobotsByManufacturer(List<Robot> robotsToList, String manufacturer){
        List<Robot> robotsByManufacturer =robotsToList.stream()
                .filter(robot -> robot.getManufacturer().equalsIgnoreCase(manufacturer))
                .toList();

        return robotsByManufacturer;
    }


    protected List<Terrestrial> getTerrestrialRobotsByVelocity(List<Terrestrial> robotsToList, double maxVelocity){
        List<Terrestrial> robotsTerrestrialMaxVelocity = List.of();

        robotsTerrestrialMaxVelocity = getTerrestrialRobots(robotsToList).stream()
                .filter(terrestrial -> terrestrial.getMaximumVelocity() > maxVelocity)
                .toList();

        return robotsTerrestrialMaxVelocity;
    }
}
