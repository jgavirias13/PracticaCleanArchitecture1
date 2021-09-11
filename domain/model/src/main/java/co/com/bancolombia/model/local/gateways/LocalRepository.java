package co.com.bancolombia.model.local.gateways;

import co.com.bancolombia.model.local.Local;

import java.util.List;

public interface LocalRepository {
    Local save(Local local);
    Local findById(Long id);
    List<Local> findAll();
    void deleteById(Long id);
}
