package com.example.kotlin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Arrays;
import java.util.List;
import static com.example.kotlin.FunKt.sayHi;

public class Main2Activity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);


		findViewById(R.id.tv_demo);

		sayHi("");

		int result = add(10 , doubleValue(20));


		List<String> list = Arrays.asList("","");




		int result1 = add(102 ,doubleValue(23));

		UtilsKt.toast(this ,"" , 0);

		User.sing();

		//java中调用 kotlin中的静态方法
		User.Companion.study();
		User.Companion.sing();

		Obj.INSTANCE.bar();

		FunsKt.sayHello("");

		FunsKt.sayHello();
		UtilsKt.last("Kotlin");
	}

	private int add(int a, int b ){
		return a + b;
	}

	private int doubleValue(int a) { return a*2 ; }



}
