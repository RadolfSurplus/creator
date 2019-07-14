package poe.creator.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import poe.creator.data.models.Item;
import poe.creator.utils.SessionUtils;

@RestController()
@RequestMapping("/create")
public class CreationController {

    private static final Logger LOG = LogManager.getLogger(CreationController.class);

    @GetMapping("/current")
    public Item getCurrent() {
        return SessionUtils.getCurrentItem();
    }

    @PostMapping("/base")
    public Item selectBase() {
        Item currentItem = SessionUtils.getCurrentItem();
        return new Item();
    }

    @PostMapping("/type")
    public Item selectType() {
        return new Item();
    }

    @PostMapping("/suffix")
    public Item selectSuffix() {
        return new Item();
    }

    @PostMapping("/prefix")
    public Item selectPrefix() {
        return new Item();
    }
}
