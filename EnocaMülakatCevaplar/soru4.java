public class soru4{
    public static void main(String[] args) {
        int sembol = 1;
        for(int i = 1; i <= 6; i++){
            for(int j = 0; j < sembol ; j++){
                System.out.print("*");
            }
            System.out.println("");
            sembol = (i*2);     
        }
    }
}

/*
*                        1
**                       2  
****                     4
******                   6 
********                 8
**********               10
*/