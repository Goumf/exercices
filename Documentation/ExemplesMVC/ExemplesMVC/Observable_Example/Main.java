public class Main {
    public static void main(String[] args) {
        Model model = new Model();

        View v1 = new View("Vue 1");
        View v2 = new View("Vue 2");

        model.addObserver(v1);
        model.addObserver(v2);

        model.increment();
        model.increment();
    }
}