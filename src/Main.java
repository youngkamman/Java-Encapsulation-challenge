public class Main {
    public static void main(String[] args) {


        Printer printer = new Printer(50,true);
        System.out.println("initial page count =  " + printer.getPagesPrinted());
        int pagesPrinted = printer.printpage(4);

        System.out.println("Pages printed was " + pagesPrinted + " new total count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printpage(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total count for printer = " + printer.getPagesPrinted());


    }
}
