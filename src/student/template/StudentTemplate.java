/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.template;

/**
 *
 * @author tarik
 */
public class StudentTemplate {
private String _name;
private int _number;
public StudentTemplate(){
    
}
public StudentTemplate(String name){
    _name=name;
}
public void setName(String name){
    _name=name;
    
}
public String getName(){
    return _name;
}

    /**
     * @return the number
     */
    public int getNumber() {
        return _number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        _number = number;
    }

    
}
