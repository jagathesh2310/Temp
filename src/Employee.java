import java.util.Objects;

abstract public class Employee {
    abstract public int temp();
    static class Temp {
        int t = 0;
    }

    String name;
    int id;


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return name == employee.name && id == employee.id;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
