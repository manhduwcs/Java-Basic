package myRestaurant;

public class Assignment {
//    Chi Tiết Yêu Cầu
//    1. Tạo Interface Table (15 điểm)
//    Table đại diện cho các bàn trong nhà hàng (ví dụ: bàn 2 người, bàn VIP, bàn gia đình).
//    Interface cần có các phương thức:
//    String getTableNumber(): Trả về số bàn.
//    boolean isAvailable(): Kiểm tra xem bàn có sẵn hay không.
//    void bookTable(): Đánh dấu bàn là đã được đặt.
//    void releaseTable(): Đánh dấu bàn là trống.
//    2. Tạo lớp StandardTable và VipTable (20 điểm)
//    Thực hiện interface Table.
//    Các lớp này sẽ chứa các thuộc tính:
//    String tableNumber: Số bàn.
//    int capacity: Sức chứa tối đa.
//    boolean available: Trạng thái của bàn (có sẵn hay không).
//    Ghi đè (override) các phương thức từ interface Table:
//    Cập nhật trạng thái khi đặt và trả bàn.
//    Hiển thị thông tin số bàn và sức chứa.
//    3. Tạo lớp Menu và Dish (20 điểm)
//    Lớp Dish:
//
//    Thuộc tính:
//    String dishName: Tên món ăn.
//    double price: Giá của món ăn.
//    Cung cấp phương thức:
//    String getDishDetails(): Hiển thị thông tin món ăn.
//    Lớp Menu:
//
//    Thuộc tính:
//    ArrayList<Dish> dishes: Danh sách các món ăn.
//    Phương thức:
//    void addDish(Dish dish): Thêm món ăn vào thực đơn.
//    void showMenu(): Hiển thị toàn bộ thực đơn.
//    4. Tạo lớp Customer (20 điểm)
//    Đại diện cho khách hàng của nhà hàng.
//    Thuộc tính:
//    String customerName: Tên khách hàng.
//    ArrayList<Table> bookedTables: Danh sách bàn đã đặt.
//    ArrayList<Dish> orderedDishes: Danh sách món ăn đã gọi.
//    Phương thức:
//    void bookTable(Table table): Đặt bàn.
//    void orderDish(Dish dish): Gọi món ăn.
//    double calculateBill(): Tính tổng tiền cần thanh toán.
//    void checkoutTable(Table table): Thanh toán và trả bàn.
//    5. Tạo lớp Restaurant (25 điểm)
//    Quản lý toàn bộ nhà hàng.
//    Thuộc tính:
//    ArrayList<Table> tables: Danh sách bàn trong nhà hàng.
//    ArrayList<Customer> customers: Danh sách khách hàng.
//    Menu menu: Thực đơn của nhà hàng.
//    Phương thức:
//    void addTable(Table table): Thêm bàn vào nhà hàng.
//    void addCustomer(Customer customer): Thêm khách hàng.
//    void bookTableForCustomer(Customer customer, Table table): Đặt bàn cho khách.
//    void takeOrder(Customer customer, Dish dish): Nhận yêu cầu gọi món.
//    void checkout(Customer customer, Table table): Thanh toán và cập nhật trạng thái bàn.
//    void showAllTables(): Hiển thị trạng thái của tất cả các bàn.
//    void showCustomerOrders(Customer customer): Hiển thị danh sách món khách hàng đã gọi.
//    6. Tạo Lớp Main và Menu Tương Tác (20 điểm)
//    Phương thức main():
//    Hiển thị menu tương tác với người dùng, cung cấp các tùy chọn sau:
//    Thêm bàn mới: Nhập thông tin bàn (số bàn, sức chứa, loại bàn) và thêm vào danh sách.
//    Thêm món mới vào thực đơn: Nhập tên món, giá tiền, và thêm vào thực đơn.
//    Đặt bàn: Nhập tên khách hàng và số bàn để đặt.
//    Gọi món: Nhập tên khách hàng và tên món để gọi.
//    Thanh toán: Nhập tên khách hàng và số bàn để thanh toán, sau đó hiển thị tổng tiền.
//    Xem thực đơn: Hiển thị danh sách các món trong thực đơn.
//    Hiển thị trạng thái bàn: Hiển thị tất cả các bàn và trạng thái hiện tại (trống hoặc đã đặt).
//    Thoát chương trình: Kết thúc.
//    7. Yêu Cầu Chung (10 điểm)
//    Xử lý ngoại lệ:
//    Đặt bàn không sẵn có hoặc đã được đặt.
//    Gọi món không có trong thực đơn.
//    Thanh toán khi không có bàn nào được đặt.
//    Đảm bảo dữ liệu hợp lệ:
//    Không cho phép nhập giá âm, sức chứa không hợp lệ.
//    Tối ưu và tổ chức mã nguồn rõ ràng, dễ bảo trì.
//
}
