package com.nexify.webapp.controllers;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// INFO: See alternative E-Mail validation approach below using @Valid annotation
import com.nexify.webapp.models.Greeting;

 
import lombok.extern.slf4j.Slf4j;

// INFO: Validator implementation provided by 'hibernate-validator' (see pom file)

/**
 * 'Hello World' Controller
 */
@Slf4j
@RestController
@RequestMapping(value = "/api/greeting")
public class HelloWorldController {

    /**
     * Send greetings by email
     * @param name
     */
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value = "Generate greeting")
    @ApiResponses(value = {
        @ApiResponse(code = 400, message = "Bad Request")
    })
    public ResponseEntity<Greeting> getGreeting(
            @ApiParam(name = "name", value = "name") @RequestParam(name = "name", required = false) String name)  {

        log.info("Send greeting to '" + name + "'...");
        return new ResponseEntity<>(new Greeting(name), HttpStatus.OK);
    }

}
