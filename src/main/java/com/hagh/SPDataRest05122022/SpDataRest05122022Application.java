package com.hagh.SPDataRest05122022;

import com.hagh.SPDataRest05122022.POJO.Product;
import com.hagh.SPDataRest05122022.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpDataRest05122022Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpDataRest05122022Application.class, args);
	}

	@Autowired
	ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		Product product = Product.builder()
				.productName("Befit B4 45mm dây silicone")
				.price(990000)
				.description("Đồng hồ thông minh BeFit hỗ trợ kết nối với smartphone sử dụng hệ điều hành Android lẫn iOS nhanh chóng nhờ công nghệ Bluetooth v5.0. Từ đó, bạn có thể xem tin nhắn, thông báo về cuộc gọi, ứng dụng bên thứ 3 như Line, Gmail, Skype,... hoặc xem dữ liệu về sức khoẻ, luyện tập thể thao được thống kê một cách chi tiết, đầy đủ trên ứng dụng Glory Fit.")
				.category("Befit")
				.discount(50)
				.imgURL("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSJhrQkl_741rZlovxDhFAxfkx7HZhcRX4xYN_sLOidNfzxIlBr")
				.build();
		productRepository.save(product);
		//
		Product product1 = Product.builder()
				.productName("Đồng thông minh Xiaomi Redmi Watch 2 Lite 41.2mm ")
				.price(1490000)
				.description("Redmi Watch 2 Lite sở hữu thiết kế màn hình lớn với kích thước 1.55 inch, tăng 10% diện tích so với bản tiền nhiệm Mi Watch Lite là 1.4 inch, được trang bị công nghệ màn hình TFT cùng độ phân giải 320 x 360 pixels hiển thị đa dạng màu sắc, hình ảnh rõ ràng, thoả mãn thị giác của bạn. Đồng thời, bạn có thể thay đổi giữa hơn 100 giao diện được thiết kế trong mặt đồng hồ tạo nên sự linh hoạt và đa dạng để phù hợp với trang phục hoặc tâm trạng mỗi ngày của bạn.")
				.category("Xiaomi")
				.discount(20)
				.imgURL("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcS3z1P_6npT-G-xSNojWPSI6ysexLIBXarNEwwMsqcjPpgpHdRC")
				.build();
		productRepository.save(product1);

		Product product2 = Product.builder()
				.productName("Apple Watch Series 7 GPS 41mm ")
				.price(11990000)
				.description("Thiết kế của Apple Watch S7 GPS 41 mm thừa hưởng nhiều nét tương đồng với \"người anh\" Apple Watch S6 nhưng các góc cạnh được vát tròn mềm mại hơn mang đến cho người đeo cảm giác thanh lịch nhưng không kém phần năng động. Chiếc smartwatch thế hệ thứ 7 được nhà Táo trang bị màn hình OLED 1.61 inch với viền màn hình mỏng hơn 40%, nâng diện tích màn hình lên 20% và nội dung hiển thị trên màn hình cũng nhiều hơn 50% so với thế hệ cũ.")
				.category("Apple")
				.discount(20)
				.imgURL("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcR5QaneslhcljWqheaDuFRUVFrLH8v7sJMoFguEDSnJCFpXjaeb")
				.build();
		productRepository.save(product2);

		Product product3 = Product.builder()
				.productName("Apple Watch S3 GPS 38mm viền nhôm dây silicone ")
				.price(5990000)
				.description("Apple Watch S3 GPS 38 mm viền nhôm dây silicone trắng sở hữu màn hình công nghệ OLED kích thước 1.5 inch, độ phân giải 340 x 272 pixels cho khả năng hiển thị rõ ràng, sắc nét. Trang bị khung viền nhôm cứng cáp và mặt kính Ion-X strengthened glass giúp bảo vệ đồng hồ an toàn. Dây đeo silicone có độ bền cao, chống thấm nước, êm nhẹ, mang đến cho bạn cảm giác thoải mái, dễ chịu.")
				.category("Apple")
				.discount(16)
				.imgURL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTJd1wMPXRNEuLJHTaq12b08Myn0QpRwcqH6T9HgnROHh2Xyl4d")
				.build();
		productRepository.save(product3);

		Product product4 = Product.builder()
				.productName("Đồng hồ thông minh Apple Watch S8 GPS 41mm")
				.price(11990000)
				.description("Với những hình ảnh ban đầu của chiếc Apple Watch Series 8 thì không có gì khác biệt so với thế hệ trước. Nhưng khi cầm trên tay và trải nghiệm thì mình nhận thấy Apple đã có sự tinh chỉnh các chi tiết để thiết bị có vẻ ngoài hoàn hảo hơn.")
				.category("Apple")
				.discount(5)
				.imgURL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSfue_gO5UhylEg04uU7xYPrDdUw3paY7Pjw70maDr1OHR2W0be")
				.build();
		productRepository.save(product4);

		Product product5 = Product.builder()
				.productName("Đồng hồ thông minh HONOR Watch GS3 45.9mm dây da xanh dương")
				.price(5990000)
				.description("Mang kiểu dáng thanh lịch, độ hoàn thiện cao với mặt đồng hồ tròn truyền thống. Đồng hồ thông minh Honor còn được trang bị khung viền thép không gỉ tăng thêm sự bền bỉ, hạn chế hư hỏng trong quá trình sử dụng của bạn.")
				.category("HONOR")
				.discount(8)
				.imgURL("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcR2NK-xeMYBqPm9ZNuSJei6wQuAzvrj4Yqx3CU8AxsaAC8kJiM8")
				.build();
		productRepository.save(product5);

		Product product6 = Product.builder()
				.productName("Đồng hồ thông minh Realme Watch 3 45mm dây silicone")
				.price(1990000)
				.description("Đồng hồ thông minh Realme có thiết kế mặt vuông cong nhẹ ở 4 góc, được bao bọc bởi khung viền polycarbonate mang lại sự cứng cáp cho đồng hồ nhưng vẫn giữ được khối lượng nhẹ. Dây đeo silicone mềm mại, thân thiện với da tay mang lại cho bạn sự thoải mái trong mọi hoạt động.")
				.category("Realme")
				.discount(15)
				.imgURL("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRHAxPKLwkIeQNtUvifGxx7JvkE1E7-kvTMhjIojlevWCjIOuRJ")
				.build();
		productRepository.save(product6);

		Product product7 = Product.builder()
				.productName("Đồng hồ thông minh Amazfit GTR 4 46mm")
				.price(4900000)
				.description("Dòng Amazfit GTR 4 kế thừa thiết kế đặc trưng của Amazfit GTR 3 là mặt đồng hồ hình tròn với khung viền hợp kim nhôm sang trọng, bền chắc. Tuy có kích thước mặt 46 mm nhưng không tạo cảm giác nặng tay khi đeo với trọng lượng chỉ 34 gram. Lúc luyện tập thể thao hay sinh hoạt hằng ngày thì sản phẩm này cũng không gây ra bất kỳ trở ngại nào cho mình.")
				.category("Amazfit")
				.discount(0)
				.imgURL("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQPAhxqsujswycFWgVZfNJ-cqt8F5BjVsR7T-to-D2-PaC923cE")
				.build();
		productRepository.save(product7);

		Product product8 = Product.builder()
				.productName("Đồng hồ thông minh Amazfit GTS 4 42.7mm")
				.price(4900000)
				.description("Nhìn sơ thì thiết kế bên ngoài của Amazfit GTS 4 này không có gì quá khác biệt so với các dòng đồng hồ thông minh trên thị trường hiện nay. Nhưng so với những thế hệ trước của hãng thì đã có nhiều sự thay đổi, tiêu biểu là phần viền được làm mỏng hơn cho cảm giác xem không bị giới hạn.")
				.category("Amazfit")
				.discount(0)
				.imgURL("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSyjvL98hbSg_miWr_gMZq0sp-69Xsxi_7scGBIESx8z1Nsxo71")
				.build();
		productRepository.save(product8);

		Product product9 = Product.builder()
				.productName("Đồng hồ thông minh Apple Watch Ultra LTE 49mm dây Ocean")
				.price(23900000)
				.description("Nếu bạn cảm thấy “nhàm chán\" với kiểu thiết kế của những chiếc đồng hồ thông minh Apple Watch trước đây thì Apple Watch Ultra LTE sẽ giúp bạn xóa tan định kiến này. Đồng hồ mang diện mạo hoàn toàn mới, nổi bật nhất là kích thước khá to 49mm và có phần hơi hầm hố nên sẽ rất phù hợp với những bạn có cổ tay lớn, đặc biệt là phái mạnh")
				.category("Apple")
				.discount(6)
				.imgURL("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcT4qnC31Vv0y6ze9-VysiBxBx6LWrzVtlX6clsjmDaq-LrWQCfl")
				.build();
		productRepository.save(product9);

	}
}
