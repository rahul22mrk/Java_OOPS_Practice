
class Employee {
    private int empNo;
   private String empName;
   private int empSal;
   public void setData(int empNo,String empName,int empSal)
   {
       this.empName=empName;
       this.empNo=empNo;
       this.empSal=empSal;
   }
   public int getEmpNo()
   {
       return empNo;
   }
   public String getEmpName(){
       return empName;
   }
   public int getEmpSal()
   {
       return empSal;
   }
}
