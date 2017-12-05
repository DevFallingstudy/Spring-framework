# Java Project
이 문서에서는 Spring framework를 통해 Java project를 만드는 과정을 소개한다.

## 기본 설정
Spring을 이용하여 자바 프로젝트를 작성하기 위해서는 externel jar 파일 몇가지를 추가해줄 필요가 있다.  

- spring.jar
- commons-logging.jar

파일의 버전은 Spring framework 2.5.6에서 가져온 버전을 기반으로 한다.

## 목표
Spring based Java project를 활용하여 가장 먼저 달성할 목표는 Loose-coupling이다. 이는 함수 및 클래스 간의 상관 관계를 줄이고 객체별 모듈화를 지향하는 방법이다.

## 개발 과정
- Define Interface and abstact class (No dependencies on Spring)
- Make implementations of the interfaces (No dependencies on Spring)
- 어떤 오브젝트를 생성할지에 대한 정보를 Bean definition file에 정의 (실제 코드에서 객체를 생성하지 않음)
- Bean definition file을 로딩하여 실제 instance를 생성