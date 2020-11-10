package popularmatch;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Follower implements Runnable {

    // Declare class variables
    int leaderPID;
    int PID;
    int[] preferenceList;

    // Constructor Method
    public Follower(int leaderPID, int PID, int[] preferenceList) {

        this.leaderPID = leaderPID;
        this.PID = PID;
        this.preferenceList = new int[preferenceList.length];

    }

    public void Start() {
        Thread newThread = new Thread(this);
        newThread.start();
    }

    @Override
    public void run() {
        System.out.println("Follower running with PID " + this.PID + "... Leader " + this.leaderPID + " called me!");
    }

}
