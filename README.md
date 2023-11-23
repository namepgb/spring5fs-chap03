[![JIHO's GitHub stats](https://github-readme-stats.vercel.app/api?username=namepgb&include_all_commits=true&theme=nord&hide_border=true&count_private=true)](https://github.com/namepgb/github-readme-stats)

## Preview
`초보 웹 개발자를 위한 스프링 5 프로그래밍 입문` 서적에서 안내된 예제 프로젝트를 생성하고 `Spring`을 학습합니다.
> 
> 이 프로젝트의 개발 환경
>
> <img src="https://img.shields.io/badge/IntelliJ IDEA:2020.3 Ultimate Edition-000000?style=for-the-badge&logo=intellijidea&logoColor=white">
> <img src="https://img.shields.io/badge/OpenJDK:17-437291?style=for-the-badge&logo=openjdk&logoColor=white">
> <img src="https://img.shields.io/badge/Gradle:8.4-02303A?style=for-the-badge&logo=gradle&logoColor=white">

> 이 프로젝트에서는 다음 내용을 포함합니다.
> * Chapter 3 스프링 DI
>   * 의존이란?
>   * DI를 통한 의존 처리
>   * DI와 의존 객체 변경의 유연함
>   * 예제 프로젝트 만들기
>     * 회원 데이터 관련 클래스
>     * 회원 가입 처리 관련 클래스
>     * 암호 변경 관련 관련 클래스
>   * 객체 조립기
>     * 객체 조립기 사용 예제
>   * 스프링 DI 설정
>     * 스프링을 이용한 객체 조립과 사용
>     * DI 방식 1: 생성자 방식
>     * DI 방식 2: Setter 메서드 방식
>     * 기본 데이터 타입 값 설정
>   * @Configuration 설정 클래스의 @Bean 설정과 싱글톤
>   * 두 개 이상의 설정 파일 사용하기
>     * @Configuration 어노테이션, Bean, @Autowired 어노테이션
>     * @Import 어노테이션

## sp5-chap03/src/main/java/chap03_a
> * `의존 주입(DI, Dependency Inject)`에 대해서 이해하고 예제 코드를 작성합니다.
> * `AnnotationConfigApplicationContext`를 사용해 Bean 객체를 생성합니다.
> * 설정 클래스는 `@Configuration` 어노테이션을 등록합니다.
> * 설정 클래스를 사용하려면 `ApplicactionContext` 컨테이너에서 초기화합니다.
> 
> 블로그 참고 문서
> * [Spring 5 입문: Chapter 03A. Spring 의존 주입(DI, Dependency Injection)](https://namepgb.tistory.com/227)

## sp5-chap03/src/main/java/chap03_b
> * `여러 개의 설정 클래스`를 사용하기 위한 예제 코드를 작성합니다.
> * 설정 클래스에서 다른 설정 클래스의 Bean을 사용하기 위해 `@Autowire` 어노테이션을 등록한 필드를 선언합니다.
> * `@Autowire`는 Spring의 `자동 주입`을 실행합니다.
> * `ApplicactionContext` 컨테이너를 초기화 할 때 필요한 설정 클래스를 모두 인자로 전달합니다. 
> 
> 블로그 참고 문서
> * [Spring 5 입문: Chapter 03B. 여러 개의 @Configuration 설정 클래스 등록하기](https://namepgb.tistory.com/228)

## sp5-chap03/src/main/java/chap03_c
> * 설정 클래스에서 `@Import` 어노테이션을 사용해 다른 설정 클래스를 참조합니다.
> * `ApplicactionContext` 컨테이너를 초기화 할 때 `@Import`으로 지정된 설정 클래스는 인자로 전달하지 않습니다.
> 
> 블로그 참고 문서
> * [Spring 5 입문: Chapter 03B. 여러 개의 @Configuration 설정 클래스 등록하기](https://namepgb.tistory.com/228)
