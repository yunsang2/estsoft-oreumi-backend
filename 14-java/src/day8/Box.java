package day8;

public class Box<T> {

    private  T data;

    public Box(T data) {this.data = data;}
    public Box () {this(null);}

    public T getData() {return data;}
    public void setData(T data) {this.data = data;}

    //메서드 재정의
    @Override
    public String toString() {return data.toString();}
}
