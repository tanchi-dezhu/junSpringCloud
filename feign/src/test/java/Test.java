import com.feign.enumeration.StudentEnum;

public class Test {
    public static void main(String[] args) {
        int[][] t = {{1,2,3},{4,5,6}};
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
            for (int i1 = 0; i1 < t[i].length; i1++) {
                System.out.println(t[i][i1]);
            }
        }
        System.out.println(StudentEnum.STATUS_USE.getKey());
    }
}
