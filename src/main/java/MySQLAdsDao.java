import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;

import com.codeup.adlister.Config;
import com.mysql.cj.jdbc.Driver;


public class MySQLAdsDao implements Ads {

    private Config config = new Config();

    private Connection connection;


    public MySQLAdsDao(Config config) throws SQLException {

        DriverManager.registerDriver(new Driver());
        this.connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUsername(),
                config.getPassword()
        );

    }


    public List<Ad> all() {
        String selectQuery = "SELECT * FROM ads";
        Statement statement = null;
        ResultSet resultSet = null;
        List<Ad> adsList = new ArrayList<>();

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {
                Ad currentAd = new Ad(resultSet.getInt("id"), resultSet.getString("title"), resultSet.getString("description"));
                adsList.add(currentAd);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return adsList;

    }


    public Long insert(Ad ad) {

        try {
            String query = "INSERT INTO ads (user_id, title, description) VALUES (1, 'the ad', 'the description')";
            //the missing key to get the data inserted on this exercise was including the user_id! :D
            Statement statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);

        } catch(SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
