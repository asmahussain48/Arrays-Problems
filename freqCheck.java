public class freqCheck {
    public static void main(String[] args) {
        int [] arr = {2,2,3,3,2,3,5,7,8,8,8,8,2,3,4,5,6,6,6,4,4,4,4,4};
        int [] freq = new int[arr.length];
        int size = arr.length;
        for(int i = 0; i<size; i++){
            int count = 0;
            for(int j = 0; j < size; j++) {
                if (i == arr[j]) {
                    count++;
                    freq[i]=count;
                }
            }
        }
        for(int i = 0; i<freq.length; i++){
            if(freq[i]!=0) {
                if(freq[i]>4) {
                    System.out.println(i + " , " + freq[i]);
                }
            }
        }
    }
}