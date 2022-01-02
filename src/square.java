public class square {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i%2==0){
                System.out.print("========");
            }else{

                for(int j=1;j<=5;j++){
                    if(j%2==0){
                        System.out.print("|");
                    }else{
                        //decide what to put in the blank spaces
                        System.out.print("__");

                    }
                }

            }
            System.out.println();
        }
    }
}
