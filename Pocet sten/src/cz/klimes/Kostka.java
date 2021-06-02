package cz.klimes;

import java.util.Random;

public class Kostka {

        private int pocetSten;
        private Random random;
        private int pocetHoduNaJedenTah = 0;
        public Kostka(int pocetSten) {
            this.pocetSten = pocetSten;
            this.random = new Random();
        }

        public Kostka() {
            this(6);
        }

        public int getPocetSten() {
            return this.pocetSten;
        }

        @Override
        public String toString() {
            return "Kostka{" +
                    "pocetSten=" + this.pocetSten +
                    '}';
        }

        public int hodVPoli(){

            int sumaHodu = 0;
            int hod = randomNumber();
            sumaHodu += hod;
            pocetHoduNaJedenTah = 1;
            while (hod == 6) {
                hod = randomNumber();
                sumaHodu += hod;
                pocetHoduNaJedenTah++;
            }
            return sumaHodu;
        }

        public int randomNumber() {
            return random.nextInt(this.pocetSten) + 1;
        }

    public int getPocetHoduNaJedenTah() {
        return pocetHoduNaJedenTah;
    }
}

