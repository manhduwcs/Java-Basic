package myHotel;

public class MyHotelAssignment {
    /*
     * Đề Bài: Xây Dựng Ứng Dụng Java Mô Phỏng Hệ Thống Quản Lý Khách Sạn Bạn được
     * yêu cầu xây dựng một ứng dụng Java mô phỏng hệ thống quản lý khách sạn. Ứng
     * dụng này cho phép quản lý phòng, khách hàng, và các hoạt động đặt/trả phòng.
     * Hãy triển khai các chức năng sau theo yêu cầu chi tiết và hoàn chỉnh ứng dụng
     * theo mô hình đã cho.
     * 
     * Chi tiết yêu cầu:
     * 
     * 1. Tạo interface Room (15 điểm) - Room sẽ đại diện cho các phòng có thể đặt
     * trong khách sạn (ví dụ: phòng thường, phòng VIP). - Interface phải chứa các
     * phương thức sau: + String getRoomNumber(): Trả về số phòng. + boolean
     * isAvailable(): Kiểm tra xem phòng có sẵn để đặt không. + void bookRoom():
     * Đánh dấu phòng là đã đặt. + void releaseRoom(): Đánh dấu phòng là trống.
     * 
     * 2. Tạo lớp StandardRoom và VipRoom (20 điểm) - Thực hiện interface Room. -
     * Lớp StandardRoom và VipRoom sẽ chứa các thuộc tính: + String roomNumber: Số
     * phòng. + double rate: Giá phòng mỗi đêm. + boolean available: Trạng thái có
     * sẵn của phòng (có thể đặt được hay không). - Override các phương thức của
     * interface Room để: + Trả về số phòng và giá. + Cập nhật trạng thái khi đặt và
     * trả phòng.
     * 
     * 3. Tạo lớp Guest (20 điểm) - Lớp này đại diện cho một khách hàng của khách
     * sạn, chứa các thuộc tính: + String guestName: Tên của khách hàng. +
     * ArrayList<Room> bookedRooms: Danh sách các phòng mà khách đã đặt. - Cung cấp
     * các phương thức: + void bookRoom(Room room): Khách hàng đặt một phòng từ
     * khách sạn, cập nhật danh sách phòng đã đặt. + void checkoutRoom(Room room):
     * Khách hàng trả lại phòng đã đặt. + void showBookedRooms(): Hiển thị danh sách
     * các phòng đã đặt của khách hàng.
     * 
     * 4. Tạo lớp Hotel (25 điểm) - Lớp này sẽ quản lý toàn bộ khách sạn, chứa các
     * thuộc tính sau: + ArrayList<Room> rooms: Danh sách các phòng có trong khách
     * sạn. + ArrayList<Guest> guests: Danh sách các khách hàng của khách sạn. -
     * Cung cấp các phương thức: + void addRoom(Room room): Thêm một phòng vào khách
     * sạn. + void addGuest(Guest guest): Thêm một khách hàng vào khách sạn. + void
     * bookRoom(Guest guest, Room room): Khách hàng đặt một phòng từ khách sạn. +
     * void releaseRoom(Guest guest, Room room): Khách hàng trả lại phòng cho khách
     * sạn. + void showAllRooms(): Hiển thị tất cả các phòng trong khách sạn và
     * trạng thái của chúng (có sẵn hay đã đặt).
     * 
     * 5. Tạo lớp Main và menu tương tác (20 điểm) - Chứa phương thức main() để
     * người dùng có thể tương tác với hệ thống qua một menu. Giao diện người dùng
     * đơn giản với các tùy chọn sau: 1. Thêm phòng mới vào khách sạn: + Nhập thông
     * tin phòng như số phòng, loại phòng (Standard/VIP), giá phòng. + Thêm phòng
     * vào danh sách các phòng trong khách sạn. 2. Thêm khách hàng mới vào khách
     * sạn: + Nhập tên khách hàng. + Thêm khách hàng vào danh sách khách hàng của
     * khách sạn. 3. Đặt phòng: + Nhập tên khách hàng và số phòng cần đặt. + Kiểm
     * tra xem phòng có sẵn không và cho phép khách hàng đặt phòng nếu có sẵn. 4.
     * Trả phòng: + Nhập tên khách hàng và số phòng cần trả. + Cập nhật trạng thái
     * phòng và xóa khỏi danh sách phòng đã đặt của khách hàng. 5. Hiển thị tất cả
     * các phòng trong khách sạn: + Hiển thị danh sách tất cả các phòng trong khách
     * sạn kèm theo trạng thái (có sẵn hay đã đặt). 6. Hiển thị danh sách các phòng
     * đã đặt của khách hàng: + Nhập tên khách hàng. + Hiển thị danh sách các phòng
     * mà khách hàng đã đặt. 7. Thoát chương trình: + Dừng chương trình.
     * 
     * 6. Yêu cầu chung (10 điểm) - Xử lý các ngoại lệ có thể xảy ra, ví dụ: + Đặt
     * phòng không có sẵn hoặc khách hàng cố gắng đặt phòng đã được đặt. + Trả phòng
     * mà không có trong danh sách phòng đã đặt của khách hàng. + Không cho phép
     * nhập các giá trị không hợp lệ (ví dụ: nhập số phòng trống hoặc giá phòng âm).
     * - Giao diện menu đơn giản, rõ ràng và dễ sử dụng.
     * 
     * Tổng điểm: 100 điểm Chú ý: - Điểm sẽ được chấm dựa trên tính đúng đắn, hiệu
     * quả của giải pháp, cách tổ chức mã nguồn, và khả năng xử lý ngoại lệ. - Chúc
     * bạn làm bài thi tốt!
     */

}
