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

import ly.algjamia.model.AcctStates;

import ly.algjamia.repostory.AcctStatesRepository;


@RestController
@RequestMapping("/api/AcctStates")
public class AcctStatesController {

    @Autowired
    private AcctStatesRepository acctStatesRepository;
    
    
    @GetMapping
    public List<AcctStates> findAllUsers() {
        return (List<AcctStates>) acctStatesRepository.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<AcctStates> findUserById(@PathVariable(value = "id") long id) {
        Optional<AcctStates> acctStates = acctStatesRepository.findById(id);

        if(acctStates.isPresent()) {
            return ResponseEntity.ok().body(acctStates.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public AcctStates saveAcctStates(@Validated @RequestBody AcctStates acctStates) {
        return acctStatesRepository.save(acctStates);
    }
}