package oop.lsp.teacher;

import oop.lsp.staffroles.SchoolStaff;

/*
 * Based on design substitute teacher is a staff member with School staff roles
 * but not able to teach new content
 */
public class SubstitueTeacher extends SchoolStaff
{

	public SubstitueTeacher(String newName)
	{
		super(newName);
	}

}
