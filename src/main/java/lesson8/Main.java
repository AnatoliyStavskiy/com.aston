package lesson8;

public class Main {
    public static void main(String[] args) {
        Word word = new Word();

        String[] words = {"Oliver", "Bob", "Bob", "Alex", "John", "Robert", "Bob", "Jack", "Harry", "Robert",
                "Thomas", "Oliver", "Bob", "Jacob", "Harry", "Adam", "Jack", "Ashley", "Harry", "Adam"};

        System.out.println(word.uniqueWords(words));
        System.out.println(word.countWords(words));

        new PhoneDirectory().
                add("Volkov", "+375(29)222-78-78").
                add("Volkov", "+375(33)777-25-11").
                add("Bobrov", "+375(44)555-15-15").
                add("Volkov", "+375(29)999-99-99").
                add("Bobrov", "+375(44)444-21-21").
                add("Ivanov", "+375(25)111-88-88").
                get("Volkov").
                get("Bobrov").
                get("Ivanov");

    }
}
