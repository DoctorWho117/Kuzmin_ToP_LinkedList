public class Main {
    public static void main(String[] args) {
        List list = new List();

        list.add("Тимур", "Сэмплер", 34);
        list.add("Алексей", "Ударник", 35);
        list.add("Илья", "Гитарист", 34);
        list.add("Евгений", "Басист", 32);
        list.add("Ортем", "Второй рот группы", 36);
        list.add("Сега", "Певец ртом", 35);

        while (list.getSize() >= 0){
            System.out.println(list.toString());
        }
    }
}