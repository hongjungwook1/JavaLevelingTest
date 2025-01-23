package Level3;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public abstract class AbstractRepository<T extends Human, ID> implements IRepository<T , ID>{
    protected Map<Integer , T> userMap = new HashMap<>();

    private static int idCount = 0;

    protected int idGenerator() {
        return ++idCount;
    }

    protected Optional<T> findById(Integer id) {
        return Optional.ofNullable(userMap.get(id));
    }

    protected Map<Integer, T> current() {
        userMap.forEach((key , t) -> {
            System.out.println("id : " + key + " : " + t);
        });
        return userMap;
    }

}
