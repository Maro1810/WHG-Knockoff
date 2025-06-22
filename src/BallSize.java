public enum BallSize {
    SMALL(1, 7),
    MEDIUM(2, 5),
    LARGE(3, 3);
    
    public final int diameter;

    public final int speed;

    public final int PIXEL_SIZE = 15;
    
    BallSize(int d, int s) {
        this.diameter = d;
        this.speed = s;
    }
    
    public int getDiameter() {
        return diameter;
    }

    public int getActualDiameter() {
        return PIXEL_SIZE*diameter;
    }

    public int getSpeed() {
        return speed;
    }
}