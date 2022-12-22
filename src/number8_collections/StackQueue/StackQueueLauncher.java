package number8_collections.StackQueue;

import java.util.Stack;

public class StackQueueLauncher {
    public static void main(String[] args) {
        passengerProcessing();
    }

    private static void passengerProcessing() {
        Stack<Passenger> bus = new Stack<>();
    }

    private static class Passenger {
        private static int number;
        private String name;
        private String surname;

        public Passenger(String name, String surname) {
            number++;
            this.name = name;
            this.surname = surname;
        }

        public static int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public String toString() {
            return "Passenger{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    }

}
