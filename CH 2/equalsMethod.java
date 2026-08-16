public class equalsMethod {
    private String name;
    private int age;

    public equalsMethod(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;  // Check if the references are the same
        }

        if (obj instanceof equalsMethod) {
            equalsMethod other = (equalsMethod) obj; 
            return (age == other.age) && (name != null && name.equals(other.name));
        } else {
            return false;  
        }
    }
}

