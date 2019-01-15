package com.greenfox.rueppellii.tribes2.authentication.repositories;

import com.greenfox.rueppellii.tribes2.authentication.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
