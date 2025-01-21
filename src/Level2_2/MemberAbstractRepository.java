package Level2_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public abstract class MemberAbstractRepository implements IRepository{
    protected Map<Integer , Member> memberMap = new HashMap<>();
    private static int idCount = 0;

    protected int idGenerator() {
        return idCount++;
    }

    protected Optional<Member> findId(int id) {
        return Optional.ofNullable(memberMap.get(id));
    }



}
