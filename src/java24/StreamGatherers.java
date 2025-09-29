package java24;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Gatherers;
import java.util.stream.IntStream;

public class StreamGatherers {

    public static void main(String[] args) {

        /*

        Gatherers.fold → collapse elements into a single result
        Gatherers.scan(se Extract Surrounding total/accumulation (like reduce, but you
        Gatherers.windowFixed(size) → split the stream into fixed-size batches.
        Gatherers.windowSliding (size) → create overlapping sliding windows.
        Gatherers.mapConcurrent(size) → run mapping functions concurrently (great for I/0 network tasks)

          */

        // using regular streams
        List<Integer> numbers = List. of (10, 25, 40, 15);
        Integer total = numbers.stream()
                .reduce( 0, Integer::sum);
        System.out.println(" sum using stream:" + total);

        // using stream gatherers

         Integer totalSum = numbers.stream()
                .gather(Gatherers. fold(() -> 0, Integer::sum))
                .findFirst().orElse(0);
        System.out.println(" sum using gatherers: " + totalSum);



        List<Integer> transactions = List. of (1000, -200, -500, 200, -300);
        //800, 300, 500....
        // using regular streams
        AtomicInteger runningTotal = new AtomicInteger (0);
        // In stream intermediate ops are stateless they wont store the previous state
        // so we use AtomicInteger to maintain the state
        List<Integer> balanceHist = transactions.stream()
                .map(runningTotal::addAndGet)
                .toList();
        System.out.println("using stream :" + balanceHist);

        // using stream gatherers

        List<Integer> balanceHistory = transactions.stream()
                        .gather(Gatherers.scan(() -> 0, Integer::sum))
                        .toList();

        System.out.println("using gatherers "+ balanceHistory);



        List<Integer> orders = List.of(101, 102, 103, 104, 105, 106, 107);
        // [101, 102, 103], [104, 105, 106], [107]
        int batchSize = 3;
        // using regular streams
        List<List<Integer>> batches = IntStream.range(0, batchSize)
                .mapToObj(i -> orders.subList(i* batchSize, Math.min((i + 1) * batchSize, orders.size())))
                        .toList();

        System.out.println("orderIds in batch using stream: " + batches);

        // using stream gatherers
        List<List<Integer>> orderIdsInBatch = orders.stream()
                .gather (Gatherers. windowFixed( 3)).toList();
        System.out.println("orderIds in batch using gatherers : " + orderIdsInBatch);

        //numbers : [1, 2, 3, 4, 5]
        //windowFixed : [[1,2,3],[4,5]]
        //Sliding windows [ [1,2,3], [2,3,4], [3,4,5]]

        List<Integer> orderIds = List.of(101, 102, 103, 104, 105);
        int windowSize = 3;
        // using regular streams
        List<List<Integer>> orderList = IntStream.range(0, 3)
                .mapToObj(i -> orderIds.subList(i, i + windowSize)).toList();
        System.out.println("Processing with stream:" + orderList);

        // using stream gatherers
        List<List<Integer>> orderIdListGatherers = orderIds.stream()
                .gather(Gatherers.windowSliding ( 3)).toList();
        System.out.println("Processing with gatherers: " + orderIdListGatherers);


    }
}
