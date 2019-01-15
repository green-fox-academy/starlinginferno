package com.greenfox.rueppellii.seadog.week08day4.reddit.repositories;

import com.greenfox.rueppellii.seadog.week08day4.reddit.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
