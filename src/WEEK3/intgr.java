package WEEK3;

public class intgr {
    public int small(String num){
        int n;
        int detected[];
        detected = new int [10];
        for(int i=0; i<10;i++){
            detected[i]=0;
        }
        for (int i= 0;i<num.length();i++){
            n= Integer.parseInt(num.charAt(i)+"");
            detected[n-1]=1;
        }
        for(int i=0;i<10;i++){
            if (detected[i]==0){
                return i+1;
            }
        }
        return -1;

    }
    public static void main(String[] args){
        String n="1689";
        intgr h=new intgr();
        int s= h.small(n);
        System.out.println(s);
    }
}
