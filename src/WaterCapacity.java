/**
 * Created by DixonShen on 2016/4/1.
 * Twitter面试题之装水问题
 */
public class WaterCapacity {

    public static void main(String[] args) {
        int[] wall = {6, 1, 4, 6, 7, 5, 1, 6, 4};
        calculate(wall);

    }

    public static void calculate(int[] a){
        int volume = 0;
        int lp = 0,rp = a.length-1;
        int lmax = a[lp];
        int rmax = a[rp];
        while(lp<rp){
            if (lmax<rmax){
                lp++;
                if (a[lp]>=lmax)
                    lmax = a[lp];
                else
                    volume += lmax-a[lp];
            }
            else {
                rp--;
                if (a[rp]>=rmax)
                    rmax = a[rp];
                else
                    volume += rmax-a[rp];
            }
        }

        System.out.println(volume);
    }
}
