
package min;
public class Min {

    public static void main(String[] args) {
       int[] num={8,9,6};
       int min =num[0];
       for(int i=1; i<num.length; i++){
           if(min>num[i]){
              min=num[i];
           }
       }
        System.out.println("Min = "+min);
    }
    
}
