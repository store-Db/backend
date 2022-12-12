package tn.test.spring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import tn.test.spring.Repository.GRepository;

import java.util.List;

public class GServiceImp<T, ID> implements GService<T, ID> {

    @Autowired
    public GRepository<T, ID> gRepository;

    @Override
    public List<T> retrieveAll() {
        return gRepository.findAll();
    }

    @Override
    public T add(T t) {
        gRepository.save(t);
        return t;
    }

    @Override
    public T update(T t) {
        gRepository.save(t);
        return t;
    }

    @Override
    public void delete(ID id) {
        gRepository.deleteById(id);
    }

    @Override
    public T findById(ID id) {

        return gRepository.findById(id).get();
    }
}







