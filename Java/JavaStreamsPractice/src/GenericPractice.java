public class GenericPractice <T>{
    T genericVariable;
    public GenericPractice(T genericVariable) {
    this.genericVariable = genericVariable;
    }
    public void print() {
        System.out.println(genericVariable);
    }
}
