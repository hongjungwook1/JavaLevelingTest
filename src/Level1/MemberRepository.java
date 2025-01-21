package Level1;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository implements IRepository {
    private final Map<Integer , Member> memberMap = new HashMap<>();
    private static int idCount = 0;

    @Override
    public Member create(Member entity) {
        entity.setId(idGenerator());
        memberMap.put(idCount, entity);
        return entity;
    }

    @Override
    public Member read(Integer id) {
        return memberMap.get(id);
    }

    @Override
    public Member update(Member entity) {
        memberMap.replace(entity.getId(), entity);
        return entity;
    }

    @Override
    public void delete(Integer id) {
        memberMap.remove(id);
    }

    private static int idGenerator() {
        return ++idCount;
    }

    public Map<Integer, Member> getMemberMap() {
        memberMap.forEach((key , value) -> {
            System.out.println("id : " + key + " : " + value);
        });
        return memberMap;
    }
}
