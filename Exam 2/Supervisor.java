public class Supervisor extends Staff {
  private int numTasks, MaxNumTasks;
  private String taskList[];
  
  public Supervisor(String name, String address){
    super(name, address);
    this.MaxNumTasks = 5;
    this.taskList = new String[this.MaxNumTasks];
  }
  
  public boolean addTask(String taskName){
    if(taskExists(taskName) == true)
      return false;
    
    // Determine the next "free slot" to load the task into.
    if(getFreeSlot() != -1)
      this.taskList[getFreeSlot()] = taskName;
    else
      return false;
      
    return true;
  }
  
  public boolean removeTask(String taskName){
    if(taskExists(taskName) == false)
      return false;
    
    taskList[getTaskIndex(taskName)] = "";
    return true;
  }
  
  private int getFreeSlot(){
    for(int i = 0; i < this.MaxNumTasks; i++)
      if(this.taskList[i] == null || this.taskList[i].equals(""))
        return i;
    return -1;
  }
  
  private int getTaskIndex(String taskName){
    for(int i = 0; i < this.MaxNumTasks; i++)
      if(this.taskList[i].equals(taskName))
        return i;
    return -1;
  }
  
  private boolean taskExists(String name){
    for(int i = 0; i < this.MaxNumTasks; i++)
      if(this.taskList[i] != null && this.taskList[i].equals(name))
        return true;
    
    return false;
  }
  
  @Override
  public String getStaffInfo(){
    return String.format("%s: %s lives at the address %s", "Superviser", this.name, this.address);
  }
  
}
