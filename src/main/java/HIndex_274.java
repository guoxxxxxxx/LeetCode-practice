public class HIndex_274 {

    public int hIndex(int[] citations) {
        int[] array = new int [citations.length + 1];

        for(int e : citations){
            if (e >= citations.length){
                array[citations.length] += 1;
            }
            else{
                array[e] += 1;
            }
        }

        int h = 0;
        for(int i = citations.length; i >= 0; i--){
            if(array[i] + h <= i || h < i){
                h = Math.min(array[i] + h, i);
            }
        }
        return h;
    }
}
