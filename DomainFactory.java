package library.domain;

public class DomainFactory {

	public Object get(String fqcn) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class clazz = Class.forName(fqcn);
		Object result = clazz.newInstance();

		return result;
	}
}
