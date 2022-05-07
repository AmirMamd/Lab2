public class MinMax {
    public double maximumDetection(double [] arr){
        double max= -999999;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public double minimumDetection(double [] arr){
        double min= 9999999;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
