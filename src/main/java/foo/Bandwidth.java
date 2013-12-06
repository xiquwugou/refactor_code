package foo;

import java.util.ArrayList;
import java.util.List;

public class Bandwidth  {

	List<Integer> ages = new ArrayList<Integer>();
	public void add(Integer age) {
		ages.add(age);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ages.toString();
	}

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {

        }
    }

}
