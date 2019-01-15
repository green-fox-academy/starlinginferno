package com.greenfox.rueppellii.tribes2.authentication.repositories;

import com.greenfox.rueppellii.tribes2.authentication.models.ApplicationUser;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationUserRepository extends CrudRepository<ApplicationUser, Long> {

    ApplicationUser findByUsername(String username);
}
