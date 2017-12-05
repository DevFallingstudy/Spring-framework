package myPackage;

import java.util.ArrayList;

public class CarFactory {
	private static ArrayList<String> KIAArr;
	private static ArrayList<String> HyundaiArr;

	private CarFactory() {
		
	}
	
	private static void addModelsToArray() {
		KIAArr = new ArrayList<>();
		HyundaiArr = new ArrayList<>();
		
		KIAArr.add("K3");
		KIAArr.add("K5");
		KIAArr.add("K7");
		KIAArr.add("Stinger");
		KIAArr.add("Pride");
		KIAArr.add("Morning");
		KIAArr.add("Ray");
		KIAArr.add("Soul");
		KIAArr.add("Sportage");

		HyundaiArr.add("Aslan");
		HyundaiArr.add("Grandeur");
		HyundaiArr.add("Sonata");
		HyundaiArr.add("Avante");
		HyundaiArr.add("Accent");
		HyundaiArr.add("i40");
		HyundaiArr.add("i30");
		HyundaiArr.add("Santafe");
		HyundaiArr.add("Santa Fe");
		HyundaiArr.add("Tucson");
		HyundaiArr.add("Starex");
	}
	
	public static Car makeCar(String model, int year, String maker) {
		addModelsToArray();
		if (maker.isEmpty() || (!maker.equalsIgnoreCase("KIA") && !maker.equalsIgnoreCase("hyundai"))) {
			return new Car(model, year, findMaker(model));
		} else {
			return new Car(model, year, maker);
		}
	}

	public static Car makeCar(String model, int year) {
		addModelsToArray();
		return new Car(model, year, findMaker(model));
	}

	private static String findMaker(String model) {
		for (int i = 0; i < HyundaiArr.size(); i++) {
			if (HyundaiArr.get(i).equalsIgnoreCase(model)) {
				return "Hyundai";
			}
		}
		for (int i = 0; i < KIAArr.size(); i++) {
			System.out.println(KIAArr.get(i) + " | " + model);
			if (KIAArr.get(i).equalsIgnoreCase(model)) {
				return "KIA";
			}
		}
		return "UNKNOWN";
	}
}
