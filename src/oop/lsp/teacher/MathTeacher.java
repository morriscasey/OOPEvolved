package oop.lsp.teacher;

import oop.lsp.staffroles.CourseInstructor;
import oop.lsp.staffroles.SchoolStaff;

public class MathTeacher extends SchoolStaff implements CourseInstructor
{

	public MathTeacher(String newName)
	{
		super(newName);
	}

	@Override
	public void teach()
	{
		System.out.println("Taught Math..");
	}

}
