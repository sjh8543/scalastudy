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
* binary operator
	* 1.+(2)
	* 1 + 2
- parameter 없는 operator 는 괄호 생략
	* 1.tostring

scala 는 operator overloading 할 수 있다.

## 문제풀이 해설

1. 
```scala
scala> 3.
%   +   >    >>>            isInstanceOf   toDouble   toLong     unary_+   |
&   -   >=   ^              toByte         toFloat    toShort    unary_-
*   /   >>   asInstanceOf   toChar         toInt      toString   unary_~
```

2.
```scala
scala> import scala.math._
import scala.math._

scala> sqrt(3)
res3: Double = 1.7320508075688772

scala> pow(res3, 2)
res4: Double = 2.9999999999999996
```

3.
```scala
scala> res4 = 1
<console>:12: error: reassignment to val
       res4 = 1
            ^
그러므로 val
```

4.
```scala
scala> "crazy" * 3
res13: String = crazycrazycrazy
```
[http://www.scala-lang.org/api/current/#scala.collection.immutable.StringOps](http://www.scala-lang.org/api/current/#scala.collection.immutable.StringOps)

5.
```scala
scala> 10 max 2
res5: Int = 10
```
[http://www.scala-lang.org/api/2.11.6/#scala.runtime.ScalaNumberProxy](http://www.scala-lang.org/api/2.11.6/#scala.runtime.ScalaNumberProxy)

6.
```scala
scala> BigInt(1)
res2: scala.math.BigInt = 1

scala> res2 << 1024
res3: scala.math.BigInt = 179769313486231590772930519078902473361797697894230657273430081157732675805500963132708477322407536021120113879871393357658789768814416622492847430639474124377767893424865485276302219601246094119453082952085005768838150682342462881473913110540827237163350510684586298239947245938479716304835356329624224137216
```

7.
```scala
scala> import scala.math.BigInt.probablePrime
import scala.math.BigInt.probablePrime

scala> import scala.util.Random
import scala.util.Random

scala> probablePrime(100, Random)
res2: scala.math.BigInt = 858252260090249617125837094573
```

8.
```scala
scala> scala.BigInt(100, scala.util.Random)
res13: scala.math.BigInt = 666264801719968691733421135554

scala> res13.toString(36)
res14: String = 1slfothtfzyf3r1a7c1u
```

9.
```scala
scala> "Hello Scala!!"
res20: String = Hello Scala!!

scala> res20.head
res21: Char = H

scala> res20.last
res22: Char = !
```

10.
```scala
scala> "Hello Scala World~~!!!"
res37: String = Hello Scala World~~!!!

scala> res37.substring(0,7)
res38: String = Hello S

#~7번째 문자열 return
scala> res37.take(7)
res39: String = Hello S

#~7번째 까지의 문자열 버린 나머지 return
scala> res37.drop(7)
res40: String = cala World~~!!!

#오른쪽(문자열 끝)에서부터 ~7번째까지의 문자열 return
scala> res37.takeRight(7)
res41: String = ld~~!!!

#오른쪽(문자열 끝)에서부터 ~7번째까지의 문자열 버린 나머지 return
scala> res37.dropRight(7)
res42: String = Hello Scala Wor
```
take, drop 의 장점
	1. index bound check의 책임이 없다.
	2. String의 끝을 계산할 필요가 없다.

take, drop 의 단점
	1. 글쎄? 굳이 꼽자면 ~~Right 따위 명명법은 scala 에만 존재하므로 사용자 접근에 방해될 수 있다.
```scala
#index bound check 의 책임이 사용자에게 있다.
scala> res37.substring(100)
java.lang.StringIndexOutOfBoundsException: String index out of range: -78
  at java.lang.String.substring(String.java:1918)
  ... 35 elided

#index bound를 넘어가도 정상 return
scala> res37.drop(100)
res44: String = ""

scala> res37.take(100)
res45: String = Hello Scala World~~!!!
```


## 퀴즈
[퀴즈풀이1](https://github.com/bahamoth/scalastudy/tree/master/chap1/quiz1.scala)

> 10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고, 이것을 모두 더하면 23입니다.
> 1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?

[출처:project euler](http://euler.synap.co.kr/prob_detail.php?id=1)
