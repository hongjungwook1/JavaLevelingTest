package Level2_1;

public class Main {
    public static void main(String[] args) {

        MemberRepository memberRepository = new MemberRepository();
        Member member1 = new Member( "Kim",30,"Kim@naver.com");
        Member member2 = new Member( "Park",20,"Park@naver.com");
        Member member3 = new Member( "Lee",10,"Lee@naver.com");

        System.out.println(memberRepository.create(member1));
        System.out.println(memberRepository.create(member2));
        System.out.println(memberRepository.create(member3));

        //member1.setDeleted(true);
        member1.setName("Hong");
        member1.setEmail("Hong@naver.com");

        System.out.println(memberRepository.read(member1.getId()));
        System.out.println();
        System.out.println(memberRepository.read());
    }
}