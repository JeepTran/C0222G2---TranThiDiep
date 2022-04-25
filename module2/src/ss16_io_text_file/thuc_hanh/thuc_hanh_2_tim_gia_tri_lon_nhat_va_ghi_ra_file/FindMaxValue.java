package ss16_io_text_file.thuc_hanh.thuc_hanh_2_tim_gia_tri_lon_nhat_va_ghi_ra_file;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("E:\\CodeGym 02.2022\\C0222G2\\C0222G2_TranThiDiep\\module2\\src\\ss16_io_text_file\\thuc_hanh\\thuc_hanh_2_tim_gia_tri_lon_nhat_va_ghi_ra_file\\number.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("E:\\CodeGym 02.2022\\C0222G2\\C0222G2_TranThiDiep\\module2\\src\\ss16_io_text_file\\thuc_hanh\\thuc_hanh_2_tim_gia_tri_lon_nhat_va_ghi_ra_file\\result.txt", maxValue);
    }
}
