---
typora-copy-images-to: images
---



## Java에서 R을 호출하기

#### Rserve 설치

```R
install.packages('Rserve','http://www.rforge.net/')
```



#### 자바코드에서 r을 실행할 수 있도록 설정

```R
library(Rserve)
Rserve(FALSE, port=6311, args = '--RS-encoding utf8 --no-svae --slave
       --encoding utf8 --internet2')
Rserve(args = "--RS- encoding utf8")
```



#### 자바 dependency

```xml
<!-- https://mvnrepository.com/artifact/org.rosuda.REngine/REngine -->
<dependency>
    <groupId>org.rosuda.REngine</groupId>
    <artifactId>REngine</artifactId>
    <version>2.1.0</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.rosuda.REngine/Rserve -->
<dependency>
    <groupId>org.rosuda.REngine</groupId>
    <artifactId>Rserve</artifactId>
    <version>1.8.1</version>
</dependency>

```

