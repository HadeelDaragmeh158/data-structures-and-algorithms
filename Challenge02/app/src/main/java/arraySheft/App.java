/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package arraySheft;

public class App {


    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6};

        System.out.println(insertArraySheft(arr,6));
    }

    public static int[] insertArraySheft(int[] array , int num ){
        int count =0;
        int length = array.length+1;
        int[] sheftedArr = new int[length];

        for (int i =0; i < length-1 ; i++){
            if (count == length/2){
                sheftedArr[count]=num;
                i--;
                count++;
                continue;
            }
            sheftedArr[count]= array[i];
            count++;
        }
        for (int i = 0; i < sheftedArr.length-1; i++)
        {
            System.out.println(sheftedArr[i]);

        }
        return sheftedArr;

    }
}
