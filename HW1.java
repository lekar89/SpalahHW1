/**
 * Created by Влад on 15.12.2016.
 */
public class HW1 {
    public int min(int[] pp){
        int res=pp[0];
            for (int i=1;i<pp.length-1;i++){
                if (pp[i]<res)
                    res=pp[i];
            }
        return res;
    }

    public int max(int[] pp){
        int res=pp[0];
        for (int i=1;i<pp.length-1;i++){
            if (pp[i]>res)
                res=pp[i];
        }
        return res;
    }

    public int average(int[] pp){
        int tmp=pp[0];
        for (int i=1;i<pp.length-1;i++){
            if (pp[i]<tmp)
                tmp+=pp[i];
        }
        return tmp/pp.length;
    }
    private int[] revers(int[] pp){

        for (int i = 0; i < pp.length/2; i++)
        {
            int tmp = pp[pp.length - 1 - i];
            pp[pp.length - 1 - i] = pp[i];
            pp[i] = tmp;
        }


        return pp;
    }

}
