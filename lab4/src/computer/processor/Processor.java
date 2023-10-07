package computer.processor;

import computer.memory.Memory;
import computer.memory.ResultMemory;

import java.util.Arrays;
import java.util.Scanner;

public class Processor {
    private Scanner sc = new Scanner(System.in);
    private BrandProcessor brand;
    private Memory memory;
    public Processor(BrandProcessor brand, Memory memory){
        this.brand = brand;
        this.memory = memory;
    }

    public BrandProcessor getBrand() {
        return brand;
    }

    public void setBrand(BrandProcessor brand) {
        this.brand = brand;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
    public void run() {
        int i = 0;
        while(true) {
            i++;
            Commands command;
            String line = sc.nextLine();
            String[] line_arr = line.split(" ");
            try {
                command = Commands.valueOf(line_arr[0]);
            }catch (IllegalArgumentException ex){
                System.out.println("Нет такой команды: строка i");
                break;
            }
            byte index1;
            if(command==Commands.OFF){
                break;
            }else if(command==Commands.OUT){
                try{
                    index1 = new Byte(line_arr[1]);
                    System.out.println(getMemory().get(index1));
                }catch (Exception ex){
                    System.out.println("Error: строка"+i);
                    break;
                }
                continue;
            }else if(command==Commands.DEL){
                try{
                    index1 = new Byte(line_arr[1]);
                    getMemory().delete(index1);
                }catch (Exception ex){
                    System.out.println("Error: строка"+i);
                    break;
                }
                continue;
            }
            byte index2;
            byte index3 = 0;
            int i1 = 0;
            int i2 = 0;
            try {
                if (line_arr.length >= 4) {
                    index1 = new Byte(line_arr[1]);
                    index2 = new Byte(line_arr[2]);
                    i1 = getMemory().get(index1);
                    i2 = getMemory().get(index2);
                }
            }catch (Exception ex){
                System.out.println("Error: строка "+i);
                break;
            }
            switch (command) {
                case ADD:
                    try{
                        index3 = new Byte(line_arr[3]);
                    }catch (Exception ex){
                        System.out.println("Error: строка "+i);
                        break;
                    }
                    if (getMemory().put(i1 + i2, index3) == ResultMemory.Error) {
                        System.out.println("Не удалось сохранить число: строка " + i);
                    }
                    break;
                case DIV:
                    try{
                        index3 = new Byte(line_arr[3]);
                    }catch (Exception ex){
                        System.out.println("Error: строка "+i);
                        break;
                    }
                    if (getMemory().put(i1 / i2, index3) == ResultMemory.Error) {
                        System.out.println("Не удалось сохранить число: строка " + i);
                    }
                    break;
                case MUL:
                    try{
                        index3 = new Byte(line_arr[3]);
                    }catch (Exception ex){
                        System.out.println("Error: строка "+i);
                        break;
                    }
                    if (getMemory().put(i1 * i2, index3) == ResultMemory.Error) {
                        System.out.println("Не удалось сохранить число: строка " + i);
                    }
                    break;
                case PUT:
                    int ch = new Integer(line_arr[1]);
                    byte indexp = new Byte(line_arr[2]);
                    if (getMemory().put(ch, indexp) == ResultMemory.Error) {
                        System.out.println("Не удалось сохранить число: строка " + i);
                    }
                    break;
                case SUB:
                    try{
                        index3 = new Byte(line_arr[3]);
                    }catch (Exception ex){
                        System.out.println("Error: строка "+i);
                        break;
                    }
                    if (getMemory().put(i1 - i2, index3) == ResultMemory.Error) {
                        System.out.println("Не удалось сохранить число: строка " + i);
                    }
                    break;
            }
        }
    }
}
