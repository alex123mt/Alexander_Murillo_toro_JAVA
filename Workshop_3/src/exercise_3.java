// fibonacci
public class exercise_3 {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;

        for (int i = 0; i < 20; ++i) {
            System.out.println(n1);
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        
    }
}
