package bahor.test.controller;

import bahor.test.model.BlackList;
import bahor.test.service.BLService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class Rest {

    private final BLService BLService;

    public Rest(BLService BLService) {
        this.BLService = BLService;
    }

    @GetMapping("all")
    public ResponseEntity getAll(){
        return ResponseEntity.ok(BLService.getAll());
    }

    @PostMapping("add")
    public ResponseEntity save(@RequestBody BlackList blackList){
        return ResponseEntity.ok(BLService.save(blackList));
    }

}
