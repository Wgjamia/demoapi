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
import ly.algjamia.model.acctTransaction;
import ly.algjamia.repostory.AcctTransactinsRepository;

@RestController
@RequestMapping("/api/AcctTransaction")
public class AcctTransactionController {

    @Autowired
    private AcctTransactinsRepository acctTransactinsRepository;
    
    
    @GetMapping
    public List<acctTransaction> findAllUsers() {
        return (List<acctTransaction>) acctTransactinsRepository.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<acctTransaction> findUserById(@PathVariable(value = "id") long id) {
        Optional<acctTransaction> acctTran = acctTransactinsRepository.findById(id);

        if(acctTran.isPresent()) {
            return ResponseEntity.ok().body(acctTran.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public acctTransaction savechAcctMast(@Validated @RequestBody acctTransaction acctran) {
        return acctTransactinsRepository.save(acctran
        		);
    }
}