class Screen {
    void display() {
        System.out.println("Екран відображає зображення.");
    }
}

class Monitor extends Screen {
    void turnOn() {
        System.out.println("Монітор увімкнено.");
    }

    void turnOff() {
        System.out.println("Монітор вимкнено.");
    }
}
