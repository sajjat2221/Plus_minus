
package hackrrank.com;




public class HackrrankCom {

   
    public static void main(String[] args) {
       
      int[] array={1,1,0,-1,-1};
      
      double positive=0;
      double  negative=0;
      double zero=0;
      
      
        for (int i : array) {
            if (i>0) {
                positive++;
                
            }
            if (i<0) {
                negative++;
                
            }
            if (zero==0) {
                zero++;
                
            }
            
        }
      
        System.out.printf("Positive %f\n",positive/array.length);
        System.out.printf("NEgative %f\n",negative/array.length);
        System.out.printf("Zero %f\n",zero/array.length);
      
       
        
    }
    
}
