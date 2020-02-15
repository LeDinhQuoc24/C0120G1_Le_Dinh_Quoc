let listCustomer = [];
let validateBirthday=/^((0)[1-9]|[1-2][0-9]|[3][0-1])(\/)((0)[1-9]|(1)[0-2])(\/)\d{4}$/;
let validateEmail=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
let checkDeleteCustomer=false;
let checkEditCustomer=false;

function displayMainMenu() {
    let choose = prompt("1.Hiển thị thông tin khách hàng" + "\n" +
        "2.Hiển thị tiền cần thanh toán"+ "\n" +
        "3.Chỉnh sửa thông tin khách hàng" + "\n" +
        "4.Thêm thông tin khách hàng" + "\n" +
        "5.Xóa thông tin khách hàng" + "\n" +
        "6.Thoát" + "\n" + "Lựa chọn tính năng");
    switch (choose) {
        case "1":
            displayCustomer();
            break;
        case "2":
            displayTotalPays();
            break;
        case "3":
            chooseEditCustomer();
            break;
        case "4":
            chooseAddNewCustomer();
            break;
        case "5":
            chooseDeleteCustomer();
            break;
        case "6":
            exit();
            break;
        default:
            alert("Lỗi nhập");
    }
}
function chooseAddNewCustomer() {
    let checkBirthday=false;
    let checkEmail=false;
    let cus = new Customer();
    cus.setNameCustomer(prompt("Nhập vào tên khách hàng"));
    cus.setIDCustomer(prompt("Nhập vào thẻ CMND"));
    cus.setAddressCustomer(prompt("Nhập vào địa chỉ khách hàng"));
    do {
        cus.setBirthdayCustomer(prompt("Nhập vào ngày tháng năm sinh"));
        if (validateBirthday.test(cus.getBirthdayCustomer())) {
            checkBirthday = true;
        } else {
            alert("Nhập ngày sinh không hợp lệ");
        }
    }while (!checkBirthday);
    do {
        cus.setEmailCustomer(prompt("Nhập vào địa chỉ Email"));
        if (validateEmail.test(cus.getEmailCustomer())) {
            checkEmail = true;
        } else {
            alert("Nhập địa chỉ email không hợp lệ");
        }
    }while (!checkEmail);
    cus.setTypeCustomer(prompt("Nhập vào loại thẻ khách hàng"));
    cus.setRentDay(prompt("Nhập vào số ngày thuê"));
    cus.setDiscount(prompt("Nhập vào mã giảm giá"));
    cus.setTypeService(prompt("Nhập vào loại hình dịch vụ"));
    listCustomer.push(cus);
    displayMainMenu();
}
function displayCustomer() {
    let result = "";
    for (let i = 0; i < listCustomer.length; i++) {
        result += "\n" + (i + 1 + ".") + "Tên khách hàng: " + listCustomer[i].getNameCustomer() +
            ";CMND: " + listCustomer[i].getIDCustomer();
    }
    result += "\n" + (listCustomer.length + 1) + ".Quay lại giao diện";
    let chooseDisplayInfo = prompt(result);
    if(chooseDisplayInfo.toString()!==(listCustomer.length+1).toString()){
        if(!checkDeleteCustomer){
            displayInfomationCustomer(Number.parseInt(chooseDisplayInfo) - 1);
        }else{
            deleteCustomer(Number.parseInt(chooseDisplayInfo) - 1)
        }

    }else{
        checkEditCustomer=false;
        displayMainMenu();
    }
}

function displayInfomationCustomer(index) {
    if(!checkEditCustomer) {
        alert("Thông tin khách hàng: " +
            "\n1.Tên khách hàng: " + listCustomer[index].getNameCustomer() +
            "\n2.CMND: " + listCustomer[index].getIDCustomer() +
            "\n3.Địa chỉ khách hàng: " + listCustomer[index].getAddressCustomer() +
            "\n4.Ngày tháng năm sinh: " + listCustomer[index].getBirthdayCustomer() +
            "\n5.Địa chỉ email: " + listCustomer[index].getEmailCustomer() +
            "\n6.Loại thẻ khách hàng: " + listCustomer[index].getTypeCustomer() +
            "\n7.Số ngày thuê: " + listCustomer[index].getRentDay() +
            "\n8.Mã giảm giá: " + listCustomer[index].getDiscount() +
            "\n9.Loại dịch vu: " + listCustomer[index].getTypeService());
    }else {
        let chooseEdit=prompt(
            "\n1.Tên khách hàng: " + listCustomer[index].getNameCustomer() +
            "\n2.CMND: " + listCustomer[index].getIDCustomer() +
            "\n3.Địa chỉ khách hàng: " + listCustomer[index].getAddressCustomer() +
            "\n4.Ngày tháng năm sinh: " + listCustomer[index].getBirthdayCustomer() +
            "\n5.Địa chỉ email: " + listCustomer[index].getEmailCustomer() +
            "\n6.Loại thẻ khách hàng: " + listCustomer[index].getTypeCustomer() +
            "\n7.Số ngày thuê: " + listCustomer[index].getRentDay() +
            "\n8.Mã giảm giá: " + listCustomer[index].getDiscount() +
            "\n9.Loại dịch vu: " + listCustomer[index].getTypeService()+
            "\n10.Quay lại giao diện"+
            "\nNhập 1-10 để lựa chọn tính năng"
        );
        if(chooseEdit!=="10"){
            switch (chooseEdit) {
                case "1":
                    listCustomer[index].setNameCustomer(prompt("Nhập tên khách hàng muốn thay đổi"));
                    break;
                case "2":
                    listCustomer[index].setIDCustomer(prompt("Nhập CMND muốn thay đổi"));
                    break;
                case "3":
                    listCustomer[index].setAddressCustomer(prompt("Nhập địa chỉ khách hàng muốn thay đổi"));
                    break;
                case "4":
                    listCustomer[index].setBirthdayCustomer(prompt("Nhập ngày tháng năm sinh muốn thay đổi"));
                    break;
                case "5":
                    listCustomer[index].setEmailCustomer(prompt("Nhập địa chỉ Email muốn thay đổi"));
                    break;
                case "6":
                    listCustomer[index].setTypeCustomer(prompt("Nhập loại thẻ khách hàng muốn thay đổi"));
                    break;
                case "7":
                    listCustomer[index].setRentDay(prompt("Nhập số ngày thuê  muốn thay đổi"));
                    break;
                case "8":
                    listCustomer[index].setDiscount(prompt("Nhập mã giảm giá muốn thay đổi"));
                    break;
                case "9":
                    listCustomer[index].setTypeService(prompt("Nhập loại dịch vụ muốn thay đổi"));
                    break;
            }
            checkEditCustomer=false;
            displayMainMenu();
        }else{
            displayMainMenu();
        }

    }
    displayMainMenu();
}
function chooseDeleteCustomer() {
    checkDeleteCustomer=true;
    displayCustomer();
}
function deleteCustomer(index) {
    let chooseConfirm = prompt(
        "Bạn có chắc xóa tên khách hàng: " + listCustomer[index].getNameCustomer() + "CMND: " +
        listCustomer[index].getIDCustomer() + "\n1.Yes\n2.No"
    );
    if(chooseConfirm==="1"){
        listCustomer.splice(index,1);
        alert("Xoá thành công");
    }
    checkDeleteCustomer=false;
    displayMainMenu();
}
function chooseEditCustomer() {
    checkEditCustomer=true;
    displayCustomer();
}
function exit() {
    alert("Cảm ơn quý khách đã sử dịch vụ của chúng tôi");
}

    displayMainMenu();






