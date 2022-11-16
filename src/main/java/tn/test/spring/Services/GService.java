package tn.test.spring.Services;

import java.util.List;

public interface GService<T, ID> {
    List<T> retrieveAll();

    T add(T t);

    T update(T t);

    void delete(ID id);

    T findById(ID id);

}
