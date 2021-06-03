import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
          // Take User input
        Scanner sc = new Scanner(System.in);    

         ArrayTools obj = new ArrayTools();

        //CALCULATE AVERAGE
        // System.out.println("Enter array size for AVERAGE operation: ");
        // int arraySize = sc.nextInt();
        // double arrAvg[] = new double[arraySize];

        // System.out.println("Enter values to calculate their average: ");

        // for(int i=0;i<arraySize;i++)
        // {
        //     arrAvg[i] = (double)sc.nextDouble();
        // }
        // Double averageVal = obj.arrayAvg(arrAvg);
        // System.out.println("Average of the input numbers is: " +averageVal);

       
        //****AVERAGE LOGIC ENDS*******/

        //   //****ENCRYPTION STARTS********/
            System.out.println("Enter a shift value to encrypt: ");
        
            int shiftVal = sc.nextInt();      
            
            //int shiftVal = Integer.parseInt(shiftValString);  
  
            System.out.println("Enter message to encrypt: ");
            String inputVal = sc.nextLine();
            char[] encryptedVal =  obj.encrypt(shiftVal, inputVal);
            System.out.println(encryptedVal);
            String encString = String.valueOf(encryptedVal);
            char[] decryptedVal =  obj.decrypt(shiftVal, encString);
            System.out.println("Decrypting your secret message: ");
            System.out.println(decryptedVal);
            

        //   //*****ENDS**********/


        //   //*****REVERSE AN ARRAY */
        System.out.println("Enter size of an Array: ");

        int arrSize = sc.nextInt();

          System.out.println("Enter values to reverse an Array: ");

          char[] revArr = new char[arrSize];

          for(int i=0;i<arrSize;i++)
          {
            revArr[i] = sc.next().charAt(0);  
          }

         
          char[] reverseOrder =  obj.reverse(revArr);
        
        
          System.out.println("Reverse of the input array: "+"\n"+String.valueOf(reverseOrder));       
          
          


        //   //******REVERSE AN ARRAY-ENDS */

        //   //*************CHECK IF ARRAY CONTAINS THE INPUT******** */
        System.out.println("Enter size of an Array: ");

         int contArrSize = sc.nextInt();

         System.out.println("Enter characters or integers to test CONTAINS operation on an Array: ");

         char[] inpArray = new char[contArrSize];

         for(int i=0;i<contArrSize;i++)
         {
            inpArray[i] = sc.next().charAt(0);  
         }       

          System.out.println("Enter a value to find if it exists in the array you entered above: "); 
        
          char findChar = sc.next().charAt(0); 
          
          boolean exists = obj.arrayContains(inpArray, findChar);
          if(exists){
          System.out.println("Kudos! it exists!"); } 
          else{
            System.out.println("No, value you entered does not exists :(");  
          }
   
    }

    
}
