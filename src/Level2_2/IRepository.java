package Level2_2;

import java.util.List;

public interface IRepository {
    Member create(Member entity);
    Member read(Integer id);
    List<Member> read();
    Member update(Integer id, Member entity);
    void delete(Integer id);
}