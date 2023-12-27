import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.PriorityQueue;

public class ToyShop implements Iterable<Toy> {
    private PriorityQueue<Toy> toyQueue = new PriorityQueue<>();

    // Метод добавления игрушки в магазин
    public void addToy(Toy toy) {
        toyQueue.add(toy);
    }

    // Метод для получения игрушки из магазина (извлечения с наивысшей частотой)
    public Toy getToy() {
        return toyQueue.poll();
    }

    // Метод для рандомизации и записи в файл, а также вывода на консоль
    public void organizeRaffle(int iterationCount) {
        // проверяем наличие файла
        File file = new File("Java_toy_shop/output.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < iterationCount; i++) {
                // double random = Math.random() * 100;
                int random = ((int) Math.floor(Math.random() * 100)) + 1;
                for (Toy toy : toyQueue) {
                    if (random < toy.getFrequency()) {
                        System.out.println(toy);
                        writer.write(String.format("The toy fell out: %s (ID: %d)\n", toy.getName(), toy.getId()));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Iterator<Toy> iterator() {
        return toyQueue.iterator();
    }

}
