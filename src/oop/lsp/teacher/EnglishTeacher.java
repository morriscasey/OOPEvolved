package oop.lsp.teacher;

import oop.lsp.staffroles.CourseInstructor;
import oop.lsp.staffroles.SchoolStaff;

public class EnglishTeacher extends SchoolStaff implements CourseInstructor
{

	public EnglishTeacher(String newName)
	{
		super(newName);
	}

	@Override
	public void teach()
	{
		System.out.println("Taught English..");
		
	}

}
