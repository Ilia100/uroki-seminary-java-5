// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов

package hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class task1hw {


    public static Map<List<String>, List<String>> phoneBookInit() {
        Scanner iScanner = new Scanner(System.in,"cp866");
        Map<List<String>, List<String>> phoneBook = new HashMap<>();
        List<String> phoneNum = new ArrayList<String>();
        String flag = "";
        String familyName;
        String name;
        while (!flag.equals("в")) {
            System.out.printf("Введите Фамилию: ");
            familyName = iScanner.next();
            System.out.printf("Введите Имя: ");
            name = iScanner.next();
            
            while (!flag.equals("в")) {
                System.out.printf("Введите номер телефона: ");
                phoneNum.add(iScanner.next());
                System.out.println("Нажмите любую букву чтоб ввести следующий номер телефона\n или 'в' чтобы пропустить: ");
                flag = iScanner.next();
                
            }
            phoneBook.put(Arrays.asList(familyName, name), phoneNum);
            System.out.println();
            System.out.println(
                    "Нажмите любую букву чтоб родолжить вводить данные в телефоннцю книгу\n или 'в' чтоб закончить ввод: ");
            flag = iScanner.next();
        }

        iScanner.close();
        return phoneBook;

    }

    public static void main(String[] args) {
        Map<List<String>, List<String>> myPhoneBook = new HashMap<>();
        myPhoneBook = phoneBookInit();
        System.out.println(myPhoneBook);
        

    }
}
