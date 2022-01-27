class reverse
{
    public static void rev(int[] numbers, int start, int end)
    {
        while(start<end)
        {
            int temp = numbers[start];
            numbers[start]=numbers[end];
            numbers[end]=temp;
            start ++;
            end--;
        }
    }
    public static void printarray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+  " ");
        }
        System.out.println();
    }
    public static void main(String[] arg)
    {
        int[] numbers = {2,3,5,2,45,7};
        printarray(numbers);
        rev(numbers,0,numbers.length-1);
        printarray(numbers);
    }
}