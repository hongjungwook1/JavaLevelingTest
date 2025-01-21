package Level3;

import java.util.List;

public interface IRepository<T extends Human, ID> {
    T create(T entity);
    T read(ID id);
    List<T> read();
    T update(ID id, T entity);
    void delete(ID id);
}