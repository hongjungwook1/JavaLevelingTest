package Level3;


import java.util.List;

public class MemberRepository extends AbstractRepository <Member , Integer>{
    @Override
    public Member create(Member entity) {
        int getIdNumber = idGenerator();
        entity.setId(getIdNumber);
        userMap.put(getIdNumber , entity);
        current();
        System.out.println("------생성------");
        return entity;
    }

    @Override
    public Member read(Integer integer) {
        return findById(integer)
                .orElseThrow(() -> new RuntimeException("ID를 찾을 수 없다."));
    }

    @Override
    public List<Member> read() {
        List<Member> findMembers = userMap.values().stream()
                .filter(member -> !member.isDeleted())
                .toList();
        return findMembers;
    }

    public List<MemberResponseDto> result () {
        List<Member> findMembers = read();
        List<MemberResponseDto> collect = findMembers.stream()
                .map(member-> new MemberResponseDto(
                        member.getId(),
                        member.getName(),
                        member.getAge(),
                        member.getEmail()
                ))
                .toList();
        return collect;
    }

    @Override
    public Member update(Integer integer, Member entity) {
        read(integer);
        userMap.replace(entity.getId() , entity);
        entity.setId(integer);
        current();
        System.out.println("------수정------");
        return entity;
    }

    @Override
    public void delete(Integer integer) {
        read(integer);
        Member member = userMap.get(integer);
        member.activationIsDeleted();
        current();
        System.out.println("------삭제------");
    }
}
