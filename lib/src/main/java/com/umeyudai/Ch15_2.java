package com.umeyudai;
import java.io.IOException;
import java.io.PrintWriter;
public class Ch15_2 {
    public static void main(String[] args) {
		try(PrintWriter out = new PrintWriter("mydata.txt");) {
			out.print(3001);		// 番号
			out.print("\t");		// 区切り文字
			out.print("山田隆二");	// 氏名
			out.print("\t");		// 区切り文字
			out.println(70.2);		// 成績
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
