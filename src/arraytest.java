public class arraytest{
    public static int [] sort(int[]array){
        for(int i=1;i<array.length;i++) {
            boolean flag = true;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
            System.out.print("第"+i+"轮的排序结果为");
            display(array);
        }
        return array;

    }

    public static void display(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"");
        }
        System.out.println( );
    }
    public static void main(String[] args){
        int[]array={4,2,8,9,5,7,6,1,3};
        System.out.print("未排序的数组为:");
        display(array);
        System.out.print("排序后的数组为:");
        sort(array);
        display(array);
    }
}
