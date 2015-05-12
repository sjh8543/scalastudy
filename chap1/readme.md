# Chap1

## 내용 요약
scala 설치
- [scala bin](http://www.scala-lang.org/download/)
- [intellij idea(인스톨 후 scala plugin 설치)](https://www.jetbrains.com/idea/download/)
- REPL 환경에서 이것저것 해보자

scala는?
- multi-paradigm language 입니다.(oop + fp)
- jvm 기반인데다 oo 언어이기 때문에 java 개발자의 유입이 많습니다.
- oop 해도 되고 fp 해도 됩니다. 마치 cobol이 천하통일하던 시대에 c++ 이 그랬던 것 처럼요.
- fp? 이게 무엇인지 스터디 하면서 차근차근 배워봅시다.

val vs var
- val : immutable (java 라면 final, c++라면 const ...)
- var : mutable

scala 에는 primitive type 이 없다.
- numeric 도 class 입니다.
- 1.tostring()

scala 는 operator를 다음과 같이 쓸 수도 있다.
- binary operator
..* 1.+(2)
..* 1 + 2
- parameter 없는 operator 는 괄호 생략
..* 1.tostring

scala 는 operator overloading 할 수 있다.

## 문제풀이 해설
1장은 쉬우니까 알아서

## 퀴즈
[퀴즈풀이1](https://github.com/bahamoth/scalastudy/tree/master/chap1/quiz1.scala)

> 10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다.
> 1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?

[출처:project euler](http://euler.synap.co.kr/prob_detail.php?id=1)
