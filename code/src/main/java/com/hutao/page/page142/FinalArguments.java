package com.hutao.page.page142;

class Gizmo{
    int i;
    public void spin(){}
}
public class FinalArguments {
    void with(final Gizmo g){
//!        g = new Gizmo();//Illegal -- g is final
        g.i = 2;
        System.out.println(g.i);
    }

    public static void main(String[] args) {
        FinalArguments finalArgument = new FinalArguments();
        finalArgument.with(new Gizmo());
    }
}
