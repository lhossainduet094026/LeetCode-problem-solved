class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
          int totalStudent = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (queryTime <= endTime[i] && queryTime >= startTime[i]) {
                totalStudent += 1;
            }
        }
        return totalStudent;
    }
}