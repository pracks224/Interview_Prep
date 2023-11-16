import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SearchTask extends RecursiveTask<Integer> {
    int[] arr;
    int start, end;
    int searchEle;

    public SearchTask(int[] arr, int start, int end, int searchEle) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.searchEle = searchEle;
    }

    @Override
    protected Integer compute() {
        return processSearch();
    }

    private Integer processSearch() {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (arr[i] == searchEle) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1,6,3,4,5,6,7,8,9,10,11,12};
        int searchEle = 6;
        int start = 0,end = arr.length-1;
        ForkJoinPool pool = ForkJoinPool.commonPool();
        SearchTask task = new SearchTask(arr,start,end,searchEle);
        int result = pool.invoke(task);
        System.out.printf("%d found %d times",searchEle,result);
    }
}