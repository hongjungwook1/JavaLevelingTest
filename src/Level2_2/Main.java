package Level2_2;

public class Main {
    public static void main(String[] args) {
        MemberRepository memberRepository = new MemberRepository();

        Member member1 = new Member("KIM",18,"KIM@naver.com");
        Member member2 = new Member("LEE",28,"LEE@naver.com");
        Member member3 = new Member("PARK",38,"PARK@naver.com");

        System.out.println(memberRepository.create(member1));
        System.out.println(memberRepository.create(member2));
        System.out.println(memberRepository.create(member3));

        System.out.println(memberRepository.read(member1.getId()));

        System.out.println(memberRepository.read());

        member1.setName("HONG");
        member1.setIsDeleted(true);
        member1.setEmail("HONG@naver.com");
        memberRepository.update(member1.getId() , member1);
        System.out.println(memberRepository.read());

        memberRepository.delete(member2.getId());

        System.out.println(memberRepository.read());

    }
}