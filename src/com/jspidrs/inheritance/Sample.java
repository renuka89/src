package com.jspidrs.inheritance;

public interface Sample {
int i=3400;
void m();
void n();
}


interface Sample1 extends Sample  {
void xy();
}
interface Sample2 extends Sample1,Sample  {
void y();
}

