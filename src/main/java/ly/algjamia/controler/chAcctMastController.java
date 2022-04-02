package ly.algjamia.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ly.algjamia.model.chAcctMast;
import ly.algjamia.repostory.chAcctMastRepository;


@RestController
@RequestMapping("/api/chAcctMast")
public class chAcctMastController {

    @Autowired
    private chAcctMastRepository chacctMastRepository;
    
    
    @GetMapping
    public List<chAcctMast> findAllUsers() {
        return (List<chAcctMast>) chacctMastRepository.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<chAcctMast> findUserById(@PathVariable(value = "id") long id) {
        Optional<chAcctMast> chacctMast = chacctMastRepository.findById(id);

        if(chacctMast.isPresent()) {
            return ResponseEntity.ok().body(chacctMast.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public chAcctMast savechAcctMast(@Validated @RequestBody chAcctMast chacctMast) {
        return chacctMastRepository.save(chacctMast);
    }
}