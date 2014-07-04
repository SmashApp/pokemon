public abstract class Model {
	private int id;
	private Map<String, String> attributes;
	
	Model(int _id, Map<String, String> _attributes) {
		id = _id;
		attributes = _attributes;
	}
	
	public int getID() { return id; }
	
	public String get( String key ) { return attributes.get(key); }
	
	public null set( String key, String value ) { attributes.put(key, value); }
	
	public null getInt( String key ) { return Integer.parseInt( get(key) ); }
}