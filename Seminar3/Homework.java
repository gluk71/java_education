Пусть дан произвольный список целых чисел
    public static void main(String[] args) {

    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){

        return new ArrayList<>();
    }
    

    public Integer getAverage(List<Integer> list){
    int sumElements = 0;
        int count = 0;
        for (int item : list){
            sumElements += item;
            count++;
        }
        if (count == 0)
            return 0;    
        return sumElements / count;
    }
