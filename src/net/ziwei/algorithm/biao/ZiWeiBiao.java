package net.ziwei.algorithm.biao;

public class ZiWeiBiao {
	public static int[][] ziWeiBiao = {{1,4,11,6,9},
		                               {2,1,4,11,6},
		                               {2,2,1,4,11},
		                               {3,5,2,1,4},
		                               {3,2,0,2,1},
		                               {4,3,5,7,2},
		                               {4,6,2,0,10},
		                               {5,3,3,5,7},
		                               {5,4,1,2,1},
		                               {6,7,6,3,5},
		                               {6,4,3,8,2},
		                               {7,5,4,1,3},
		                               {7,8,2,6,11},
		                               {8,5,7,3,8},
		                               {8,6,4,4,1},
		                               {9,9,5,9,6},
		                               {9,6,3,2,3},
		                               {10,7,8,7,4},
		                               {10,10,5,4,0},
		                               {11,7,6,5,9},
		                               {11,8,4,10,2},
		                               {0,11,9,3,7},
		                               {0,8,6,8,4},
		                               {1,9,7,5,5},
		                               {1,0,5,6,1},
		                               {2,9,10,11,10},
		                               {2,10,7,4,3},
		                               {3,1,8,9,8},
		                               {3,10,6,6,5},
		                               {4,11,11,7,6}};
	/*根据五行局数和出生日定紫微星宫位，横轴五行局，纵轴出生日*/
	public static int getZiWeiByWuXingAndDay(int wuxingnum, int day){
		return ziWeiBiao[day-1][wuxingnum-2];
	}
}