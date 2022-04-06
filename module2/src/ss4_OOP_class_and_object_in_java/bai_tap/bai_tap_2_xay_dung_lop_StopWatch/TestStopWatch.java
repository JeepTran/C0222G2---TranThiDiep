package ss4_OOP_class_and_object_in_java.bai_tap.bai_tap_2_xay_dung_lop_StopWatch;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.setStartTime(System.currentTimeMillis());
        long start = stopWatch.getStartTime();

        int[] arrayNumber = new int[100000];
        for (int i = 0; i < arrayNumber.length; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < arrayNumber.length; j++) {
                if (arrayNumber[j] < arrayNumber[indexOfMin]) {
                    indexOfMin = j;
                }
                int temp = arrayNumber[indexOfMin];
                arrayNumber[indexOfMin] = arrayNumber[i];
                arrayNumber[i] = temp;
            }
        }
        stopWatch.setEndTime(System.currentTimeMillis());
        long end = stopWatch.getEndTime();
        System.out.println(stopWatch.getElapsedTime());
    }
}
