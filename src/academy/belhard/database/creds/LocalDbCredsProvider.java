package academy.belhard.database.creds;

public class LocalDbCredsProvider implements DbCredentialsProvider{
    public static final String URL = "jdbc:mysql://localhost:3306/airport_db?useUnicode=true&serverTimezone=UTC";
    public static final String USER = "root";
    public static final String PASS = "root";

    @Override
    public String getUrl() {
        return URL;
    }

    @Override
    public String getUser() {
        return USER;
    }

    @Override
    public String getPassword() {
        return PASS;
    }
}
