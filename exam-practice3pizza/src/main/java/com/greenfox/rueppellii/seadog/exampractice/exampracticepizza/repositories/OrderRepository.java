package com.greenfox.rueppellii.seadog.exampractice.exampracticepizza.repositories;

import com.greenfox.rueppellii.seadog.exampractice.exampracticepizza.models.PizzaOrder;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<PizzaOrder, Long> {

    @Query(nativeQuery = true, value = "select pizza from pizza_order group by pizza ORDER BY count(pizza) desc limit 3")
    List<Object> showTop3();

  //  List<PizzaOrder> findTop3PizzaOrderByCount();
}
