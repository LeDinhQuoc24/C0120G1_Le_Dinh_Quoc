//Xét tính hợp lệ của tên khách hàng
let name = document.getElementById("name");
function checkname() {
    let nameStandardized = "";
    name.value = name.value.trim().toLocaleLowerCase();
    for (let i = 0; i < name.length; i++) {
        if (name.charAt(i) === " " && (name.charAt(i + 1)) === " ") {
            continue;
        }
        if (i === 0 || name.charAt(i - 1) === " ") {
            nameStandardized += name.charAt(i).toLocaleUpperCase();
            continue;
        }
        nameStandardized += name.charAt(i);
    }
    name.value = nameStandardized;
    name.style.color = "blue";
}

//Xét tính hợp lệ của chứng minh nhân dân
//Chưa thông báo được trường hợp nhập dấu -
//Nếu click vào lại mà không thay đổi thì không hiện thông báo nhập sai
function checkidcard(){
    let identitycard=document.getElementById("idcard").value;
    let checkidentitycard=true;
    while(checkidentitycard){
        identitycard=Number.parseFloat(identitycard);
        if(Number.isInteger(identitycard)){
            if(Number.parseFloat(identitycard)>100000000&&Number.parseFloat(identitycard)<999999999){
                checkidentitycard=false;
                alert("Nhập CMND thành công");
                document.getElementById("idcard").style.color = "blue";
                break;
            }else{
                alert("Nhập đúng giá trị số CMND");
                document.getElementById("idcard").style.color = "black";
                break;
            }
        }else{
            alert("Nhập số CMND là 1 số nguyên");
            document.getElementById("idcard").style.color = "black";
            break;
        }
    }
}
//Xét tính hợp lệ của ngày tháng năm sinh
function checkbirthday() {
    let checkbirthday=true;
    let birthdayCustomer=document.getElementById("birthdayCustomer").value;
    if(birthdayCustomer.length===10){
        let year=birthdayCustomer.substring(0,4);
        if (year>2019||year<1970){
            alert("Nhập năm sinh từ 1970 đến 2019");
            document.getElementById("birthdayCustomer").style.color = "black";

        }else {
            alert("Nhập thành công");
            document.getElementById("birthdayCustomer").style.color = "blue";
        }
    }else{
        alert("Nhập ngày tháng năm đúng giá trị");
        document.getElementById("birthdayCustomer").style.color = "black";
    }
}


//Xét tính hợp lệ Email nhập
//Nếu click vào lại mà không thay đổi thì không hiện thông báo nhập sai
function checkemailCustomer() {
    let checkemail = true;
    let emailaddress = document.getElementById("emailCustomer").value;
    while (checkemail) {
        checkemail = false;
        let countDoc = 0;
        let countAt = 0;
        let i;
        for (i = 0; i < emailaddress.length; i++) {
            if (emailaddress.charAt(i) === "@") {
                countAt++;
                for (let j = i + 1; j < emailaddress.length; j++) {
                    if (emailaddress.charAt(j) === ".") {
                        countDoc++;
                    }
                }
            }
        }


        if ( countAt == 1 && countDoc>=1) {
            checkemail = true;
            alert("Nhập địa chỉ Email thành công");
            document.getElementById("emailCustomer").style.color = "blue";
            break;
        } else {
            checkemail = false;
            alert("Vui lòng nhập lại địa chỉ email");
            document.getElementById("emailCustomer").style.color = "black";
            break;
        }
    }
}
//Xét tính hợp lệ của địa chỉ sinh sống
function checkaddress(){
    let address=document.getElementById("addressCustomer").value;
    let addressStandardized="";
    address=address.trim().toLocaleLowerCase();
    for(let i=0;i<address.length;i++){
        if(address.charAt(i)===" "&&(address.charAt(i+1))===" "){
            continue;
        }
        if(i===0||address.charAt(i-1)===" "){
            addressStandardized+=address.charAt(i).toLocaleUpperCase();
            continue;
        }
        addressStandardized+=address.charAt(i);
    }
    document.getElementById("addressCustomer").value=addressStandardized;
    alert("Nhập địa chỉ khách hàng thành công");
    document.getElementById("addressCustomer").style.color = "blue";
}
//Kiểm tra thẻ khách hàng
function checktypeofCustomer() {
    document.getElementById("typeofCustomer").style.color = "blue";
}

