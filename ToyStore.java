import java.util.PriorityQueue;
import java.util.Comparator;
import java.io.FileWriter;
import java.io.IOException;

public class ToyStore {
    private PriorityQueue<Toy> toys;

    public ToyStore() {
         // Инициализация кдасса PriorityQueue для сортировки по весу
         this.toys = new PriorityQueue<>(Comparator.comparingInt(Toy::getWeight).reversed());
        }
    
        public void addToy(Toy toy) {
            toys.add(toy);
        }