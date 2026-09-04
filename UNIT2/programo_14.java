class vivaanbasepolicy{

    final void verifyIndentity(){
        System.out.println("student vivaan is verified via biomatrics");
    }
}


class Advancestudent extends vivaanbasepolicy{
    void java(){
        System.out.println("hello java");
    }
}

 class program14{
    public static void main(String[]args){
        Advancestudent obj=new Advancestudent();
        obj.verifyIndentity();
        obj.java();
    }
}

    

