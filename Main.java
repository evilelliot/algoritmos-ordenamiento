import sorting.BubbleSort;

public class Main{
    public static void main(String[] args){
        //int []data = {1,4,72,3,4,5};

        // Generando datos
        BubbleSort bs = new BubbleSort();
        int []random = bs.get_random_pack(50);
        
        bs = new BubbleSort(random);
        // Organizando con tooltips activadas
        bs.sort(true);
        

        
    }
}