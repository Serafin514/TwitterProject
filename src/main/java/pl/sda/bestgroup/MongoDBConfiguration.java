package pl.sda.bestgroup;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.List;
@EnableMongoRepositories(basePackages = {"pl.sda"})
@Configuration
public class MongoDBConfiguration {

    public static final String MONGODB_BEAN_NAME = "Mongo";

    @Value("${hrprojects.mongodb.port:13003}")//port
    private Integer mongoPort;

    @Value("${hrprojects.mongodb.host:ds113003.mlab.com}")//host
    private String mongoHost;

    @Value("${hrprojects.mongodb.dbname:chris_base}")//nazwabazy
    private String mongoDBName;

    @Value("${hrprojects.mongodb.user:admin1}")//nazwa uzytkownika na bazie
    private String user;

    @Value("${hrprojects.mongodb.password:admin1}")//haslo do bazy danych
    private String password;

    protected String getDatabaseName() {
        return mongoDBName;
    }

    public @Bean(name = MONGODB_BEAN_NAME)
    Mongo mongo() throws Exception {
        MongoCredential m = MongoCredential.createCredential(user, mongoDBName, password.toCharArray());

        List<ServerAddress> addresses = new ArrayList<>();
        addresses.add(new ServerAddress(mongoHost + ":" + mongoPort));

        List<MongoCredential> credentials = new ArrayList<>();
        credentials.add(m);
        return new MongoClient(addresses, credentials);
    }

}

