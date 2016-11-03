package oop.lsp.teacher;

import oop.lsp.staffroles.CourseInstructor;
import oop.lsp.staffroles.SchoolStaff;

public class ScienceTeacher extends SchoolStaff implements CourseInstructor
{

	public ScienceTeacher(String newName)
	{
		super(newName);
	}

	@Override
	public void teach()
	{
		System.out.println("Taught English..");
	}

}
