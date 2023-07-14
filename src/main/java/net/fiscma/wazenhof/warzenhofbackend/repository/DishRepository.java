package net.fiscma.wazenhof.warzenhofbackend.repository;

import net.fiscma.wazenhof.warzenhofbackend.model.Dish;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends BaseRepository<Dish, Long> {
}
