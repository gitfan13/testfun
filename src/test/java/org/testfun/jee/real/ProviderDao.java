package org.testfun.jee.real;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ProviderDao {
    Provider save(Provider t);
    List<Provider> getAll();
}