package lv.junit.enhancements.pvn;


public class PVNCalculator {


    public double calculate(int year, double income) {
        if(2010 > year) {
            return income * 0.18;
        }
        else return income * 0.21;
    }

}
