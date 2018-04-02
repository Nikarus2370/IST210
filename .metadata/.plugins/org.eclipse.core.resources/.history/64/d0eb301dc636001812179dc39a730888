
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			someMethod();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}

	public static void someMethod() throws Exception{
		try
		{
			someMethod2();
		}
		catch(Exception exception){
			throw new Exception("Exception in someMethod", exception);
		}
	}
	public static void someMethod2() throws Exception{
		throw new Exception("Exception in someMethod2");
	}
}



/*
 java.lang.Exception: Exception in someMethod
	at Main.someMethod(Main.java:23)
	at Main.main(Main.java:9)
Caused by: java.lang.Exception: Exception in someMethod2
	at Main.someMethod2(Main.java:27)
	at Main.someMethod(Main.java:20)
	... 1 more
*/
 */