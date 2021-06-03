

public class ArrayTools {
    char[] encrypt(int shiftVal, String inputVal)
        {
            inputVal = inputVal.toLowerCase();
            char[] input = new char[inputVal.length()];

            
            for (int i=0; i<inputVal.length(); i++) {
                input[i] =  (char)(inputVal.charAt(i) + shiftVal);

                //TO ONLY ENCRYPT AS ALPHABETS BUT NOT NEEDED
                // if((int)(input[i]) > 122 )
                // {
                //    input[i] = (char)(input[i] - 26);
                // }
            }
           
           return input;
        }

        char[] decrypt(int shiftVal, String inputVal)
        {
            inputVal = inputVal.toLowerCase();
            char[] input = new char[inputVal.length()];

            
            for (int i=0; i<inputVal.length(); i++) {
                input[i] =  (char)(inputVal.charAt(i) - shiftVal);

                //TO ONLY ENCRYPT AS ALPHABETS BUT NOT NEEDED
                // if((int)(input[i]) > 122 )
                // {
                //    input[i] = (char)(input[i] - 26);
                // }
            }
           
           return input;
        }

        Double sum=0.0;
        Double arrayAvg(double[] arrVals)
        {
           for(int i=0;i< arrVals.length;i++){
            
             sum = sum + arrVals[i];

           }

           double avg = sum / arrVals.length;
           return avg;
        }
        static int count =0;
        boolean arrayContains(char[] arr, char j)
        {
            
            for(int i=0;i<arr.length;i++)
            {
               if(arr[i] == j)
               {
                   return true;
                   
               }
               

            }

        return false;
            
        }

        char[] reverse(char[] arr)
        {
            int len = arr.length;
            char[] placeHolder = new char[len];
            if(len%2==0)
            {
               for(int i=0;i<len/2;i++)
                {
                    placeHolder[i] = arr[i];
                    arr[i] = arr[len-(i+1)];
                    arr[len-(i+1)] = placeHolder[i];
                
                }
            }
            else{
                for(int i=0;i<(len/2) + 1;i++)
                {
                  
                    placeHolder[i] = arr[i];
                    arr[i] = arr[len-(i+1)];
                    arr[len-(i+1)] = placeHolder[i];
                
                }
            }

            return arr;
        }
}
