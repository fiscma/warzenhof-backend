package net.fiscma.wazenhof.warzenhofbackend.rest.controller.impl;

import net.fiscma.wazenhof.warzenhofbackend.model.Dish;
import net.fiscma.wazenhof.warzenhofbackend.rest.controller.BaseRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/dish")
public class DishRestControllerImpl extends BaseRestControllerImpl<Dish> implements BaseRestController<Dish> {
    @PostMapping(path = "/create/{name}")
    public ResponseEntity<Dish> create(@PathVariable String name) {
        Dish dish = new Dish();
        dish.setName(name);
        return ResponseEntity.ok(service.create(dish));
    }
}
