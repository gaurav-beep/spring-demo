package test;

public class Student {
private String name;
private int age;
Student(){}
Student(String name,int age){
	this.name=name;
	this.age=age;
}
public String getName() {
	return this.name;
}
public void setName(String name) {
	this.name=name;
}
public int getAge() {
	return this.age;
}
public void setAge(int age) {
	this.age=age;
}
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + "]";
}

}
