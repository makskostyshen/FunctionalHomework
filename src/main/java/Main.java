import executors.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ResultsPrinter printer = new ResultsPrinter();
        //Task 1
        List<String> names = new ArrayList<>(Arrays.asList("Mark", "Anthony", "Beyonce", "Poroshenko", "Pitbull", "Terrier"));

        FirstTaskExecutor firstTaskExecutor = new FirstTaskExecutor();
        printer.print(firstTaskExecutor.execute(names), 1);


        //Task 2
        SecondTaskExecutor secondTaskExecutor = new SecondTaskExecutor();
        printer.print(secondTaskExecutor.execute(names), 2);


        //Task 3
        String[] numbers = new String[]{"1, 2, 0", "4, 5"};

        ThirdTaskExecutor thirdTaskExecutor = new ThirdTaskExecutor();
        printer.print(thirdTaskExecutor.execute(numbers), 3);


        //Task 4
        FourthTaskExecutor fourthTaskExecutor = new FourthTaskExecutor();
        Stream<Long> fourthStream = fourthTaskExecutor.execute(25214903917L, 11, new Random().nextLong());

        printer.print(
                fourthStream.limit(10).collect(Collectors.toList()),
                4);


        //Task 5
        List<String> l1 = new ArrayList<>(Arrays.asList("1", "3", "5", "7", "9", "11"));
        List<String> l2 = new ArrayList<>(Arrays.asList("0", "2", "4", "6", "8", "10", "12", "14"));

        Stream<String> fifthStream = FifthTaskExecutor.zip(l2.stream(), l1.stream());
        printer.print(fifthStream.collect(Collectors.toList()), 5);
    }
}

