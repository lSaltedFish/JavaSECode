package study._interface.apply;

public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();

        // 1.创建接口实现类对象
        Printer printer = new Printer();
        computer.transferData(printer);

        // 2.创建接口实现类的匿名对象
        computer.transferData(new Camera());

        // 3.创建接口匿名实现类的对象
        USB usb = new USB() {
            @Override
            public void start() {
                System.out.println("U盘开始工作....");
            }

            @Override
            public void stop() {
                System.out.println("U盘结束工作");
            }
        };
        computer.transferData(usb);

        // 4.创建接口匿名实现类的匿名对象
        computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("扫描仪开始工作....");
            }

            @Override
            public void stop() {
                System.out.println("扫描仪结束工作");
            }
        });
    }
}

class Computer{
    public void transferData(USB usb){ //USB usb = new Printer();
        System.out.println("设备连接成功....");
        usb.start();
        System.out.println("数据传输的细节操作....");
        usb.stop();
    }
}

interface USB{
    void start();
    void stop();
}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机开始工作....");
    }

    @Override
    public void stop() {
        System.out.println("打印机完成工作");
    }
}

class  Camera implements USB{
    @Override
    public void start() {
        System.out.println("照相机开始工作....");
    }

    @Override
    public void stop() {
        System.out.println("照相机结束工作");
    }
}