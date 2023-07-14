package net.fiscma.wazenhof.warzenhofbackend.rest.controller.impl;

import net.fiscma.wazenhof.warzenhofbackend.model.Dish;
import net.fiscma.wazenhof.warzenhofbackend.rest.controller.BaseRestController;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dish")
public class DishRestController extends BaseRestControllerImpl<Dish> implements BaseRestController<Dish> {

}
