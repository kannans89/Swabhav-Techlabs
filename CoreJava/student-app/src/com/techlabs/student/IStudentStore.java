package com.techlabs.student;

import java.util.*;

public interface IStudentStore {
	public void init();

	public void add(Student student);

	public List<Student> get();

	public Student search(String name);

	public String delete(long id);

	public void export();

}
