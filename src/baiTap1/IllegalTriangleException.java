package baiTap1;

public class IllegalTriangleException extends Exception {
    @Override
    public String getMessage() {
        return "không phải là tam giác";
    }
}
