package topinterview.other;

/**
 * @author Heroin X
 * @date 2020/3/5 10:40
 */
public class DistributeCandy {

    public static void main(String[] args) {
        int[] ints = new DistributeCandy().distributeCandies(10, 3);
        System.out.println(ints);
    }

    public int[] distributeCandies(int candies, int num_people) {
            int x = 1;
            while((x+1)*x/2 <= candies){
                x++;
            }
            // Sum x > candy
            int restx = candies - x*(x-1)/2;
            x = x-1;
            int count = x / num_people;
            int cols = x % num_people;

            //initial
            int[] rest = new int[num_people];
            for(int j=0; j< count; j++){
                for(int i=0; i< num_people; i++){
                    rest[i] = rest[i]+i+1+j*num_people;
                }
            }


            for(int i=0; i<cols;i++){
                rest[i] = rest[i] + i +1+count*num_people;
            }
            rest[cols] = rest[cols]+restx;
            return rest;
        }

}
