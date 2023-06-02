// Пусть дан список сотрудников:
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
//  Отсортировать по убыванию популярности.

package hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task2hw {

    public static List<String> filter(List<String> workersTemp) {
        Map<String, Integer> workersFilteredTemp = new HashMap<>();
        String[] name;
        List<String> arr = new ArrayList<>();
        for (String entry : workersTemp) {
            name = entry.split(" ");
            if (workersFilteredTemp.containsKey(name[0])) {
                workersFilteredTemp.put(name[0], workersFilteredTemp.get(name[0]) + 1);

            } else {
                workersFilteredTemp.put(name[0], 1);
            }
        }

        for (java.util.Map.Entry<String, Integer> entry : workersFilteredTemp.entrySet()) {
            if (entry.getValue() > 1) {
                arr.add(entry.getValue().toString() + " " + entry.getKey());
            }

        }
        Collections.sort(arr, Collections.reverseOrder());

        return arr;

    }

    public static void main(String[] args) {
        List<String> workers = new ArrayList<>();

        workers.add("Иван Иванов");
        workers.add("Светлана Петрова");
        workers.add("Кристина Белова");
        workers.add("Анна Мусина");
        workers.add("Анна Крутова");
        workers.add("Иван Юрин");
        workers.add("Петр Лыков");
        workers.add("Павел Чернов");
        workers.add("Петр Чернышов");
        workers.add("Мария Федорова");
        workers.add("Марина Светлова");
        workers.add("Мария Савина");
        workers.add("Мария Рыкова");
        workers.add("Марина Лугова");
        workers.add("Анна Владимирова");
        workers.add("Иван Мечников");
        workers.add("Петр Петин");
        workers.add("Иван Ежов");

        workers = filter(workers);
        System.out.println(workers);

    }
}
