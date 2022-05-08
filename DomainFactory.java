package library.domain;

public class DomainFactory {

	public Object get(String fqcn) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		Class clazz = loader.loadClass(fqcn);
		Object result = clazz.newInstance();

		return result;
	}
}