//Kiểm tra tính hợp lệ Mã giảm giá
function checkdiscount(){
    let salecode=document.getElementById("discount").value;
    let checksalecode=true;
    while(checksalecode){
        if(!isNaN(salecode)){
            salecode=Number.parseFloat(salecode);
            if(Number.isInteger(salecode)&&salecode>0&&salecode<100&&salecode%10==0){
                checksalecode=false;
                alert("Nhập mã giảm giá thành công");
                document.getElementById("discount").style.color = "blue";
                break;
            }else{
                alert("Nhập số nguyên lớn hơn 0,nhỏ hơn 100 và chia hết cho 10");
                document.getElementById("discount").style.color = "black";
                break;
            }
        }else{
            alert("Vui lòng nhập số,không nhập chữ,ký tự lạ");
            document.getElementById("discount").style.color = "black";
            break;

        }
    }
}

//Kiểm tra tính hợp lệ số người đi kèm
function checkNumberofAccompanying() {
    let numberofAccompanying=document.getElementById("numberofAccompanying").value;
    let checknumberofAccompanying=true;
    while(checknumberofAccompanying){
        if(!isNaN(numberofAccompanying)){
            numberofAccompanying=Number.parseFloat(numberofAccompanying);
            if(Number.isInteger(numberofAccompanying)&&numberofAccompanying>=0&&numberofAccompanying<10){
                checknumberofAccompanying=false;
                alert("Nhập thành công");
                document.getElementById("numberofAccompanying").style.color = "blue";
                break;
            }else{
                alert("Nhập số nguyên lớn hơn hoặc bằng 0,nhỏ hơn 10");
                document.getElementById("numberofAccompanying").style.color = "black";
                break;
            }
        }else{
            alert("Vui lòng nhập số,không nhập chữ,ký tự lạ");
            document.getElementById("numberofAccompanying").style.color = "black";
            break;
        }
    }

}
//Kiểm tra tính hợp lệ Ngày thuê
function checkrentDays() {
    let rentDays = parseFloat(document.getElementById("rentDays").value);
    let checkrentDays = true;
    while (checkrentDays) {
        if (Number.isInteger(rentDays)){
            if (rentDays > 0 && rentDays < 365) {
                checkrentDays = false;
                alert("Nhập ngày thuê thành công");
                document.getElementById("rentDays").style.color = "blue";
                break;
            } else {
                alert("Nhập ngày thuê lớn hơn 0,nhỏ hơn 365");
                document.getElementById("rentDays").style.color = "black";
                break;
            }
        }else{
            alert("Nhập ngày thuê là số nguyên");
            document.getElementById("rentDays").style.color = "black";
            break;
        }
    }
}//Kiểm tra loại dịch vụ
function checktypeService() {
    document.getElementById("typeofService").style.color = "blue";
}

function hienthi1() {
    if(
        (document.getElementById("name").style.color = "blue")&&
        (document.getElementById("idcard").style.color = "blue")&&
        (document.getElementById("birthdayCustomer").style.color = "blue")&&
        (document.getElementById("idcard").style.color = "blue")&&
        (document.getElementById("idcard").style.color = "blue")&&
        (document.getElementById("idcard").style.color = "blue")&&
        (document.getElementById("idcard").style.color = "blue")&&
        (document.getElementById("idcard").style.color = "blue")&&
        (document.getElementById("idcard").style.color = "blue")&&
        (document.getElementById("idcard").style.color = "blue")&&


    )

        document.getElementById("name").style.color = "red";
    document.getElementById("name").disabled = "disabled";
    document.getElementById("idcard").style.color = "red";
    document.getElementById("idcard").disabled = "disabled";
    document.getElementById("birthdayCustomer").style.color = "red";
    document.getElementById("birthdayCustomer").disabled = "disabled";
    document.getElementById("emailCustomer").style.color = "red";
    document.getElementById("emailCustomer").disabled = "disabled";
    document.getElementById("addressCustomer").style.color = "red";
    document.getElementById("addressCustomer").disabled = "disabled";
    document.getElementById("typeCustomer").style.color = "red";
    document.getElementById("typeCustomer").disabled = "disabled";
    document.getElementById("discount").style.color = "red";
    document.getElementById("discount").disabled = "disabled";
    document.getElementById("numberofAccompanying").style.color = "red";
    document.getElementById("numberofAccompanying").disabled = "disabled";
    document.getElementById("rentDays").style.color = "red";
    document.getElementById("rentDays").disabled = "disabled";
    document.getElementById("typeService").style.color = "red";
    document.getElementById("typeService").disabled = "disabled";
    document.getElementById("1").style.color = "red";
    document.getElementById("2").style.color = "black";
    document.getElementById("3").style.color = "black";
    document.getElementById("3").value="Tiền thanh toán";
}
function hienthi2() {

    document.getElementById("name").style.color = "black";
    document.getElementById("name").disabled = "";
    document.getElementById("idcard").style.color = "black";
    document.getElementById("idcard").disabled =  "";
    document.getElementById("birthdayCustomer").style.color = "black";
    document.getElementById("birthdayCustomer").disabled =  "";
    document.getElementById("emailCustomer").style.color = "black";
    document.getElementById("emailCustomer").disabled =  "";
    document.getElementById("addressCustomer").style.color = "black";
    document.getElementById("addressCustomer").disabled =  "";
    document.getElementById("typeCustomer").style.color = "black";
    document.getElementById("typeCustomer").disabled =  "";
    document.getElementById("discount").style.color = "black";
    document.getElementById("discount").disabled =  "";
    document.getElementById("numberofAccompanying").style.color = "black";
    document.getElementById("numberofAccompanying").disabled =  "";
    document.getElementById("rentDays").style.color = "black";
    document.getElementById("rentDays").disabled = "";
    document.getElementById("typeService").style.color = "black";
    document.getElementById("typeService").disabled =  "";
    document.getElementById("1").style.color = "black";
    document.getElementById("2").style.color = "red";
    document.getElementById("3").style.color = "black";
    document.getElementById("3").value="Tiền thanh toán";
}

