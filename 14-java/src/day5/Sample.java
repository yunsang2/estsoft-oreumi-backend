package day5;

class Sample {

    private int data;


    public Sample(int data) {
        this.data = data;
    }

    public Sample(){
//        data = 0;
        this.data = 0;
    }

    public void setData(int n) {
        if (n >= 0)
            this.data = n;
    }

    public int getData() {return data;}

    private void print() {
        System.out.println("data: " + data);
    }
}
