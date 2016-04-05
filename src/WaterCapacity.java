/**
 * Created by DixonShen on 2016/4/1.
 */
public class WaterCapacity {

    public static void main(String[] args) {
        int[] wall = {2,5,1,3,1,2,1,7,7,6};
        calculate(wall);

    }

    public static void calculate(int[] a){
        int volume = 0;
        int lamx = 0;
        int rmax = 0;
        int i = 0,j = a.length-1;
        while(i!=j){
            if(a[i]>=lamx) lamx = a[i];
            else volume += lamx-a[i];
            i++;
            if(i==j) break;
            if(a[j]>=rmax) rmax = a[j];
            else volume += rmax-a[j];
            j--;
            if(i==j) break;
        }

        System.out.println(volume);
    }
}
