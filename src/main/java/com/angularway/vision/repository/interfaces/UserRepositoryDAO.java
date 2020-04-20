package com.angularway.vision.repository.interfaces;

import com.angularway.vision.entity.User;

import java.util.List;

public interface UserRepositoryDAO {
    public List<User> findAll();
}
