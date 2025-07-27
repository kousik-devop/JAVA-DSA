package Array.d_arr;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class RatInAHole {

    public static void helper(int[][] arr,int row,int col,List<String> ans , String path){
        int n = arr.length;

        if(row < 0 || row >= n || col < 0 || col >= n || arr[row][col] == 0 ){
            return;
        }

        if(row == n-1 && col == n-1){
            ans.add(path);
            return;
        }

        arr[row][col] = 0;

        helper(arr, row-1, col, ans, path+"U");
        helper(arr, row+1, col, ans, path+"D");
        helper(arr, row, col-1, ans, path+"L");
        helper(arr, row, col+1, ans, path+"R");

        arr[row][col] = 1;
    }

    public static List<String> getPath(int[][] arr,int row,int col){
        List<String> ans = new ArrayList<>();
        String path = "";

        helper(arr,row,col,ans,path);

        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};

        List<String> ans = getPath(arr,0,0);

        for(String list : ans){
            System.out.println(list);
        }
    }
}
