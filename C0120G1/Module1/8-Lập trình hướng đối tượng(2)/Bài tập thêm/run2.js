let arrCandidate=[];
displayMenu();
function displayMenu() {
    let choose=prompt("lựa chọn tính năng "+
    "\n1.Thêm thông tin thí sinh."+
    "\n2.Hiển thị thí sinh tổng điểm trên 15.");
    switch (choose) {
        case "1":
            addInfomationCandidate();
            break;
        case "2":
            displayTestCandidate();
            break;
        default:
            alert("nhập lỗi");
    }
}
function addInfomationCandidate() {
    let candidate=new Candidate();
    candidate.setName(prompt("nhập tên thí sinh"));
    candidate.setId(prompt("nhập mã số thí sinh"));
    candidate.setBirthDate(prompt("nhập ngày tháng năm sinh"));
    candidate.setTestScores1(prompt("nhập điểm thi môn Toán"));
    candidate.setTestScores2(prompt("nhập điểm thi môn Văn"));
    candidate.setTestScores3(prompt("nhập điểm thi môn Anh"));
    arrCandidate.push(candidate);
    displayMenu();
}
function displayTestCandidate() {
    let ketqua="";
    for(let i=0;i<arrCandidate.length;i++){
        if(arrCandidate[i].getTongDiem()>15){
           ketqua+="\n"+arrCandidate[i].getName();
        }
    }
    alert("Thí sinh có tổng điểm lớn hơn 15 là: "+ ketqua);
    displayMenu();

}