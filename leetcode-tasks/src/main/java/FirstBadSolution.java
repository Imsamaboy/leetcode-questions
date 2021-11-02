public class FirstBadSolution {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int mid = left + (right - left) / 2;
        while (left < right) {
            if (isBadVersion(mid)) {    // API function
                right = mid;
            } else {
                left = mid + 1;
            }
            mid = left + (right - left) / 2;
        }
        return mid;
    }

    // gag
    private boolean isBadVersion(int mid) {
        return true;
    }
}
