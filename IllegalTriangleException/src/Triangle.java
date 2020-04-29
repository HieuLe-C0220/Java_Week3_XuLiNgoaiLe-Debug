public class Triangle {
    private int side1;
    private int side2;
    private int side3;
    public Triangle(int canh1,int canh2,int canh3) {
        this.side1 = canh1;
        this.side2 = canh2;
        this.side3 = canh3;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }
    public boolean checkTriangle() {
        if (side1+side2>side3 && side1+side3>side2 && side2+side3>side1) {
            return true;
        }
        return false;
    }
    public int getParameter() throws IllegalTriangleException {
        if (checkTriangle()) {
            return side1+side2+side3;
        } else {
            throw new IllegalTriangleException("Không phải tam giác");
        }
    }

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(6,8,10);
        Triangle triangle2 = new Triangle(0,2,5);
        try {
            System.out.println(triangle1.getParameter());
            System.out.println(triangle2.getParameter());
        } catch (IllegalTriangleException e) {
            System.out.println(e.getErrorMessage());
        }
    }
}
