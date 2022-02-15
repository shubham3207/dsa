package WEEK1;

import java.util.*;

public class firstweek {
    static void getExprUtil(List<String> res, String curExp, String input, int target, int pos, int curVal,int last)
    {
        if (pos==input.length())
        {
            if(curVal==target)
                res.add(curExp);
            return;
        }

        String part = input.substring(pos,pos+1);
        int cur = Integer.parseInt(part);
        if(pos==0){
            getExprUtil(res, curExp +part,input,target,pos+1,cur,cur);
        }
        else
        {
            getExprUtil(res, curExp+ "+" + part,input,target,pos+1,curVal+ cur,cur);
            getExprUtil(res,curExp + "-" + part, input,target,pos+1,curVal-cur, -cur);
            getExprUtil(res, curExp + "*" +part, input, target, pos+1, curVal-last+last*cur, last*cur);
        }
    }
    static List<String> getExprs(String input, int target)
    {
        List<String> res= new ArrayList<String>();
        getExprUtil(res, "",input,target,0,0,0);
        return res;
    }
    static void printResult(List<String> res)
    {
        for (int i=0; i< res.size();i++)
            System.out.println(res.get(i)+ " ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        String input ="123";
        int target =6;
        List<String> res = getExprs(input, target);
        printResult(res);
        input="343";
        target=15;
        res=getExprs(input,target);
        printResult(res);
    }
}
