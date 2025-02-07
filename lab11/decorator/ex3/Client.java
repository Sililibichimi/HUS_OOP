package oop_hus.lab11.decorator.ex3;

public class Client {
    public static void main(String[] args) {
        DataSource dataSource01 = new FileDataSource("oop/lab11/decorator/ex3/data01");
        dataSource01.writeData("Siuuuuuu");
        System.out.println(dataSource01.readData());

        DataSource dataSource02 = new FileDataSource("oop/lab11/decorator/ex3/data02");
        DataSourceDecorator dataSourceDecorator02 = new EncryptionDecorator(dataSource02);
        dataSourceDecorator02.writeData("That dau kho");
        System.out.println(dataSourceDecorator02.readData());

        DataSource dataSource03 = new FileDataSource("oop/lab11/decorator/ex3/data03");
        DataSourceDecorator dataSourceDecorator03 = new CompressionDecorator(dataSource03);
        dataSourceDecorator03.writeData("Go home now");
        System.out.println(dataSourceDecorator03.readData());
    }
}
