package sorting;
import java.util.Random;


public class Sorting {
    public int[] data_array;
    protected Sorting(int[] data){
        this.data_array = data;
    }
    protected Sorting(){}
    public void print(){
        for(int i = 0; i < this.data_array.length; i++){
            System.out.print("[" + this.data_array[i] + "]");
        }
        System.out.println("");
    } 
    public int []get_random_pack(int size){
        int []data = new int[size];
        Random r = new Random();
        int min = 10;
        int max = 100;

        for(int i = 0; i < data.length; i++){
            data[i]  = r.nextInt(max - min) + min;
        }
        return data;
    }
}
