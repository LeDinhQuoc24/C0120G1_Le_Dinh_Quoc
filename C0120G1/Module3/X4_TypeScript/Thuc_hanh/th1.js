// function main() {
//     var x = 5;
//     console.log(x);
//     var x = 10;
//     console.log(x);
//
//     let y = 55;
//     console.log(y);
//
// }
/*
function main() {
  console.log(x);
  var x = 5;

  console.log(y);
  let y = 10;
}
 */
/**
 * Data types
 */
function main() {
    var message;
    var total = 100;
    var isProduction = true;
    var prices = [120, 88, 60];
    var languages = ['vi', 'en-us'];
    var now = new Date();
    var unknown;
    var Direction;
    (function (Direction) {
        Direction[Direction["UP"] = 0] = "UP";
        Direction[Direction["DOWN"] = 1] = "DOWN";
        Direction[Direction["LEFT"] = 2] = "LEFT";
        Direction[Direction["RIGHT"] = 3] = "RIGHT";
    })(Direction || (Direction = {}));
    ;
    function log(msg) {
        console.log(msg);
    }
    isProduction = false;
    unknown = Direction.UP;
    unknown = 'changed';
    var post = {
        id: "Lam",
        title: "1234"
    };
    message = "50";
    function getPost(postId) {
        // do something to retrieve post
        return {
            id: postId,
            title: 'Post Title',
            body: 'Post Body',
            extra: 'data'
        };
    }
}
console.log("IPost");
main();
