var isAnagram = function (test, original) {
    if (test.length !== original.length) {
        return false;
    }

    test = test.toUpperCase();
    original = original.toUpperCase();
    const originalSplit = original.split('');

    let result = true;
    for (const letter of originalSplit) {
        const letterCountInTest = (test.match(new RegExp(letter, "g")) || []).length;
        const letterCountInOriginal = (original.match(new RegExp(letter, "g")) || []).length

        if (letterCountInTest !== letterCountInOriginal) {
            result = false;
            break;
        }
    }
    return result;
};

var isAnagramSortSolution = function (test, original) {
    return test.toLowerCase().split("").sort().join("") === original.toLowerCase().split("").sort().join("");
}

console.log(isAnagram("dumble", "bumble"))
console.log(isAnagramSortSolution("dumble", "bumble"))