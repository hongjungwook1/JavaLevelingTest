레벨 1 과제 : Collection 과 Class 상속과 Interface 활용
	다양한 클래스들을 직접 만들어서 Array, List, Set, Map 에 주입하고 삭제 등 다양한 메서드 호출을 해본다.

- Lombok 은 사용하지 않는다. 

- Human 클래스 만들기 (추가 요구사항)
  - 2개 필드 : `id`, `name` + 생성자
- Member 클래스 만들기 ← Human 을 상속받는다
  - 2개 필드 : `age`, `email` + 생성자
- IRepository 인터페이스와 MemberRepository 클래스 만들기
  - 4개 메서드 : `create`, `read`, `update`, `delete`
 
- MemberRepository 내 Map<Integer, Member> 필드 추가 및 앞선 메서드 4개 모두 구현
  - 또한, idGenerator 메서드를 만들어 추가될때마다 Member ID 가 하나씩 늘어나도록
- DemoApplication - main 메서드에서 MemberRepository 의 4개 메서드 모두 호출
  - Member 객체 3개 생성 : `create`
  - 1개 삭제 : `delete`
  - 1개 업데이트 : `update`
  - 2개 Member 객체 각각 개별 조회 : `read`
    - (추가 요구사항) `read` 결과인 Member 객체를 `System.out.println` 으로 출력한다.
    - (추가 요구사항) Lombok 없이 `id`, `name`, `age`, `email` 모두를 출력하라
- MemberRepository 내 추가 메서드 구현 : Map 에 저장된 모든 Member 전체 조회
