package day02_array;

public class _05_Rect {
	private int width;
    private int high;
    private int area;
    
    void setWidthAndHigh(int w, int h) {
        width = w;
        high = h;
        area = w * h;
    }
    
    int getArea() {
        return area;
    }
}
