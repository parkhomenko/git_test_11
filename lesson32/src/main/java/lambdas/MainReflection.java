package lambdas;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MainReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Class clazz = Class.forName("lambdas.Addition");
        Operation obj = (Operation) clazz.newInstance();
        int result = obj.proceed(5, 3);

        //Method method = new Method(int);

        //Method[] methods = clazz.getMethods();
        //Method method = clazz.getMethod("proceed");
        //Object result = method.invoke(obj);



        System.out.println("");
    }
}
