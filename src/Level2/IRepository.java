package Level2;

import java.util.List;
import java.util.Optional;

public interface IRepository {
    Member create(Member entity);
    Member read(Integer id);
    List<Member> listRead();
    Member update(Integer id, Member entity);
    void delete(Integer id);
}