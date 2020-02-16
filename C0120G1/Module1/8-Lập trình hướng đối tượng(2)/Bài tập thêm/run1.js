function congphanso() {

    let phanSo1 = new PhanSo();
    let phanSo2 = new PhanSo();
    phanSo1.setTuSo(parseInt(document.getElementById("tu1").value));
    phanSo2.setTuSo(parseInt(document.getElementById("tu2").value));
    phanSo1.setMauSo(parseInt(document.getElementById("mau1").value));
    phanSo2.setMauSo(parseInt(document.getElementById("mau2").value));
    let tu1=phanSo1.getTuSo();
    let tu2=phanSo2.getTuSo();
    let mau1=phanSo1.getMauSo();
    let mau2=phanSo2.getMauSo();
    ketqua = (tu1*mau2+tu2*mau1)/(mau1*mau2);
    document.getElementById("ketquacong").innerText=ketqua;
}
function truphanso() {

    let phanSo1 = new PhanSo();
    let phanSo2 = new PhanSo();
    phanSo1.setTuSo(parseInt(document.getElementById("tu1").value));
    phanSo2.setTuSo(parseInt(document.getElementById("tu2").value));
    phanSo1.setMauSo(parseInt(document.getElementById("mau1").value));
    phanSo2.setMauSo(parseInt(document.getElementById("mau2").value));
    let tu1=phanSo1.getTuSo();
    let tu2=phanSo2.getTuSo();
    let mau1=phanSo1.getMauSo();
    let mau2=phanSo2.getMauSo();
    ketqua = (tu1*mau2-tu2*mau1)/(mau1*mau2);
    document.getElementById("ketquatru").innerText=ketqua;
}
function nhanphanso() {

    let phanSo1 = new PhanSo();
    let phanSo2 = new PhanSo();
    phanSo1.setTuSo(parseInt(document.getElementById("tu1").value));
    phanSo2.setTuSo(parseInt(document.getElementById("tu2").value));
    phanSo1.setMauSo(parseInt(document.getElementById("mau1").value));
    phanSo2.setMauSo(parseInt(document.getElementById("mau2").value));
    let tu1=phanSo1.getTuSo();
    let tu2=phanSo2.getTuSo();
    let mau1=phanSo1.getMauSo();
    let mau2=phanSo2.getMauSo();
    ketqua = (tu1*tu2)/(mau1*mau2);
    document.getElementById("ketquanhan").innerText=ketqua;
}
function chiaphanso() {

    let phanSo1 = new PhanSo();
    let phanSo2 = new PhanSo();
    phanSo1.setTuSo(parseInt(document.getElementById("tu1").value));
    phanSo2.setTuSo(parseInt(document.getElementById("tu2").value));
    phanSo1.setMauSo(parseInt(document.getElementById("mau1").value));
    phanSo2.setMauSo(parseInt(document.getElementById("mau2").value));
    let tu1=phanSo1.getTuSo();
    let tu2=phanSo2.getTuSo();
    let mau1=phanSo1.getMauSo();
    let mau2=phanSo2.getMauSo();
    ketqua = (tu1*mau2)/(tu2*mau1);
    document.getElementById("ketquachia").innerText=ketqua;
}