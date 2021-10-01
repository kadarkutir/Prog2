public class ComplexExerciseMain{
    public static void main(String[] args) {

        int[] array = {23,123,12,654,23,13,675,234};

        ComplexExerciseClass complex = new ComplexExerciseClass();

        complex.PrintArray(array);
        complex.QuickSort(array,0,array.length-1);
        System.out.println();
        complex.PrintArray(array);
    }
}
