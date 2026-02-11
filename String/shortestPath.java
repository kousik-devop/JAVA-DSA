package String;

public class shortestPath {

    public static float getShortestPath(String path){
        int x = 0;
        int y = 0;

        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            //north
            if(dir == 'N'){
                y++;
            }
            //south
            else if(dir == 'S'){
                y--;
            }
            //east
            else if(dir == 'E'){
                x++;
            }
            //west
            else{
                x--;
            }
        }
        //distance formula
        float distance = (float) Math.sqrt((x*x) + (y*y));
        System.out.println("Shortest Path is: " + distance);
        return distance;
    }
    public static void main(String[] args){
        String path = "WNEENESENNN";
        float shortPath = getShortestPath(path);
        System.out.println(shortPath);
    }
}
