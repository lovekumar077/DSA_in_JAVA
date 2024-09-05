public class secondLargest{
    public static int secondlarge(int nums[]){
        int maxOne = 0;
int maxTwo = 0;
for (int i=0;i<nums.length; i++)
{
if (maxOne < nums[i])
{
maxTwo = maxOne;
maxOne = nums[i];
}
else if (maxTwo < nums[i])
{
maxTwo = nums[i];
}
}
System.out.println("Largest Number: " + maxOne);
System.out.println("Second Largest Number: " + maxTwo);
return maxTwo;
    }
    public static void main(String[] args) {
        int num[]={ 5, 34, 78, 2, 45, 1, 99, 23 };
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
      int result=secondlarge(num);
      System.out.println(" ");
      System.out.println(result);
    }
}


