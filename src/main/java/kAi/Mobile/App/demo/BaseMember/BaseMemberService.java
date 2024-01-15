package kAi.Mobile.App.demo.BaseMember;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service

public abstract class BaseMemberService<T extends BaseMember, ID, R extends BaseMemberRepository<T, ID>> {

    protected final R repository;

    public Optional<T> getByEmail(String email){
        return repository.findByEmail(email);
    }

    public Optional<T> getByID(ID id) {
        return repository.findById(id);
    }
    public List<T> getAll(){
        return repository.findAll();
    }

    public void create(T member){
        repository.insert(member);
    }

    public void remove(ID id){
        repository.deleteById(id);
    }

}

