import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(10,20,20,10,30,40,50,50);
        System.out.println(l1);

        Set<Integer> s1=new HashSet<>();
        l1.stream().filter(a->!s1.add(a)).collect(Collectors.toSet()).forEach(x-> System.out.print(x+" "));
    }
}
