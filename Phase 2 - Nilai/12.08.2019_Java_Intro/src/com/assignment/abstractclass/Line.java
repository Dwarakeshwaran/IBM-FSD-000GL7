package com.assignment.abstractclass;

public class Line extends Computation{

	@Override
	public boolean isGreater(Object obj1, Object obj2) {
		Line l1 = (Line)obj1;
		Line l2 = (Line)obj2;
		
		return l1.calculateLength()>l2.calculateLength();
	}

	@Override
	public boolean isLesser(Object obj1, Object obj2) {
		
		Line l1 = (Line)obj1;
		Line l2 = (Line)obj2;
		
		return l1.calculateLength()<l2.calculateLength();
	}
	
	@Override
	public boolean isEqual(Object obj1, Object obj2) {
		Line l1 = (Line)obj1;
		Line l2 = (Line)obj2;
		
		return l1.calculateLength()==l2.calculateLength();
	}
	public int start;
	public int end;
	public Line(int start, int end)
	{
		this.start = start;
		this.end = end;
	}
	
	public int calculateLength()
	{
		return end-start;
	}

	

}
