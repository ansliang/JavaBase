### 一维数组

###### 1.数组的遍历（for each循环）

```java
//打印数组a的每一个元素，一个元素占一行
for(int element : a)
	System.out.println(element);
```
###### 2.数组的初始化
```java
	/**
	out: 2 3 5 7 11 13 
		[17, 19, 23, 29, 31, 37]
	*/
	int[] smallPrimes = {2, 3, 5, 7, 11, 13};
	for(int element : smallPrimes)
		System.out.print(element + " ");
	System.out.println();
	smallPrimes = new int[] {17, 19, 23, 29, 31, 37};  //数组重新初始化
	System.out.println(Arrays.toString(smallPrimes));  //打印成数组样式
```
###### 3.数组拷贝
①使用“=”符号，两个数组变量将引用同一个数组
②使用Arrays.copyOf()方法，将一个数组的所有值拷贝到一个新的数组
```java
	//第二个参数是新数组的长度，若大于旧数组的长度，多余元素赋0或false，若小于则取前面的元素
	int[] a = Arrays.copyOf(b, b.length);
```
###### 4.java.util.Arrays常用方法

 - static String toString( type[] a) //见上例
 - static type copyOf( type[] a, int length) //见上例
 - static type copyOfRange( type[] a, int start, int end) //同上，从start下标开始，end结束（不包括这一个）
 - static void sort( type[] a) //快速排序算法排序
 - static int binarySearch( type[] a, int start, int end, type v) //采用二分搜索算法查找值v，成功返回下标，失败返回负数
 - static void fill( type[] a, type v) //将数组所有元素值设置为v
 - static boolean equals( type[] a, type[] b) //比较两个数组是否相等