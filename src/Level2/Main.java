package Level2;

import com.sun.tools.jconsole.JConsoleContext;

public class Main {
    public static void main(String[] args) {
        MemberRepository memberRepository = new MemberRepository();
        Member member1 = new Member("Kim",18,"Kim@naver.com");
        Member member2 = new Member("Lee",28,"Lee@naver.com");
        Member member3 = new Member("Park",38,"Park@naver.com");

        System.out.println("--------생성-------");
        System.out.println(memberRepository.create(member1));
        System.out.println(memberRepository.create(member2));
        System.out.println(memberRepository.create(member3));
        System.out.println("--------생성 끝-------");
        System.out.println();

        System.out.println("--------업데이트-------");
        member1.setName("Hong");
        member1.setEmail("Hong@naver.com");
        memberRepository.update(member1.getId() , member1);
        System.out.println(member1);
        System.out.println("--------업데이트 끝-------");

        System.out.println("--------Member1 삭제-------");
        memberRepository.delete(member1.getId());

        System.out.println("--------전체 조회-------");
        System.out.println(memberRepository.listRead());
    }
}