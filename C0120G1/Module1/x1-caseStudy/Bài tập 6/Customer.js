let Customer=function () {
    this.setNameCustomer=function (name) {
        this.nameCustomer=name;
    };
    this.getNameCustomer=function () {
        return this.nameCustomer;
    };
    this.setAddressCustomer=function (addressCustomer) {
        this.addressCustomer=addressCustomer;
    };
    this.getAddressCustomer=function () {
        return this.addressCustomer;
    };
    this.setBirthdayCustomer=function (birthdayCustomer) {
        this.birthdayCustomer=birthdayCustomer;
    };
    this.getBirthdayCustomer=function () {
        return this.birthdayCustomer;
    };
    this.setEmailCustomer=function(emailCustomer) {
        this.emailCustomer=emailCustomer;
    };
    this.getEmailCustomer=function () {
        return this.emailCustomer;
    };
    this.setIDCustomer=function (iDCustomer) {
        this.iDCustomer=iDCustomer;
    };
    this.getIDCustomer=function () {
        return this.iDCustomer;
    };
    this.setTypeCustomer=function (typeCustomer) {
        this.typeCustomer=typeCustomer;
    };
    this.getTypeCustomer=function () {
        return this.typeCustomer;
    };
    this.setRentDay=function (rentDay) {
        this.rentDay=rentDay;
    };
    this.getRentDay=function () {
        return this.rentDay;
    };
    this.setDiscount=function (discount) {
        this.discount=discount;
    };
    this.getDiscount=function () {
        return this.discount;
    };
    this.setTypeService=function (typeService) {
        this.typeService=typeService;
    };
    this.getTypeService=function () {
        return this.typeService;
    };
    this.totalPays=function () {
        let moneyPerDays=0;
        if (this.getTypeService() === "Villa") {
            moneyPerDays=500;
        }else if(this.getTypeService() === "House"){
            moneyPerDays=300;
        }else {
            moneyPerDays=100;
        }
        return moneyPerDays * parseFloat(this.getRentDay()) * (1 - parseFloat(this.getDiscount())/100);
    }
};