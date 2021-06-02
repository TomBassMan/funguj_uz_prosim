package cz.klimes;

public class Main {

    public static void main(String[] args) {
	// write your code here
        testKostka();
    }

    public static void testKostka (){
        Kostka k = new Kostka();
        for (int i = 0; i < 10; i++) System.out.println(i + ".hod:" + k.hodVPoli() + "   pocet hodu v tahu: " + k.getPocetHoduNaJedenTah());



    }
}
