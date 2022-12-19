Пусть дан произвольный список целых чисел
    public static void main(String[] args) {

    }

    // Нужно удалить из него четные числа
    public List<Integer> removeNegativeValue(List<Integer> list){
        List<Integer> list2 = new ArrayList<>();

        for(int i = 0; i <= list.size(); i++) 
            if(list.get(i) > 0)
                list2.add(list.get(i));
        return new ArrayList<>();
    }
    
    // Найти максимальное значение
    public Integer getMax(List<Integer> list){
 
        // если пусто
        if (list == null || list.size() == 0) {
            return Integer.MIN_VALUE;
        }
 
        // создаем новый List для модификации
        List<Integer> sortedlist = new ArrayList<>(list);
 
        Collections.sort(sortedlist);
        System.out.println(sortedlist.get(sortedlist.size() - 1));
        return 0;
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
        System.out.println(sumElements / count);
    }
