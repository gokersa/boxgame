public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Max", 10, 100, 100, 50);
        Fighter f2 = new Fighter("Charles", 20, 80, 95, 20);

        Match match = new Match(f1,f2,90,100);
        match.run();
    }
}