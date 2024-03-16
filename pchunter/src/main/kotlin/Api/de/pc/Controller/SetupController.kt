package Api.de.pc.Controller

import Api.de.pc.Modelo.Setup
import Api.de.pc.Repository.SetupRepository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping( "/product")
class SetupController {

    @Autowired
    lateinit var  repository: SetupRepository

    @GetMapping("/list")
    fun getAllSetups(): List<Setup> = repository.findAll().toList()

    @PostMapping("/add")
    fun addSetup(@RequestBody setup:Setup) = repository.save(setup)
}