package kr.hs.study.beans;

public class TestBean2 {
    private DataBean2 data1;
    private DataBean2 data2;

    public DataBean2 getData1() {
        return data1;
    }

    // data1 => DataBean2의 객체의 주소값이 들어가야 한다
    public void setData1(DataBean2 data1) {
        this.data1 = data1;
    }

    public DataBean2 getData2() {
        return data2;
    }

    public void setData2(DataBean2 data2) {
        this.data2 = data2;
    }
}
