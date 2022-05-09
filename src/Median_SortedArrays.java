public class Median_SortedArrays {


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = 0, r1 = nums1.length - 1;
        int l2 = 0, r2 = nums1.length - 1;

        while (l1 <= r1)  {

            int m1 = l1 + (r1 - l1) / 2;

            while (l2 <= r2) {

                int m2 = l2 + (r2 - l2) / 2;

                if (nums1[m2] == nums2[m1])
                    return m1;

                if (nums1[m2] < nums2[m1])
                    r2 = m2 - 1;
                else
                    l2 = m2 + 1;

            }
        }
        return -1;
    }

    public  static void main(String[] args) {
        System.out.println("median test is working ");
    }

}
