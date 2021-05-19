package telran;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;

public class NumberService {
    public int getMaxCoveredNumbers(List<Integer> numbers, int l){
        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        int max = 0;

        Deque<Integer> numbersCoveredByL = new ArrayDeque<>();
        for(int i = 0; i< numbers.size();i++){
            int currentNumber = numbers.get(i);
            numbersCoveredByL.addLast(currentNumber);

            while (numbersCoveredByL.getFirst() < currentNumber-l){
                numbersCoveredByL.removeFirst();
            }

            if(max < numbersCoveredByL.size())
            max = numbersCoveredByL.size();
        }
        return max;
    }
}
