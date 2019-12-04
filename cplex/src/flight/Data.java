package flight;

import java.util.List;

/**
 * @author Heroin X
 * @date 2019/9/10 21:33
 */
public class Data {
    int flightNum;
    int parkNum;
    List<Flight> flightList;
    List<Deport> deportList;
    List<Passenger> passengerList;
    int[][] isTypeMatching;
    int[][] isConflict;
    int[][][][][] tranTime = {{{{{15,0},{20,1}},{{20,1},{15,0}}},{{{35,0},{40,1}},{{40,1},{35,0}}}},{{{{35,0},{40,1}},{{40,1},{45,2}}},{{{20,0},{30,1}},{{30,1},{20,0}}}}};
}
