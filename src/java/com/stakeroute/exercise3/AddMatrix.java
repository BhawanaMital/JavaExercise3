package com.stakeroute.exercise3;

public class AddMatrix {
    //Instance Variable

    private int[][] matrix1;
    private int[][] matrix2;

    //Intialising Matrix1
    public void setMatrix11(int[][] matrix1){
        this.matrix1=matrix1;

    }

    //Intialising Matrix2
    public void setMatrix2(int[][] matrix2){

        this.matrix2=matrix2;
    }
    //Addition Of Matrices
    public int[][] addOfMatrix(){
        if (matrix1==null || matrix2==null)
            return null;

        int row=matrix1.length;
        int column=matrix1[0].length;

        int[][] add=new int[row][column];
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                add[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        return add;
    }
}
