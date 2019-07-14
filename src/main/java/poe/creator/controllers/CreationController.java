package poe.creator.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import poe.creator.data.models.Response;

@RestController("/create")
public class CreationController {

    private static final Logger LOG = LogManager.getLogger(CreationController.class);

    @PostMapping("/base")
    public Response selectBase() {
        return new Response();
    }

    @PostMapping("/type")
    public Response selectType() {
        return new Response();
    }

    @PostMapping("/suffix")
    public Response selectSuffix() {
        return new Response();
    }

    @PostMapping("/prefix")
    public Response selectPrefix() {
        return new Response();
    }
}
