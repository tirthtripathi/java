import java.util.*;

public class Activityselection{
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        //sorting
        int activity[][] = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activity[i][0]=i;
            activity[i][1]=start[i];
            activity[i][2]=end[i];
        }

        //lambda function -> sorting
        Arrays.sort(activity, Comparator.comparingDouble( o -> o [2]));
        //end time basis sorted 
       int maxAct = 0;
       ArrayList<Integer> ans = new ArrayList<>();

       //first activity
       maxAct = 1;
       ans.add(activity[0][0]);

       int lastend = activity[0][2];

       // select activity
       for(int i=1;i<end.length;i++){
           if(activity[i][1]>=lastend){
            maxAct++;
            ans.add(activity[i][0]);
            lastend = activity[i][2];
           }
       }

       System.out.println("max Activity: "+maxAct);

       System.out.println(ans);
    }
}
//javac Activityselection.java
//java Activityselection