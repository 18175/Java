//常量名通常使用大写字母，
//也叫final变量




public class Statement {         //新建类 声明常量
static final double PI=3.14;  //声明常量PI
static int age =23;       //声明int型变量
	public static void main(String[] args) {      //主方法
	final int number;    //声明int型常量number
    number=1234;
    age=22;
	//number=1236;  //错误代码，number为常量，只能进行一次赋值
    System.out.println("常量PI的值是;"+PI);
    System.out.println("赋值后number的值是;"+number);
    System.out.println("int型变量age的值是；"+ age);
    
	}

}
