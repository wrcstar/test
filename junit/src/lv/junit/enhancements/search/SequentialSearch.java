package lv.junit.enhancements.search;


public class SequentialSearch {

    public int search(int[] numbers, int key) {
        for(int index = 0; index < numbers.length; index++) {
            if(numbers[index] == key) return index;
        }
        return -1;
    }

}
