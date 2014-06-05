package proxy.network.interceptors;

import java.util.Map;

import proxy.network.Session;

public interface INetworkInterceptor {

	void intercept(Session session, String dest, Map<Object, Object> context) throws Exception;

	int order();

}
