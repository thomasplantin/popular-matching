import popularmatch.Follower;
import popularmatch.Leader;

import org.junit.Test;
import static org.junit.Assert.*;

public class PopularMatchTest {

    private Follower[] initFollowers(int leaderPID, int N, int[][] preferenceLists) {
        Follower[] followers = new Follower[N];
        for(int i = 0; i < N; i++) {
            followers[i] = new Follower(leaderPID, i, preferenceLists[i]); //
        }
        return followers;
    }

    @Test
    public void t1() {

        int[][] preferenceLists = new int[][] { // Preference list of post for each applicant
                {1, 2, 3},
                {3, 2, 1},
                {1, 2, 3} // Last is leader
        };
        int N = preferenceLists.length;  // The total number of applicants
        int numFollowers = N-1;  // The number of followers (N minus the leader)
        int leaderPID = N-1;  // The leader PID
        int[] leaderPreferenceList = preferenceLists[leaderPID];  // The preference list of the leader
        Leader leader = new Leader(N, leaderPID, leaderPreferenceList); // Instantiate the leader applicant
        Follower[] followers = initFollowers(leaderPID, numFollowers, preferenceLists);  // Array of followers (N-1 because leader not part of them)
        leader.Start();
        for(Follower follower : followers) {
            follower.Start();
        }

    }

}
