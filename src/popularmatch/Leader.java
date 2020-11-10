package popularmatch;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Leader implements Runnable {

    // Declare class variables
    int N;
    int PID;
    int[] preferenceList;
    Set<Integer> fPostsSet;
    Set<Integer> sPostsSet;
    int[] fPostsList;
    int[] sPostsList;
    HashMap<Integer, Integer> popularMatchHM;

    // Constructor Method
    public Leader(int N, int PID, int[] preferenceList) {

        this.N = N;
        this.PID = PID;
        this.preferenceList = new int[preferenceList.length];
        this.fPostsSet = new HashSet<Integer>();
        this.sPostsSet = new HashSet<Integer>();
        this.fPostsList = new int[N];
        this.sPostsList = new int[N];
        this.popularMatchHM = new HashMap<Integer, Integer>();

    }

    public void Start() {
        Thread newThread = new Thread(this);
        newThread.start();
    }

    @Override
    public void run() {

        System.out.println("Leader running with PID " + this.PID + "...");
        System.out.println("Leader calling followers");


    }

}
