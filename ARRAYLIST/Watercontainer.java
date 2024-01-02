import java.util.*;

public class Watercontainer {

    public static int maxcap(ArrayList<Integer> height) {
        int maxwater = 0;
        // brute force
        for (int i = 0; i < height.size(); i++) {
            for (int j = i+1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int wd = j-i;
                int water = ht*wd;

                maxwater = Math.max(maxwater, water);
            }
        }
        return maxwater;
    }

    // Max capacity with 2 pointer 
    public static int maxcap2p(ArrayList<Integer> height){
        int maxwater = 0;
        int lp = 0;
        int rp = height.size()-1;

          while(lp < rp){
            // water area
            int ht = Math.min(height.get(lp),height.get(rp));// height 
            int wd = rp - lp;// width
            int wa = ht * wd;// current water Area
            maxwater = Math.max(maxwater, wa);
            
            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
          }

        return maxwater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> heigth = new ArrayList<>();

        // 1 8 6 2 5 4 8 3 7
        heigth.add(1);
        heigth.add(8);
        heigth.add(6);
        heigth.add(2);
        heigth.add(5);
        heigth.add(4);
        heigth.add(8);
        heigth.add(3);
        heigth.add(7);

        System.out.println(maxcap(heigth));
        System.out.println(maxcap2p(heigth));
        
    }
}
// javac Watercontainer.java
// java Watercontainer