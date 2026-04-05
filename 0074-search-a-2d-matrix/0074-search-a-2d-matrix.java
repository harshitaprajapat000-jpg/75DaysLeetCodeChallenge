class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s=0;
        int e=matrix[0].length-1;
        for(int start=0;start<matrix.length;start++){
            if(matrix[start][s]<=target && matrix[start][e]>=target){
                while(s<=e){
                int mid=s+(e-s)/2;
                if(matrix[start][mid]==target)
                return true;
                if(matrix[start][mid]>target)
                e=mid-1;
                else if(matrix[start][mid]<target)
                s=mid+1;
                else
                return true;
            }
            }
            s=0;
            e=matrix[0].length-1;
        }
        return false;
    }
}