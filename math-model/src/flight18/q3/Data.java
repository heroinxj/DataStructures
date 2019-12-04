package flight18.q3;

import flight18.q1.Deport;
import flight18.q1.Flight;
import flight18.q1.Passenger;

import java.util.List;

/**
 * @author Heroin X
 * @date 2019/9/10 22:27
 */
public class Data {
    int flightNum;
    int parkNum;
    List<Flight> flightList;
    List<Deport> deportList;
    List<Passenger> passengerList;
    int[][] isTypeMatching;
    int[][] isConflict;
    int[][][][] tranTime = {{{{15,28},{28,15}},{{35,48},{48,35}}},{{{35,48},{48,61}},{{20,38},{38,20}}}};;
    int[][] tranbTimeArea = {{10,15,20,25,20,25,25},{15,10,15,20,15,20,20},{20,15,10,25,20,25,25},{25,20,25,10,15,20,20},{20,15,20,15,10,15,15},
            {25,20,25,20,15,10,20},{25,20,25,20,15,20,10}};
    int[][][][] tranTimeSum;
    int[][] isAreaMatching;
}