function hienthi3() {

    document.getElementById("name").style.color = "red";
    document.getElementById("name").disabled = "disabled";
    document.getElementById("idcard").style.color = "red";
    document.getElementById("idcard").disabled = "disabled";
    document.getElementById("birthdayCustomer").style.color = "red";
    document.getElementById("birthdayCustomer").disabled = "disabled";
    document.getElementById("emailCustomer").style.color = "red";
    document.getElementById("emailCustomer").disabled = "disabled";
    document.getElementById("addressCustomer").style.color = "red";
    document.getElementById("addressCustomer").disabled = "disabled";
    document.getElementById("typeCustomer").style.color = "red";
    document.getElementById("typeCustomer").disabled = "disabled";
    document.getElementById("discount").style.color = "red";
    document.getElementById("discount").disabled = "disabled";
    document.getElementById("numberofAccompanying").style.color = "red";
    document.getElementById("numberofAccompanying").disabled = "disabled";
    document.getElementById("rentDays").style.color = "red";
    document.getElementById("rentDays").disabled = "disabled";
    document.getElementById("typeService").style.color = "red";
    document.getElementById("typeService").disabled = "disabled";
    document.getElementById("1").style.color = "black";
    document.getElementById("2").style.color = "black";
    document.getElementById("3").style.color = "red";

    let typeService=document.getElementById('typeService').value;
    let addressCustomer=document.getElementById('addressCustomer').value;
    let typeCustomer=document.getElementById('typeCustomer').value;
    let rentDays=document.getElementById('rentDays').value;
    let discount=document.getElementById('discount').value;


    let priceservice;

    if (typeService === 'Villa') {
        priceservice = 500;
    } else if (typeService === 'House') {
        priceservice = 300;
    } else if (typeService === 'Room') {
        priceservice = 100;
    } else {
        priceservice = 50;
    }



    //Giam gia khach hang
    //Giam gia theo dia chi
    let saleaddress;
    if(addressCustomer=="Da Nang"){
        saleaddress=20;
    }else if(addressCustomer=='Hue'){
        saleaddress=10;
    }else if(addressCustomer=="Quang Nam"){
        saleaddress=5;
    }else {
        saleaddress=0;
    }

    //Giam gia theo loai the khach hang
    let saletypeCustomer;
    switch ( typeCustomer) {
        case('Diamond'):
            saletypeCustomer=15;
            break;
        case('Platium'):
            saletypeCustomer=10;
            break;
        case('Gold'):
            saletypeCustomer=5;
            break;
        case('Silver'):
            saletypeCustomer=2;
            break;
        case('Member'):
        default:
            saletypeCustomer=0;
            break;
    }
    //Giam gia theo do tuoi
    let currentYear=new Date().getFullYear();
    let birthday=new Date(birthdayCustomer).getFullYear();
    let ageCustomer;
    ageCustomer=currentYear-birthday;

    let saleageCustomer;
    if((ageCustomer>30) && (addressCustomer=="Da Nang")){
        saleageCustomer=2;
    }else if((ageCustomer<=30) && (ageCustomer>20) && (addressCustomer=="Da Nang")){
        saleageCustomer=1;
    }else{
        saleageCustomer=0;
    }

    let payments =  priceservice * rentDays * (1 - discount / 100)-(saleaddress+saletypeCustomer+saleageCustomer);
    document.getElementById("3").value=payments;



}