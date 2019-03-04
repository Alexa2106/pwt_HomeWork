package pack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

public class Niam {

	public static void main(String[] args) {
		ArrayList<Button> button = new ArrayList<Button>();
		
		Button button1 = new Button("Red", "paint in Red");
		Button button2 = new Button("Green", "paint in Green");
		Button button3 = new Button("Yellow", "paint in Yellow");
		
		button.add(button1);
		button.add(button2);
		button.add(button3);
		for (int i = 0;i<button.size(); i++) {
			System.out.println(button.get(i));
		}
		button.remove(button3);
		
		Button button4 = new Button("Black", "paint in Black");
		button.set(1, button4);
		
		System.out.println("This collection after changes: \r\n");
		for (int i = 0;i<button.size(); i++) {
			System.out.println(button.get(i));
		}
		System.out.println("----------------");
		
		
		
		LinkedList<Field> field = new LinkedList<Field>();
		Field field1 = new Field(2, "empty");
		Field field2 = new Field(3, "filled");
		Field field3 = new Field(6, "filled");
		field.add(field1);
		field.add(field2);
		field.add(field3);
		for (int i = 0;i<field.size(); i++) {
			System.out.println(field.get(i));
		}
		field.remove(field1);
		
		Field field4 = new Field(137, "partially empty");
		field.set(1, field4);
		System.out.println("This collection after changes: \r\n");
		for (int i = 0;i<field.size(); i++) {
			System.out.println(field.get(i));
		}
		System.out.println("----------------");
		
		HashSet<Label> label = new HashSet<Label>();
		Label label1 = new Label("Hennesy");
		Label label2 = new Label("XO");
		Label label3 = new Label("Chevas Regal");
		label.add(label1);
		label.add(label2);
		label.add(label3);
		Iterator<Label> iterator = label.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		label.remove(label1);
		
		Iterator<Label> iterator1 = label.iterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		Label label4 = new Label("Aist");
		label.add(label4);
		
		Map<Integer, String> dropdown = new HashMap<Integer, String>();
		dropdown.put(1, "Login");
		dropdown.put(2, "Password");
		dropdown.put(4, "Email");
		dropdown.put(3, "Confirm");
		Collection<String> values = dropdown.values();
		System.out.println(values);
		dropdown.put(6, "Cancel");
		dropdown.remove(4);
		Collection<String> values1 = dropdown.values();
		System.out.println(values1);
		
		TreeSet<Button> button11 = new TreeSet<Button>();
		Button button111 = new Button("Agree", null);
		Button button222 = new Button("Don't agree", null);
		Button button333 = new Button("Ok", null);
		
		button11.add(button111);
		button11.add(button222);
		button11.add(button333);
		for (int j = 0;j<button.size(); j++) {
			System.out.println(button.get(j));
		}
		
		
		
		
		
	}

}
