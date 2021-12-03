import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {

        Album album1 = new Album();
        album1.setId(1);
        album1.setArtist("UVERworld");
        album1.setName("T0uch off");
        album1.setReleaseDate(2019);
        album1.setSales(50);
        album1.setGenre("Pop, Rock");

        Album album2 = new Album();
        album2.setId(2);
        album2.setArtist("Taeko Onuki");
        album2.setName("4:00 AM");
        album2.setReleaseDate(1978);
        album2.setSales(65);
        album2.setGenre("Pop");

        Author author1 = new Author();
        author1.setId(1);
        author1.setFirstName("JK");
        author1.setLastName("Rowling");

        Author author2 = new Author();
        author2.setId(2);
        author2.setFirstName("Kaiu");
        author2.setLastName("Shirai");

        Quote quote1 = new Quote();
        quote1.setId(1);
        quote1.setContent("\"Love For All, Hatred For None\"");
        quote1.setAuthor("Khalifatul Masih III");

        Quote quote2 = new Quote();
        quote2.setId(2);
        quote2.setContent("Whatever you do, do it well");
        quote2.setAuthor("Walt Disney");


        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);


    }

}
