package com.angularway.vision.repository.implementation;
import com.angularway.vision.entity.User;
import com.angularway.vision.repository.interfaces.UserRepositoryDAO;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserRepository implements UserRepositoryDAO {

    private EntityManager entityManager;

    @Autowired
    public UserRepository( EntityManager entityManager){
        this.entityManager =entityManager;
    }

    @Override
    @Transactional
    public List<User> findAll() {
        Session currentSession = this.entityManager.unwrap(Session.class);
        Query<User> userQuery =  currentSession.createQuery("from User", User.class);
        return userQuery.getResultList();
    }
}
