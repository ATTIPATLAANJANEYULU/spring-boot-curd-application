package com.org.product.controller;

import com.org.product.model.Tomoto;
import com.org.product.repository.TomotoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tomoto")
public class TomotoController {

    @Autowired
    private TomotoRepo tomotoRepo;


    /*
     * crud operations we need to perform
     *
     * */

    @PostMapping("/create")
    public void createTomoto(@RequestBody Tomoto tomoto) {

        tomotoRepo.save(tomoto);

    }

    @GetMapping("/getOneRecord/{boxId}")
    public Tomoto getByBoxId(@PathVariable Integer boxId) {
        return tomotoRepo.findByBoxId(boxId);
    }

    @GetMapping("/getAll")
    public List<Tomoto> getAllTomoto() {
        return tomotoRepo.findAll();

    }
    @DeleteMapping("/deleteByBoxId/{boxId}")
    public void deleteByBoxId(@PathVariable Integer boxId) {
        tomotoRepo.deleteByBoxId(boxId);

    }

    @DeleteMapping("/deleteAllRecords")
    public void deleteAllRecords() {
        tomotoRepo.deleteAll();

    }

    @PutMapping("/updateRecords")
    public String updateRecords(@RequestBody Tomoto tomoto) {
        tomotoRepo.save(tomoto);
        return "updated success fully";
    }

    @PutMapping("/updateRecords/{boxId}/{tomotoName}")
    public void updateRecords(@PathVariable Integer boxId, @PathVariable String tomotoName) {
        Tomoto tomoto = tomotoRepo.findByBoxId(boxId);
        tomoto.setTomotoName(tomotoName);
        tomotoRepo.save(tomoto);
    }
}
