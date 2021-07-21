package ua.hillel;

public class PointList {
    private Point[] list = new Point[0];

    public Point get(int i){
        return list [i];
    }

    public void add(Point p){
        Point[] oldList = new Point[list.length];
        System.arraycopy(list,0,oldList,0,list.length);
        list = new Point[list.length+1];
        System.arraycopy(oldList,0,list,0,oldList.length);
        list[list.length-1] = p;

    }
    public int returnSize(){
        return list.length;
    }

    public void delete(int i){
        Point[] oldList = new Point[list.length];
        System.arraycopy(list,0,oldList,0,list.length);
        list = new Point[list.length-1];
        System.arraycopy(oldList,0,list,0,i);
        System.arraycopy(oldList,i+1,list,1,list.length-i);
    }

}
