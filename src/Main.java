public class Main {
    public static void main(String[] args) {
        // Skapa en klass Counter där man kan sätta ett intervall och sen öka/minska
        // nuvarande värde genom metodanrop. Går man utanför intervallet skall en
        // felsignal genereras.


    }
}

class Counter {
    int value;
    int min;
    int max;

    void init(int min, int max) {
        this.min = min;
        this.max = max;
    }

    void inc() {
        if (value < max) {
            value++;
        } else {
            throw new IllegalStateException("Ogiltigt värde");
        }
    }

    void dec() {
        if (value > min) {
            value--;
        } else {
            throw new IllegalStateException("Ogiltigt värde");
        }
    }
}