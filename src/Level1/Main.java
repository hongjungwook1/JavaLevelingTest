package Level1;

public class Main {
    public static void main(String[] args) {

        MemberRepository memberRepository = new MemberRepository();
        Member member1 = new Member( "Kim",30,"Kim@naver.com");
        Member member2 = new Member( "Park",20,"Park@naver.com");
        Member member3 = new Member( "Lee",10,"Lee@naver.com");

        memberRepository.create(member1);
        memberRepository.create(member2);
        memberRepository.create(member3);

        System.out.println(member1.getId());
        System.out.println(member2.getId());
        System.out.println(member3.getId());

        System.out.println("-------delete---------");

        System.out.println(memberRepository.read(member2.getId()));

        memberRepository.delete(member2.getId());

        System.out.println(memberRepository.read(member2.getId()));
        System.out.println();

        System.out.println("-------update---------");

        System.out.println(memberRepository.read(member1.getId()));

        member1.setName("Hong");
        member1.setEmail("Hong@naver.com");

        memberRepository.update(member1);
        System.out.println(memberRepository.read(member1.getId()));

        memberRepository.getMemberMap();

    }
}