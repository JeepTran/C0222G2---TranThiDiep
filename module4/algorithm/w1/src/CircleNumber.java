import java.util.ArrayList;
import java.util.List;

public class CircleNumber {
    public static void main(String[] args) {
        int result = new CircleNumber().solution(9,200);
        System.out.println(result);
    }
    private int solution(Integer arg1, Integer arg2) {
        List<Integer> list = new ArrayList<>();
        for(int i = arg1; i<=arg2; i++){
            if(i<10){
                list.add(i);
                System.out.println(i);
            } else {
                if(String.valueOf(i).charAt(0) == String.valueOf(i).charAt(String.valueOf(i).length()-1)){
                    list.add(i);
                    System.out.println(i);
                }
            }

        }
        return list.size();

//        List<Integer> list = new ArrayList<>();
//        for(int i = arg1; i<=arg2; i++){
//            if(i<10){
//                list.add(i);
//            } else {
//                String str = i+"";
//                if(str.charAt(0)==str.charAt(str.length()-1)){
//                    list.add(i);
//                }
//            }
//
//        }
//        return list.size();
    }
}
