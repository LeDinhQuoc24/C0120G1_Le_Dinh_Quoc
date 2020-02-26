package Bai_4_Ke_thua.Bai_tap.Lop_Point2D_Lop_Point3D;

public class Point2D {
    float[] array=new float[2];
    private float x=1.0f;
    private float y=2.0f;
    public Point2D() {
    }
    public Point2D(float x, float y) {
        this.x=x;
        this.y=y;
    }
    public void setX(float x) {
        this.x=x;
    }
    public float getX() {
        return this.x;
    }
    public void setY(float y) {
        this.y=y;
    }
    public float getY() {
        return this.y;
    }
    public void setXY(float x, float y) {
        array[0]=x;
        array[1]=y;
    }
    public float[]  getXY() {
        return array;
    }
    @Override
    public String toString() {
        return "Point2D with x: "+getX()+",y: "+getY()+" and Array: "+getXY();
    }
}
