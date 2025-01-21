package Level1;

public interface IRepository {

    Member create(Member entity);
    Member read(Integer id);
    Member update(Member entity);
    void delete(Integer id);
}