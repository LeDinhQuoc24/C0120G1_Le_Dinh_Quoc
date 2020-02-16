
let Candidate=function(){
    this.setId=function (id) {
        this.id=id;
    };
    this.getId=function () {
        return this.id;
    };
    this.setName=function (name) {
        this.name=name;
    };
    this.getName=function () {
        return this.name;
    };
    this.setBirthDate=function (birthDate) {
        this.birthDate=birthDate;
    };
    this.getBirthDate=function () {
        return this.birthDate;
    };
    this.setTestScores1=function (testscores1) {
        this.testscores1=testscores1;
    };
    this.getTestScores1=function () {
        return this.testscores1;
    };
    this.setTestScores2=function (testscores2) {
        this.testscores2=testscores2;
    };
    this.getTestScores2=function () {
        return this.testscores2;
    };
    this.setTestScores3=function (testscores3) {
        this.testscores3=testscores3;
    };
    this.getTestScores3=function () {
        return this.testscores3;
    };
    this.getTongDiem=function () {
        return this.getTestScores1()+this.getTestScores2()+this.getTestScores3();
    };
};