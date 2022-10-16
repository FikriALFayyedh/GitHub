public class latihan2 {
    public static void main(String[] args){
        int[]nilai ={15,5,20,1,7,3,8,6,9};
    
        int minimum ,j;
        minimum = nilai[0];
    
            for(j = 0; j < 9; j++) {
                if (nilai[j] < minimum){
                  minimum = nilai[j];}}
            System.out.println("");
            System.out.println("Nilai minimum adalah "+minimum);
    
        }
    }
