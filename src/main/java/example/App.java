package example;

public class App {
    public static void main(String[] args) {
        Scraper scraper = new Scraper();
        scraper.login();
        scraper.scrapePage();
        scraper.quitDriver();
    }
}
