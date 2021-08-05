package sorting;


public class BubbleSort extends Sorting{
    public BubbleSort(int []data){
        super(data);
    }
    public BubbleSort(){}
    public void sort(boolean tooltip){    
        if(tooltip){
            long start = System.currentTimeMillis();
            int swaps = 0;

            for (int i = 0; i < this.data_array.length - 1; i++){
                for (int j = 0; j < this.data_array.length - i - 1; j++){
                    if (this.data_array[j] > this.data_array[j+1])
                    {
                        int temp = this.data_array[j];
                        this.data_array[j] = this.data_array[j+1];
                        this.data_array[j+1] = temp;
                        swaps++;
                    }
                }
            }
            long time = System.currentTimeMillis() - start;
            System.out.println("Finalizado");
            System.out.println("Tamaño de array: " + this.data_array.length);
            System.out.println("Swaps realizados: " + swaps);
            System.out.println("Tiempo transcurrido: " + time + "ms.");
        }
        
    }
    public void sort(){    
        for (int i = 0; i < this.data_array.length - 1; i++){
            for (int j = 0; j < this.data_array.length - i - 1; j++){
                if (this.data_array[j] > this.data_array[j+1])
                {
                    int temp = this.data_array[j];
                    this.data_array[j] = this.data_array[j+1];
                    this.data_array[j+1] = temp;
                }
            }
        }
    }

}
