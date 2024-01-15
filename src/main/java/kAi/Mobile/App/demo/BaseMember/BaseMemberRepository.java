package kAi.Mobile.App.demo.BaseMember;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.io.Serializable;
import java.util.Optional;

public interface BaseMemberRepository<T extends BaseMember, ID> extends MongoRepository<T, ID> {
    Optional<T> findByEmail(String email);
}