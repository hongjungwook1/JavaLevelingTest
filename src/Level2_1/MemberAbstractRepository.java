package Level2_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public abstract class MemberAbstractRepository implements IRepository{
    protected Map<Integer , Member> members = new HashMap<>();

    protected static int idCount = 0;

    protected int idGenerator() {
        return idCount++;
    }

    protected Optional<Member> findId(int id) {
        return Optional.ofNullable(members.get(id));
    }



}
