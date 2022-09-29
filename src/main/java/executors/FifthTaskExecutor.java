package executors;

import java.util.*;

import java.util.stream.Stream;

public class FifthTaskExecutor<T> {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        Iterator<T> firstIt = first.iterator();
        Iterator<T> secondIt = second.iterator();
        List<T> resultingList = new LinkedList<>();

        while(true){
            if(! firstIt.hasNext()){
                break;}
            resultingList.add(firstIt.next());

            if(! secondIt.hasNext()){
                break;}
            resultingList.add(secondIt.next());
        }
        return resultingList.stream();
    }

}
