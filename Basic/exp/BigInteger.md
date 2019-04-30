### 大数值类

导入包

java.math.BigInterger大数值整数

java.math.BigDecimal大数值浮点数

大数值类可以处理包含任意长度数字序列的数值。

使用**静态**的 valueOf()方法可以将普通的数值转换成大数值：

```java
BigInteger a = BigInteger.valueOf(100);
```

常用运算方法（+，-，*，/，%）

```java
BigInteger add(BigInteger other)
BigInteger subtract(BigInteger other)
BigInteger multiply(BigInteger other)
BigInteger divide(BigInteger other)
BigInteger mod(BigInteger other)
```

返回这个大整数和另一个大整数other的和、差、积、商、余数。

```
int compareTo(BigInteger other)
```

相等返回0， this大于other返回正数，否则返回负数。