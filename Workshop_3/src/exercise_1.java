public class exercise_1 {
        public static void main(String[] args) {
            for (int i=2; i<100;i++ ) {
                if(i%2==0){
                    if(i==2){
                        System.out.println(i);
                        continue;
                    }else{
                        continue;
                    }
                }
                if (i%3==0) {
                    if (i==3) {
                        System.out.println(i);
                        continue;
                    }else{
                        continue;
                    }
                }
                if(i%5==0){
                    if(i==5){
                        System.out.println(i);
                        continue;
                    }else{
                        continue;
                    }
                }
                if(i%7==0){
                    if(i==7){
                        System.out.println(i);
                        continue;
                    }else{
                        continue;
                    }
                }
                System.out.println(i);
            }
        }
    
}
