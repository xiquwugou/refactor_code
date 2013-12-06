package foo;

public class Person {
	private String name;
	private int age;
    private int inData[] = new int[3];

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}

    public int[] getInData(){
        return this.inData;
    }


}
