### 二维数组

```java
		int[][] ary = new int[3][]; //二维数组声明
		ary = new int[][] { //二维数组初始化
			{3,2,1},
			{5,6,8},
			{5,9,7}
		};
		System.out.println(Arrays.deepToString(ary)); //输出二维数组类似toString()
		for(int i=0; i<3; i++)
			for(int j=0; j<3; j++)
				ary[i][j] = (int)(random()*100);
		System.out.println(Arrays.deepToString(ary));
```

