public class ComplexExerciseClass implements ComplexExerciseInterface{

    @Override
    public void SelectionSort(int[] array) {

        int n = array.length;

        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;

            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }

    }

    @Override
    public void BubbleSort(int[] array) {

        int n = array.length;

        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }

    @Override
    public void InsertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    @Override
    public void QuickSort(int[] array,int left,int right) {
        int i = left, j = right;
        int tmp;
        int pivot = array[(left + right) / 2];

        while (i <= j)
        {
            while (array[i] < pivot)
                i++;
            while (array[j] > pivot)
                j--;
            if (i <= j)
            {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        };

        if (left < j)
            QuickSort(array, left, j);

        if (i < right)
            QuickSort(array, i, right);
    }


    @Override
    public void PrintArray(int[] array) {
        for(int i = 0; i < array.length;i++)
            System.out.print(array[i] + " ");

    }
}
