package oop;

public class Simulator {
    float t = 0.f;
    float dt = 0.1f;
    float observationTime = 10.f;

    Thread theared;
    Renderer renderer = Renderer.getInstance();
  
    private static Simulator instance = null;
  
    private Simulator() {
        theared = new Thread(new Runnable(){
        
            @Override
            public void run() {
                while(true){
                    try{
                        Thread.sleep(100);
                    } catch (InterruptedException e){}

                    renderer.repaint(dt);
                    //그냥 this.는 runnable의 this가 됨. -> 시뮬레이터의 this를 찾아야하니까 찾아야하는 녀석 아에 final넣어줘야함
                }
            }
        });//괄호안은 실행할 클래스
    }

    
  
    public static Simulator getInstance() {
      if (Simulator.instance != null) {
        return Simulator.instance;
      } else {
        Simulator.instance = new Simulator();
        return Simulator.instance;
      }
    }
  
    public void run() {
      this.theared.run();
    }
  }