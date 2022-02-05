package safron;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;

import java.util.*;
import java.util.stream.Collectors;

public class ArraysExample {

    int[] intArray = new int[]{1, 2, 3 , 4 , 5};
    String[] stringArray  = new String[]{"foo", "bar"};

    public static void main(String... args) {
        int[] intArray = new int[5];
        String[] stringArray;
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;

       ElementsCollection selenideElements = Selenide.$$("");
       List<String> stringList = new ArrayList<>();

       stringList.add("foo");
       stringList.remove(0);
       stringList.remove("foo");

       List<Integer> intList = new ArrayList<>();
       intList.add(0);
       intList.add(1);
       intList.add(10);
        ((ArrayList<Integer>) intList).trimToSize();

       // Object[] objects = intList.toArray();
        Integer[] integers = intList.toArray(new Integer[3]);

        Collections.emptyList();

        //Arrays.asList возвращает что-то среднее между мод-м и немод-м листом. Не можешь добавить элементы, так как это наследние из массива.менить состояние элементом можно.
        List<String> strings = Arrays.asList("id");

        // реалзиация листа с одним элементом
        List<String> strings1 = Collections.singletonList("id");

        //если 1 элемент, то создаст singletonList, если более, то обычный немодифицируемый лист (создался в состоянии и никто его не может изменить).менить состояние элементом нельзя.
        List<String> strings2 = List.of("id", "id2");

        //ArrayList лист самого максимального общего назначения.
        List<String> strings3 = new ArrayList<>(List.of("id", "id2"));

        //Множесто. Можно хранить только уникальные значения. HashSet неупорядоченное, не отсортированное хранение данных
        Set<String> stringSet= new HashSet<>();

        //Сохраняет последовательность добавления. Связанный список
        Set<String> linkedStringSet= new LinkedHashSet<>();

        //Отсортированный натуральным образом. По алфавиту; По возрастанию.
        Set<String> treeStringSet= new TreeSet<>();

        //Map. Социативный массив. Хранение данных в формате ключ-значение.
        Map<Integer, String> aMap = new HashMap<>();
        aMap.put(1, "foo");
        aMap.put(2, "bar");

        //Получение значения по ключу
        String s = aMap.get(1);

        //Возвращение коллекции по string
        Collection<String> values = aMap.values();

        //Цикл для изменения коллекций в map. Можно даже удалить элементы физически
        for (String v : values) {
        }


        //Получение всех ключей и значений
        Set<Map.Entry<Integer, String>> entries = aMap.entrySet();

        //Ненужный цикл для получения значений
        for (Map.Entry<Integer, String> e : entries) {
            System.out.println(e.getValue());
        }


        //Получение всех ключей
        Set<Integer> keySet = aMap.keySet();

        for (Integer element : intList) {

       }

        List<String> collect = intList.stream()
                .map(intSource -> String.valueOf(intSource))
                .collect(Collectors.toList());

        Iterator<Integer> iterator = intList.iterator();
       while (iterator.hasNext()) {
           if (iterator.next().equals(10))
                iterator.remove();
       }


        for (int i = 0; i < 3; i++) {
           System.out.println(intArray[i]);
       }

       for (int element: intArray) {
           System.out.println(element);
       }

    }

    static void printInt(int i) {
        System.out.println(i);
    }

    static List<Integer> returnListIfArgumentGreaterThen0(int i) {
        if (i > 0) {
            return Arrays.asList(i);
        }
        return Collections.emptyList();
    }
}

