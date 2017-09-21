package day2.webscraper;

public class Tester implements Runnable {

    Thread t1 = new Thread();
    Thread t2 = new Thread();
    Thread t3 = new Thread();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Avilable Processors: " + Runtime.getRuntime().availableProcessors());

        TagCounter tc1 = new TagCounter("http://www.fck.dk");
        tc1.start();
        tc1.join();
        TagCounter tc2 = new TagCounter("http://www.google.com");
        tc2.start();
        tc2.join();
        TagCounter tc3 = new TagCounter("http://politiken.dk/");
        tc3.start();
        tc3.join();

        System.out.println("Title: " + tc1.getTitle());
        System.out.println("Div's: " + tc1.getDivCount());
        System.out.println("Body's: " + tc1.getBodyCount());

        System.out.println("Title: " + tc2.getTitle());
        System.out.println("Div's: " + tc2.getDivCount());
        System.out.println("Body's: " + tc2.getBodyCount());

        System.out.println("Title: " + tc3.getTitle());
        System.out.println("Div's: " + tc3.getDivCount());
        System.out.println("Body's: " + tc3.getBodyCount());
        
        long start = System.nanoTime();
        tc1.run();
        tc2.run();
        tc3.run();
        long end = System.nanoTime();
        System.out.println("Time Sequential: " + (end - start));
    }

    @Override
    public void run() {

    }
}
