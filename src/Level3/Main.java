package Level3;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        MemberRepository memberRepository = new MemberRepository();

//        Member member1 = new Member("Kim",18,"Kim@naver.com");
//        Member member2 = new Member("Lee",28,"Lee@naver.com");
//        Member member3 = new Member("Park",38,"Park@naver.com");
//
//        // 생성
//        memberRepository.create(member1);
//        memberRepository.create(member2);
//        memberRepository.create(member3);
//
//        // 개별 조회
//        System.out.println(memberRepository.read(member1.getId()));
//
//        // member1 age , email 업데이트
//        member1.setAge(10);
//        member1.setEmail("Hong@naver.com");
//        memberRepository.update(member1.getId(), member1);
//
//        // 삭제
//        memberRepository.delete(member1.getId());
//
//        // 전체 조회
//        System.out.println(memberRepository.result());

        VendorRepository vendorRepository = new VendorRepository();
        Vendor vendor1 = new Vendor("김",18,"김@네이버","서울","먹기" );
        Vendor vendor2 = new Vendor("이",28,"이@네이버","경기","자기" );
        Vendor vendor3 = new Vendor("박",38,"박@네이버","부산","입기" );

        //생성
        vendorRepository.create(vendor1);
        vendorRepository.create(vendor2);
        vendorRepository.create(vendor3);

        // 개별 조회
        System.out.println(vendorRepository.read(vendor1.getId()));

        // vendor1 age , email 업데이트
        vendor1.setEmail("change@naver.com");
        vendor1.setCategory("바꾸기");
        vendorRepository.update(vendor1.getId(), vendor1);

        // 삭제
        vendorRepository.delete(vendor1.getId());

        // 업데이트 및 삭제 후 개별 조회
        System.out.println(vendorRepository.read(vendor1.getId()));

        List<Vendor> vendorResult = vendorRepository.read();
        List<VendorResponseDto> result = vendorResult.stream()
                        .map(prvVendor -> new VendorResponseDto(
                                prvVendor.getId(),
                                prvVendor.getName(),
                                prvVendor.getAge(),
                                prvVendor.getEmail(),
                                prvVendor.getAddress(),
                                prvVendor.getCategory()))
                        .toList();

        System.out.println(result);

    }
}
