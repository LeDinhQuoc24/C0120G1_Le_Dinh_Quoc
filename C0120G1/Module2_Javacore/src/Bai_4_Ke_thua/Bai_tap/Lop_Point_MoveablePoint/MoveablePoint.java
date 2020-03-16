package Bai_4_Ke_thua.Bai_tap.Lop_Point_MoveablePoint;

public class MoveablePoint extends Point{
    private float xSpeed=10.0f;
    private float ySpeed=10.0f;
    public MoveablePoint() {
    }
    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getxSpeed() {
        return xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed() {
        float[] array = new float[2];
        array[0]=xSpeed;
        array[1]=ySpeed;
        return array;
    }
    public String toString() {
        String result = "";
        for (float element : getSpeed()) {
            result += element + "\t";
        }
        return super.toString() + " Speed " + result;
    }
    public MoveablePoint move(MoveablePoint moveablePoint) {
        moveablePoint.setX(super.getX()+this.getxSpeed());
        moveablePoint.setY(super.getY() + this.getySpeed());
        return moveablePoint;
    }
}

