public class ClockDriver {
    public static void main(String[] args) {
        ClockDisplaySeconds clock1 = new ClockDisplaySeconds();
        System.out.println("Empty Constructor Test: " + clock1.getTime());  

      
        ClockDisplaySeconds clock2 = new ClockDisplaySeconds(2, 45, 30);
        System.out.println("Constructor with Time Test: " + clock2.getTime());  

    
        clock2.setTime(5, 15, 45);
        System.out.println("Set Time Test: " + clock2.getTime());  

       
        ClockDisplaySeconds tickTest1 = new ClockDisplaySeconds(3, 32, 59);
        System.out.println("Tick Test 1 Before Tick: " + tickTest1.getTime());  
        tickTest1.timeTick();
        System.out.println("Tick Test 1 After Tick: " + tickTest1.getTime());  
        
        ClockDisplaySeconds tickTest2 = new ClockDisplaySeconds(1, 0, 59);
        System.out.println("Tick Test 2 Before Tick: " + tickTest2.getTime());  
        tickTest2.timeTick();
        System.out.println("Tick Test 2 After Tick: " + tickTest2.getTime());  

        
        ClockDisplaySeconds tickTest3 = new ClockDisplaySeconds(1, 59, 59);
        System.out.println("Tick Test 3 Before Tick: " + tickTest3.getTime());  
        tickTest3.timeTick();
        System.out.println("Tick Test 3 After Tick: " + tickTest3.getTime());  

        
        ClockDisplaySeconds tickTest4 = new ClockDisplaySeconds(23, 59, 59);
        System.out.println("Tick Test 4 Before Tick: " + tickTest4.getTime()); 
        tickTest4.timeTick();
        System.out.println("Tick Test 4 After Tick: " + tickTest4.getTime()); 
    }
}
