package Level2;

import java.util.List;

public class MemberRepository extends MemberAbstractRepository {

    @Override
    public Member create(Member entity) {
        int idValue = idGenerator();
        entity.setId(idValue);
        memberMap.put(idValue , entity);
        current();
        System.out.println();
        return entity;
    }
    @Override
    public Member read(Integer id) {
        return findUserById(id)
                .filter(member -> !member.isDeleted())
                .orElseThrow(() -> new RuntimeException("불가 ID 값 미 존재  " + id));
    }

    @Override
    public List<Member> listRead() {
        return memberMap.values()
                .stream()
                .filter(member -> !member.isDeleted())
                .toList();
    }

    @Override
    public Member update(Integer id, Member entity) {
        read(id);
//       중복 제거
//        findUserById(id)
//            .filter(member -> !member.isDeleted())
//            .orElseThrow(() -> new RuntimeException("Update 불가 ID 값 미 존재 ID 값 :  " + id));
        entity.setId(id);
        memberMap.replace(entity.getId() , entity);
        current();
        return entity;
    }

    @Override
    public void delete(Integer id) {
        Member member = read(id);
//        중복 제거
//        Member member = findUserById(id)
//                .orElseThrow(()-> new RuntimeException("생성 된 객체 X"));
        member.setDeleted(true);
        current();
    }

}

