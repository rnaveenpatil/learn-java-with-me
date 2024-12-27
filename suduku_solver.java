class Solution {
    public boolean isSafe(char[][] board, int row, int col,int num){
        for(int i=0; i<board.length; i++){
            if(board[i][col]==(char)(num+'0')){
                return false;
            }
        }
        for(int j=0; j<board.length; j++){
            if(board[row][j]==(char)(num+'0')){
                return false;
            }
        }
        int start_row=(row/3)*3;
        int start_col=(col/3)*3;
        for(int i=start_row; i<start_row+3; i++){
            for(int j=start_col; j<start_col+3; j++){
                if(board[i][j]==(char)(num+'0')){
                    return false;
                }
            }
        }
        return true;

    }
public boolean help(char[][] board, int row,int col){
    if(row==board.length){
        return true; 
    }
int nrow,ncol;
nrow=ncol=0;
if(col==board.length-1){
    nrow=row+1;
    ncol=0;
}
else{
    nrow=row;
    ncol=col+1;
}
if(board[row][col]!='.'){
    if(help(board,nrow,ncol)){
return true;
    }
}
    else{
        for(int i=1; i<=9;i++){
           if(isSafe(board,row,col,i)){
            board[row][col]=(char)(i+'0');
            if(help(board,nrow,ncol))
                return true;
             else
                board[row][col]='.';
            
           
        }
    }
}

return false;
}


    public void solveSudoku(char[][] board) {
        help(board,0,0);
    }
}
