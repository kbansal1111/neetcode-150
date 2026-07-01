class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen=new HashSet<>();

        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){

                char num=board[row][col];
                if(num=='.'){
                    continue;
                }
                int box = (row / 3) * 3 + (col / 3);
                // create unique keys
                String rowkey="r"+row+"-"+num;
                String colkey="c"+col+"-"+num;
                String boxkey="b"+box+"-"+num;
                
                if(seen.contains(rowkey)||seen.contains(colkey)||seen.contains(boxkey)){
                    return false;
                }
                seen.add(rowkey);
                seen.add(colkey);
                seen.add(boxkey);
            }
        }
        return true;
    }
}
