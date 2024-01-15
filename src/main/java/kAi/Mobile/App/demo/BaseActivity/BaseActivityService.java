package kAi.Mobile.App.demo.BaseActivity;

import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public abstract class BaseActivityService<T extends BaseActivity, ID, R extends MongoRepository<T, ID>> {

    protected final R repository;

    public Optional<T> getById(ID id) {
        return repository.findById(id);
    }

    public List<T> getAll() {
        return repository.findAll();
    }

    public T create(T entity) {
        return repository.insert(entity);
    }

    public void delete(ID id) {
        repository.deleteById(id);
    }

    public T update(T entity, ID id) {
        return repository.findById(id)
        .map(existingEntity -> {
            BeanUtils.copyProperties(entity, existingEntity, "id");
            return repository.save(existingEntity);
        })
        .orElseThrow(() -> new IllegalArgumentException("Entity not found with id: " + id));
    }
}
