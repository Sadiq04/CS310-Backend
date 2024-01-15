package kAi.Mobile.App.demo.BaseMember;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/baseMember") // Generic base path, can be overridden in child controllers
public abstract class BaseMemberController<T extends BaseMember, ID, S extends BaseMemberService<T, ID, ?>> {
    private final S service;

    @GetMapping("/getByEmail/{email}")
    public Optional<T> getByEmail(@PathVariable String email){
        return service.getByEmail(email);
    }

    @GetMapping("/getById/{id}")
    public Optional<T> getByID(@PathVariable ID id){
        return service.getByID(id);
    }

    @GetMapping("/getAll")
    public List<T> getAll(){
        return service.getAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody T member){
        service.create(member);
    }

    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable ID id){
        service.remove(id);
    }
}
