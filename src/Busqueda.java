public class Busqueda {
    public String Tiempo(){
        String Time=" ";
        int size=100;
        int initialValue=10;

        for (int i =0; i < 4; i++) {

            int[]arreglo= generateRandomArray(size,initialValue);

            long Inictialtime1=System.nanoTime();
            LinealSearch(arreglo,-1);
            long Finaltime1=System.nanoTime();
            long Totaltime1=Finaltime1-Inictialtime1;

            long tiempoinicio2=System.nanoTime();
            BinarySearch(arreglo,-1);
            long tiempofinal2=System.nanoTime();
            long tiempoTotal2=tiempofinal2-tiempoinicio2;
            Time +="\nArreglo: "+i+": "+"Tamaño: "+arreglo.length+" Valor inicial: "+initialValue+
                    "\nBusqueda Lineal: "+Totaltime1+"\nBusqueda Binaria: "+tiempoTotal2;

            size=size*10;

        }
        return Time;
    }
    public int LinealSearch(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            if (target == nums[i]) {
                return i;
            }
        }
        return -1;
    }
    public int BinarySearch(int[] nums, int target) {
        int der= nums[nums.length - 1];
        int izq = nums[0];

        while (izq<= der) {
            int med = (izq + der) / 2;
            if (nums[med] == target) {
                return med;
            } else if (nums[med] < target) {
                izq = med + 1;
            } else {
                der= med - 1;
            }
        }
        return -1;
    }
    public int[] generateRandomArray(int size, int minValue) {
        int[] arr = new int[size];
        for (int i =0; i < size; i++) {
            arr[i] = minValue+i;
        }
        return arr;
    }
}
