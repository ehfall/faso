package sn.faso.fall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

@Configuration
@ComponentScan(basePackages = { "sn.faso.fall.dao" })
@EnableMongoRepositories({"sn.faso.fall.dao"}) 
public class MongoConfig extends AbstractMongoConfiguration{

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return "fasodb";
	}

	@Override
	public Mongo mongo() throws Exception {
		// TODO Auto-generated method stub
		return new MongoClient("127.0.0.1", 27017);
	}
	@Override
	protected String getMappingBasePackage() {
		// TODO Auto-generated method stub
		return "sn.faso.fall.entities";
	}

//	@Override
//	protected String getDatabaseName() {
//		// TODO Auto-generated method stub
//		return "fasodb";
//	}
//
//	@Override
//	@Bean
//	public Mongo mongo() throws Exception {
//		ServerAddress serverAddress = new ServerAddress("diarabi2.scalingo.io", 27017);
//         
//        Mongo mongo = new MongoClient(serverAddress);
//     
//        return mongo;
//	}
//	
//	@Bean(name="MongoTemplate")
//    public MongoTemplate mongoTemplate() throws Exception {
//        return new MongoTemplate(mongo(), "fasodb");
//    }

}
