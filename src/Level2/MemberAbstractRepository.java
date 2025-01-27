package Level2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public abstract class MemberAbstractRepository implements IRepository {
    protected Map<Integer , Member> memberMap = new HashMap<>();

    private static int idCount = 0;

    protected static int idGenerator() {
        return ++idCount;
    }
    protected Optional<Member> findUserById(int id) {
        return Optional.ofNullable(memberMap.get(id));
    }

    public Map<Integer, Member> current() {
        memberMap.forEach((key , value) -> {
            System.out.println("id : " + key + " : " + value);
        });
        return memberMap;
    }
}
