import java.util.ArrayList;
import java.util.Comparator;

public class FinishMaximumJob {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<JobDetails> jobs = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            jobs.add(new JobDetails(A.get(i), B.get(i)));
        }
        jobs.sort(Comparator.comparingInt(JobDetails::getStart).thenComparingInt(JobDetails::getEnd));
        int count = 0;
        int end = 0;
        for (int i = 0; i < jobs.size(); i++) {
            if (jobs.get(i).start >= end) {
                count++;
                end = jobs.get(i).end;
            } else {
                if (jobs.get(i).end <= end) {
                    end = jobs.get(i).end;
                }
            }
        }
        return count;
    }
}

class JobDetails {
    int start;
    int end;

    public JobDetails(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}