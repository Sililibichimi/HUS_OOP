package oop_hus.hu.decorator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class BreadStore {
	private List<Bread> breads;

	public BreadStore() {
		breads = new ArrayList<>();
	}

	public void init() {
	    /* TODO
		Sinh ra một số tự nhiên ngẫu nhiên nằm trong đoạn [5, 10], gọi là n.
		Khởi tạo ban đầu cửa hàng có:
	    n bánh mỳ ThickcrustBread chỉ có cheese,
	    n bánh mỳ ThickcrustBread chỉ có olives,
	    n bánh mỳ ThickcrustBread có cheese và sau đó thêm olives,
	    n bánh mỳ ThickcrustBread có olives và sau đó thêm cheese,

	    n bánh mỳ ThincrustBread chỉ có cheese,
	    n bánh mỳ ThincrustBread chỉ có olives,
	    n bánh mỳ ThincrustBread có cheese và sau đó thêm olives,
	    n bánh mỳ ThincrustBread có olives và sau đó thêm cheese.
		*/
		Random random = new Random();
		int n = random.nextInt(5) + 5;
		Bread br = new ThickcrustBread();
		for(int i = 0; i < n; ++i) {
			breads.add(new Cheese(br));
		}
		for(int i = 0; i < n; ++i) {
			breads.add(new Olives(br));
		}
		for(int i = 0; i < n; ++i) {
			breads.add(new Olives(new Cheese(br)));
		}
		for(int i = 0; i < n; ++i) {
			breads.add(new Cheese(new Olives(br)));
		}
		Bread thinBr = new ThincrustBread();
		for(int i = 0; i < n; ++i) {
			breads.add(new Cheese(thinBr));
		}
		for(int i = 0; i < n; ++i) {
			breads.add(new Olives(thinBr));
		}
		for(int i = 0; i < n; ++i) {
			breads.add(new Olives(new Cheese(thinBr)));
		}
		for(int i = 0; i < n; ++i) {
			breads.add(new Cheese(new Olives(thinBr)));
		}
	}

	/**
	 * Thêm bánh mỳ vào cửa hàng.
	 */
	public void add(Bread bread) {
		/* TODO */
		breads.add(bread);
	}

	/**
	 * Giả sử cửa hàng bán một cái bánh mỳ nào đó,
	 * Bánh mỳ được lấy ra để bán là bánh mỳ đầu tiên theo yêu cầu
	 *  của khác hàng (ví dụ, ThickcrustBread + Cheese + Olives)
	 * Nếu còn bánh mỳ để bán thì trả về giá trị true,
	 *  nếu không còn trả về giá trị false.
	 */
	public boolean sell(String bread) {
		/* TODO */
		for(Bread br : breads) {
			if(br.getDescription().equals(bread)) return true;
		}
		return false;
	}

	/**
	 * In ra những bánh mỳ còn trong cửa hàng.
	 */
	public void print() {
		/* TODO */
		for(Bread br : breads) {
			System.out.println(br.getDescription() + ", " + br.cost());
		}
	}
	public void print(List<Bread> breads) {
		for(Bread br : breads) {
			System.out.println(br.getDescription() + ", " + br.cost());
		}
	}
	/**
	 * Trả ra các bánh mỳ còn lại trong cửa hàng được sắp xếp theo giá, thứ tự được cho bởi order,
	 *  nếu order là true, sắp xếp theo thứ tự tăng dần,
	 *  nếu order là false, sắp xếp theo thứ tự giảm dần.
	 * Chú ý: việc sắp xếp không làm thay đổi thứ tự của bánh mỳ trong cửa hàng.
	 */
	public List<Bread> sort(boolean order) {
		List<Bread> list = new LinkedList<>(breads);
		for(int idx = 0; idx < list.size() - 1; idx++) {
			for (int j = idx + 1; j < list.size(); ++j) {
				if(order ? list.get(idx).cost() > list.get(j).cost() : list.get(idx).cost() < list.get(j).cost()) {
					Bread temp = list.get(idx);
					list.set(idx, list.get(j));
					list.set(j, temp);
				}
			}
		}
		return list;
	}


	/**
	 * Lọc ra howMany cái bánh mỳ có giá cao nhất hoặc thấp nhất,
	 *  nếu order là true thì lọc ra bánh mỳ có giá cao nhất,
	 *  nếu order là false thì lọc ra bánh mỳ có giá thấp nhất.
	 */
	public List<Bread> filter(int howMany, boolean order) {
		int size = Math.min(howMany, breads.size());
		List<Bread> list = sort(order);
		return list.subList(0, size);
	}
	public List<Bread> filter(List<Bread> breads, int howMany, boolean order) {
		int size = Math.min(howMany, breads.size());
		List<Bread> list = sort(!order);
		return list.subList(0, size);
	}

	public static void main(String args[]) {
		/* TODO
		 Tạo ra một cửa hàng bánh mỳ, với số bánh mỳ ban đầu được khởi tạo qua phương thức init(),

		 Viết demo các chức năng:
		   - Bán 5 cái bánh mỳ từ cửa hàng
		   - Mỗi lần bán,
		       + in ra những bánh mỳ còn lại trong cửa hàng (theo định dạng: thông tin mỗi bánh mỳ là description + giá,
		         ví dụ, ThickcrustBread + Cheese, Cost 31.0; mỗi bánh mỳ in ra trên một dòng).
		       + in ra số bánh mỳ còn lại theo thứ tự giá giảm dần (theo định dạng như trên).
		   - In ra nhiều nhất 10 cái bánh mỳ có giá cao nhất còn lại trong cửa hàng (theo định dạng như trên)


		 - Hoàn thiện chương trình và thực hiện các chức năng demo, lưu kết quả chạy chương trình và file text được đặt tên
          là <TenSinhVien_MaSinhVien_BreadStore>.txt (Ví dụ, NguyenVanA_123456_BreadStore.txt).
         - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
          <TenSinhVien_MaSinhVien_BreadStore>.zip (Ví dụ, NguyenVanA_123456_BreadStore.zip),
          nộp lên classroom.
		 */
		BreadStore store = new BreadStore();
		store.init();
		System.out.println("\nBán 5 bánh");
		String br = new ThickcrustBread().getDescription();
		for(int i = 0; i < 5; ++i) {
			System.out.println("\n Bán 1 chiêc : " + br);
			store.sell(br);
			System.out.println("\nBánh còn lại");
			store.print();
			System.out.println("\nSắp xếp bánh theo giá giảm dần: ");
			List<Bread> sort = store.sort(false);
			store.print(sort);
		}
		System.out.println("\n10 Bánh có giá cao : ");
		List<Bread> sort = store.filter(10, false);
		store.print(sort);
	}
}
