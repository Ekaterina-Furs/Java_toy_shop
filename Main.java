public class Main {
    public static void main(String[] args) {
        // Создаем объект магазина
        ToyShop toyShop = new ToyShop();

        // Добавляем игрушки в магазин
        toyShop.addToy(new Toy(1, "Конструктор", 20));
        toyShop.addToy(new Toy(2, "Робот", 30));
        toyShop.addToy(new Toy(3, "Кукла", 50));

        // Вывод очереди (для контроля)
        for (Toy toy : toyShop) {
            System.out.println(toy);
        }


        System.out.println();
        toyShop.organizeRaffle(10); // аргумент задает количество розыгрышей
    }
}