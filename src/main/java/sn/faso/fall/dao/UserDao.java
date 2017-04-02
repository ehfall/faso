package sn.faso.fall.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import sn.faso.fall.entities.User;

@Repository
 
public interface UserDao extends MongoRepository<User,String>{

}
