package Bai_4_Ke_thua.Bai_tap.Lop_Point_MoveablePoint;

public class Point {
    private float x=1.0f;
    private float y=2.0f;
    public Point() {
    }
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x=x;
        this.y=y;
    }
    public float[] getXY() {
        float[] array=new float[2];
        array[0]=x;
        array[1]=y;
        return array;
    }
    public String toString() {
        String resuft="";
        for (float element : getXY()) {
            resuft += element + "\t";
        }
        return "Array: "+resuft;
    }
}
