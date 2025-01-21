package Level2_1;

import java.util.List;

public class MemberRepository extends MemberAbstractRepository{

    @Override
    public Member create(Member entity) {
        entity.setId(idGenerator());
        entity.setDeleted(false);
        members.put(entity.getId() , entity);
        return entity;
    }

    @Override
    public Member read(Integer id) {
        return findId(id)
                .orElseThrow(()-> new RuntimeException("No READ"));
    }

    @Override
    public List<Member> read() {
        return members.values().stream()
                .filter(member -> !member.isDeleted())
                .toList();
    }

    @Override
    public Member update(Integer id, Member entity) {
        findId(id)
                .orElseThrow(()-> new RuntimeException("No Update"));
        System.out.println(id);
        entity.setId(id);
        members.replace(entity.getId() , entity);
        return entity;
    }

    @Override
    public void delete(Integer id) {
        Member member = findId(id)
                .orElseThrow(()-> new RuntimeException("No Delete"));
        member.setDeleted(true);


    }
}
