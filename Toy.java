public class Toy implements Comparable<Toy> {
    private int id;
    private String name;
    private int frequency; // частота в %

    public Toy(int id, String name, int frequency) {
        this.id = id;
        this.name = name;
        this.frequency = frequency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public int compareTo(Toy o) {
        if (this.getFrequency() < o.getFrequency()) {
            return 1;
        } else if (this.getFrequency() > o.getFrequency()) {
            return -1;
        }
        return 0;
    }

    // @Override
    // public int compareTo(Toy other) {
    //     // Реализация сравнения для PriorityQueue, чтобы игрушки сортировались по убыванию частоты
    //     return Integer.compare(other.getFrequency(), this.getFrequency());
    // }

    @Override
    public String toString() {
        return String.format("%s, ID: %d, Frequency: %d", this.getName(), this.id, this.getFrequency());
    }
}