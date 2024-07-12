// rombo
public class exercise_4 {
    public static void main(String[] args) {

        for(int a = 1; a<=8; a++){
            for(int e = 1; e<=8-a; e++){
                System.out.print(" ");
            }
            for(int f=1; f<=(a*2)-1; f++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int a = 7; a>=1; a--){
            for(int e = 1; e<=8-a; e++){
                System.out.print(" ");
            }
            for(int f=1; f<=(a*2)-1; f++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
