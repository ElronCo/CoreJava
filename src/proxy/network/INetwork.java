package proxy.network;

public interface INetwork {

	void connect(Session session, String dest) throws Exception;

}
