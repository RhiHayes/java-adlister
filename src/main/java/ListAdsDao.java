import java.util.ArrayList;
import java.util.List;

public class ListAdsDao implements Ads {
    private List<Ad> ads;

    public List<Ad> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }

    private List<Ad> generateAds() {
        List<Ad> ads = new ArrayList<>();
        ads.add(new Ad(
                1,
                1,
                "Nintendo Switch",
                "Release date: March 3, 2017"
        ));
        ads.add(new Ad(
                2,
                1,
                "Xbox S",
                "Release date: November 15, 2021"
        ));
        ads.add(new Ad(
                3,
                2,
                "Playstation 5",
                "Release date: November 12, 2020"
        ));
        ads.add(new Ad(
                4,
                2,
                "Wii",
                "Release date: November 19, 2006"
        ));
        return ads;
    }
}
