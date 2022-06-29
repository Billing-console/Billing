package project;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class MyBill {

public static void main(String  args[]) {
	String name;
	Date date;
	Long phno;
	int num;
	String offer;
	double sum=0;
	double discount = 0;
	Scanner scan=new Scanner(System.in);
	String [] productName= new String[100];
	double [] price=new double [100];
	double [] quantity=new double[100];
	double [] priceq=new double[100];
	System.out.println("Enter the customer name (3-30)");
	name=scan.nextLine();
	if(name.length()<3||name.length()>30) {
		System.out.println("Enter the valid username");
	}
	else {
	System.out.println("Enter the moblile number");
	phno=scan.nextLong();
	String phnlgt = String.valueOf(phno);
	if(phnlgt.length()>10||10>phnlgt.length()) {
	System.out.println("Enter valid mobile number");
	}
	else {
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	date=new Date();
	System.out.println("Enter the no.of products");
	num=scan.nextInt();
	if(num<101) {
	for(int i=0;i<num;i++) {
	System.out.println("Enter the product name");
	productName[i]=scan.next();
	System.out.println("Enter the price");
	price[i]=scan.nextDouble();
	System.out.println("Enter the quantity");
	quantity[i]=scan.nextDouble();
	priceq[i]=price[i]*quantity[i];
	}
	System.out.println("discount yes/no");
	offer=scan.next();
	if(offer.equalsIgnoreCase("yes")) {
	System.out.println("Enter the discount");
	discount=scan.nextDouble();
	}
	else
	{
	discount=0;
	}
	System.out.println("Name: "+name+"\t"+"Ph.no: "+phno+"\t"+"Date: "+formatter.format(date));
	System.out.println("-------------------------------------------------------------");
	System.out.println("Product"+"\t"+"\t"+"Qty"+"\t"+"\t"+"Price ");
	System.out.println("*******"+"\t"+"\t"+"***"+"\t"+"\t"+"*******");
	for(int i=0;i<num;i++) {
	System.out.println( productName[i]+"\t"+"\t"+quantity[i]+"\t"+"\t"+priceq[i]);
	sum=sum+priceq[i];
	}
	System.out.println("----------------------------------------");
	System.out.println("Total         "+"\t"+"\t"+"Rs "+sum);
	System.out.println("Discount      "+"\t"+"\t"+"Rs "+discount);
	System.out.println("Amount payable"+"\t"+"\t"+"Rs "+(sum-discount));
	System.out.println(" ");
	System.out.println("Thank You for shopping with us");
	System.out.println("..............................");
	System.out.println("Visit Again");
	}
	else {
	System.out.println("The number of products should less than 100");
	}}}
	scan.close();
	}
}
