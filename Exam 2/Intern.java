public class Intern extends Staff {
  private int numTasks, MaxNumTasks, hourList[];
  private String taskList[];
  
  public Intern(String name, String address){
    super(name, address);
    this.MaxNumTasks = 10;
    this.hourList = new int[this.MaxNumTasks];
    this.taskList = new String[this.MaxNumTasks];
  }
  
  
  public void addTaskHours(String task, int hours){
    if(task == null || hours <= 0)
      throw new IllegalArgumentException("Task cannot be null, and hours must be > 0.");
    
    if(this.getTaskCount() == this.MaxNumTasks)
      throw new IllegalArgumentException("Maximum number of tasks reached. Remove some old tasks before adding new ones.");
    
    int freeSlotIndex = 0;
    for(int i = 0; i < this.MaxNumTasks; i++)
      if(this.hourList[i] == 0)
        freeSlotIndex = i;
    
    taskList[freeSlotIndex] = task;
    hourList[freeSlotIndex] = hours;
  }
  
  
  @Override
  public String getStaffInfo(){
    return String.format("%s: %s lives at the address %s", "Intern", this.name, this.address);
  }
  
  public void printHours(){
    for(int i = 0; i < this.MaxNumTasks; i++){
      if(hourList[i] != 0){
        System.out.printf("Task %s: %d hours.%n", taskList[i], hourList[i]);
      }
    }
  }
  
  public int getAverageHour(){
    int totalHours = 0;
    // We won't compute the average over MaxNumTasks, but rather over the
    // actual amount of tasks assigned (for cases where getAverageHour is
    // called but less than 10 total tasks have been assigned)
    int hoursCount = 0;
    
    for(int i = 0; i < this.MaxNumTasks; i++){
      if(hourList[i] > 0)
        hoursCount++;
      
      totalHours += hourList[i];
    }
    
    return totalHours / hoursCount;
  
  }
  
  private int getTaskCount(){
    int taskCount = 0;
    
    for(int i = 0; i < MaxNumTasks; i++)
      if(hourList[i] > 0)
        taskCount++;
    
    return taskCount;
  }
}
