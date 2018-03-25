abstract public class Staff implements StaffInfo {
  String name;
  String address;
  
  public Staff(String name, String address){
    this.name = name;
    this.address = address;
  }
  
  public void setName(String newName){
    this.name = newName;
  }
  
  public void setAddress(String newAddress){
    this.address = newAddress;
  }

  public String getName(){
    return this.name;
  }
  
  public String getAddress(){
    return this.address;
  }
  
  public String getStaffInfo(){
    return String.format("%s: %s lives at the address %s", "Staff", this.name, this.address);
  }
  
  public String toString(){
    return this.getStaffInfo();
  }

}
