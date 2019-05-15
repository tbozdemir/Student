/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.template;


public class StudentTester {
    public static void main(String[]args){
    StudentTemplate self=new StudentTemplate();
    StudentTemplate self1=new StudentTemplate();
    StudentTemplate self2=new StudentTemplate();
   // self.setName("Tarik");
   // System.out.println(self.getName());
    StudentTemplate[]array=new StudentTemplate[3];
    array[0]=new StudentTemplate("Tarik");
    array[1]=new StudentTemplate("Tarik2");
    array[2]=new StudentTemplate("Tarik3");
   /* array[0]=self;
    array[1]=self1;
    array[2]=self2;
    self.setName("Tarik");
    self1.setName("Tarik2");
    self2.setName("Tarik3");*/
   
    for(int i=0;i<3;i++){
        System.out.println(array[i].getName());
    }
}
}