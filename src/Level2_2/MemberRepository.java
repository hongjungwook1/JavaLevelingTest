package Level2_2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository extends MemberAbstractRepository {

    @Override
    public Member create(Member entity) {
        entity.setId(idGenerator());
        entity.setIsDeleted(false);
        memberMap.put(entity.getId() , entity);
        return entity;
    }

    @Override
    public Member read(Integer id) {
        return findId(id)
                .orElseThrow(()-> new RuntimeException("Can't Read id :" + id));
    }

    @Override
    public List<Member> read() {
        return memberMap.values().stream()
                .filter(member -> !member.getIsDeleted())
                .toList();
    }

    @Override
    public Member update(Integer id, Member entity) {
        findId(id)
                .orElseThrow(()-> new RuntimeException("Can't Update id : " + id));
        entity.setId(id);
        memberMap.replace(entity.getId() , entity);
        return entity;
    }

    @Override
    public void delete(Integer id) {
        Member member = findId(id)
                .orElseThrow(()-> new RuntimeException("Can't Delete"));
        member.setIsDeleted(true);
    }
}
