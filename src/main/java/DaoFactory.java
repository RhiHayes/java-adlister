import com.codeup.adlister.Config;

import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;
    private static Config config = new Config();


    public static Ads getAdsDao() throws SQLException {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(new Config());
        }
        return adsDao;
    }

}
