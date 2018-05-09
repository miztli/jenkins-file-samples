package com.samples.propertiessamples.controllers

import com.samples.propertiessamples.model.PropertiesBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PropsController {

    @Autowired
    PropertiesBean propertiesBean

    @GetMapping("/props")
    public PropertiesBean getProps(){
        propertiesBean
    }

}
