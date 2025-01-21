package Level2;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MemberRepository extends MemberAbstractRepository {

    @Override
    public Member create(Member entity) {
        entity.setId(idGenerator());
        entity.setDeleted(false);
        memberMap.put(entity.getId(), entity);
        return entity;
    }
    @Override
    public Member read(Integer id) {
        return findUserById(id)
                .orElseThrow(() -> new RuntimeException("Read 불가 ID 값 미 존재  " + id));
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
        findUserById(id)
            .orElseThrow(() -> new RuntimeException("Update 불가 ID 값 미 존재 ID 값 :  " + id));
        entity.setId(id);
        memberMap.replace(entity.getId() , entity);
        return entity;
    }

    @Override
    public void delete(Integer id) {
        //read Method 어떻게 적용시킬지
        Member member = findUserById(id)
                .orElseThrow(()-> new RuntimeException("생성 된 객체 X"));
        member.setDeleted(true);
    }

//    delete 메소드
//    findUserById(id)
//        .filter(member1 -> member1.isDeleted())
//        .orElseThrow(()-> new RuntimeException("생성 된 객체 X"));
//    memberMap.remove(id);



}

