package ru.mono;

public class Table {
    private int[][] numbers;
    Table(int r, int c){
        numbers = new int[r][c];
    }

    public int getValue(int r, int c){
        return numbers[r][c];
    }
    public void setValue(int r, int c, int val){
        numbers[r][c] = val;
    }
    public int rows(){
        return numbers.length;
    }
    public int cols(){
        return numbers[1].length;
    }
    public double average(){
        int sum = 0;
        for(int[] r : numbers){
            for(int c : r) sum += c;
        }
        return ((double)sum/(this.rows()*this.cols()));
    }
    public String toString(){
        StringBuilder s = new StringBuilder();
        for(int[] r : numbers){
            s.append("[");
            for(int c=0; c<r.length; c++){
                s.append(r[c]);
                if(c != (r.length-1)) s.append(", ");
            }
            s.append("]\n");
        }
        return s.toString();
    }

}
