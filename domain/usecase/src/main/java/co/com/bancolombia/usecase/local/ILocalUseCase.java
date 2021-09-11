package co.com.bancolombia.usecase.local;

import co.com.bancolombia.model.local.Local;

import java.util.List;

public interface ILocalUseCase {
    List<Local> getLocales();
    Local getLocal(Long id);
    Local addLocal(Local local);
    void deleteLocal(Long id);
}
