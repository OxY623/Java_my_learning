import  java.util.Arrays;
/**
 *
 * @author 37533
 */
public class StrArrayTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] aryString=  new String[3];
        aryString[0]="I";
        aryString[1]="am";
        aryString[2]="OxY";
        Arrays.sort(aryString);
        int i=0;
        for(;i<aryString.length;i++){
         
         System.out.println(aryString[i]);
      }
        
    }
    
}
