package rct.impl;

import org.apache.log4j.BasicConfigurator;

import rct.Transform;
import rct.TransformReceiver;
import rct.TransformerFactory;

public class Echo {

		public static void main(String[] args) {

		BasicConfigurator.configure();

		if (args.length != 2) {
			System.err.println("Required 2 arguments!");
			System.exit(1);
		}
		try {
			TransformReceiver transformer = TransformerFactory.getInstance()
					.createTransformReceiver();

			Thread.sleep(1000);

			Transform t = transformer.lookupTransform(args[0], args[1],
					System.currentTimeMillis());

			System.out.println(t);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}

		System.exit(0);
	}

}
