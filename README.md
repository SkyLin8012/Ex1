# Java Anonymous Class、Lambda 與 Method Reference 練習

## 專案簡介

本專案示範 Java 中常見的函式式程式設計（Functional Programming）語法，包括：

* Anonymous Class（匿名類別）
* Functional Interface（功能性介面）
* Lambda Expression（Lambda 運算式）
* Method Reference（方法參照）
* Interface 實作技巧

透過書籍價格折扣範例，展示不同寫法之間的差異與應用情境。
---
# 會員登入系統
## 會員登入系統
### 會員登入系統
#### 會員登入系統
##### 會員登入系統hh

jghsadjgjgjhgjhgjgjhgjhgjhgjhggg<br>
jgbjhggjgjgj
<br>
jhgjhgjgjhgjg<br>

[google](http://www.google.com)

[yahoo](http://tw.yahoo.com)

    [^1]![骰子](img/06.png)
<img src="img/06.png" alt="骰子" width="50" height="50">

[![Start coding with JAVA in 10 minutes!](https://youtu.be/23HFxAPyJ9U?si=JwJMHS82JEpwsvfC)](https://youtu.be/23HFxAPyJ9U)
---

## 專案結構

```text
.
├── Ex1.java
├── Ex2.java
├── Ex3.java
├── Ex4.java
├── Ex5.java
└── Ex6.java
```

---

## 功能說明

### Ex1.java

使用匿名類別（Anonymous Class）實作介面。

功能：

* 建立 `BookStyle`
* 計算書籍 95 折價格
* 顯示書名與價格

重點：

```java
BookStyle b1 = new BookStyle() {
    public double BookPrice(double price){
        return price * 0.95;
    }
};
```

---

### Ex2.java

建立多個匿名類別物件。

功能：

* 95 折書籍
* 6 折書籍
* 計算折扣後價格

重點：

```java
BookStyle2 b1 = new BookStyle2(){...};
BookStyle2 b2 = new BookStyle2(){...};
```

---

### Ex3.java

直接建立匿名物件並立即使用。

功能：

* 不建立變數
* 直接呼叫方法
* 計算總價

重點：

```java
new BookStyle3(){
    public double BookPrice(double price){
        return price * 0.95;
    }
}.BookPrice(1000);
```

---

### Ex4.java

匿名類別繼承一般類別。

功能：

* 覆寫（Override）父類別方法
* 增加額外方法

重點：

```java
var o1 = new order(){
    public void show(){
        System.out.println("Hello Java");
    }

    public void abc(){
        System.out.println("abc");
    }
};
```

---

### Ex5.java

Lambda Expression 範例。

功能：

* 使用 Lambda 取代匿名類別
* 展示不同 Lambda 寫法
* 條件式折扣計算

範例：

```java
BookStyle4 b3 =
(price,name) ->
"書名:"+name+"\t價格:"+price*0.7;
```

進階範例：

```java
BookStyle4 b5 = (price,name)->{
    if(price > 2000)
        return "...";
    return "...";
};
```

---

### Ex6.java

Method Reference（方法參照）範例。

功能：

* 使用靜態方法作為介面實作
* 展示 Method Reference 語法
* 多種折扣策略

重點：

```java
b1[0] = C1::BookMsg1;
b1[1] = C1::BookMsg2;
b1[2] = C1::BookMsg3;
```

等同於：

```java
b1[0] = (price,name) ->
C1.BookMsg1(price,name);
```

---

## Java 技術重點

### 1. Anonymous Class

匿名類別是一種不需建立獨立類別檔案即可快速實作介面的方式。

```java
new InterfaceName(){
    // implementation
}
```

---

### 2. Functional Interface

功能性介面只允許一個抽象方法。

例如：

```java
interface BookStyle4{
    String BookMsg(double price,String name);
}
```

因此可以搭配 Lambda 使用。

---

### 3. Lambda Expression

簡化匿名類別語法。

傳統寫法：

```java
new BookStyle4(){
    public String BookMsg(double p,String n){
        return "...";
    }
}
```

Lambda：

```java
(p,n) -> "..."
```

---

### 4. Method Reference

當 Lambda 只是呼叫現有方法時，可改用 Method Reference。

Lambda：

```java
(price,name) ->
C1.BookMsg1(price,name)
```

Method Reference：

```java
C1::BookMsg1
```

---

## 執行環境

* Java 11+
* JDK 17（推薦）
* IntelliJ IDEA / Eclipse / VS Code

---

## 編譯與執行

編譯：

```bash
javac Ex1.java
```

執行：

```bash
java Ex1
```

其餘範例依此類推：

```bash
javac Ex5.java
java Ex5
```

---

## 學習目標

完成本專案後可理解：

* Java Interface 基礎
* Anonymous Class
* Functional Interface
* Lambda Expression
* Method Reference
* Java 函式式程式設計入門

---

## 作者

Java 練習專案

內容涵蓋：

* Anonymous Class
* Lambda Expression
* Method Reference
* Functional Programming

