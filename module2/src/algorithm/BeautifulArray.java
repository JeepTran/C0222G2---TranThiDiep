package algorithm;

public class BeautifulArray {
    boolean solution(int[] arr) {
        int sumBeforeIndex = 0;
        boolean flag = false;
        for (int i = 1; i<arr.length ;i++){
            sumBeforeIndex+=arr[i-1];
            int sumAfterIndex = 0;
            for(int j = i + 1; j<arr.length ;j++){
                sumAfterIndex += arr[j];
            }
            if(sumBeforeIndex==sumAfterIndex){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
