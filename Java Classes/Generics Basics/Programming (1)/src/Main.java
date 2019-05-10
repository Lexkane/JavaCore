class Pair <K,V> {

  private K key;
  private V value;

  public Pair(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getFirst()	{ return this.key; }
  public V getSecond() { return this.value; }

  @Override
  public int hashCode(Pair p) {
    return super.hashCode();
  }

  @Override
  public boolean of(Object obj) {
    this.key = key;
    this.value = value;
  }

  @Override
  public boolean equals(Pair p1, Pair p2) {
    if ((p1!=null) && (p2!=null)){
    if (p1.key==p2.key && p1.value==p2.value)
            return true;
    else return false;
    }
    else return false;
  }
}