/*package management;

import javax.rmi.CORBA.Util;

//Java原生对象
public class Hello {

 @Task(queue = "testQueue")
 public void test(String str) {
     Util.report(str);
 }
}

//注册原生Java对象到任务容器中
Hello hello = TaskSchedule.registerASyncClass(Hello.class);

//此处调用test方法已经变成异步并发调用了
hello.test("hello world");*/
