public class Main {
    public static void main(String[] args) {
        Programmer programer = new Programmer("Ali","webdesigner", "PEAKSOFT");
        Dancer dancer = new Dancer("Aika","dancer","AKKUULAR");
        Singer singer = new Singer("Mirbek","singer","BIZ TOBU");
        System.out.println(programer);
        System.out.println(dancer);
        System.out.println(singer);
        programer.setCompanyName("MICROSOFT");
        singer.setBandname("AI NURU");
        dancer.setGroupname("KOGUCHKON");
        System.out.println();
        System.out.println();

        System.out.println(programer);
        System.out.println(dancer);
        System.out.println(singer);
        System.out.println();
        programer.eat();
        dancer.learn();
        singer.playGuitar();


    }
}