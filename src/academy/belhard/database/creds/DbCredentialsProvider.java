package academy.belhard.database.creds;

public interface DbCredentialsProvider {
    String getUrl();

    String getUser();

    String getPassword();
}
