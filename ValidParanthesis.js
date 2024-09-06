/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function (s) {
  ch = [];
  var top = -1;
  for (let i = 0; i < s.length; i++) {
    if (s[i] == "{" || s[i] == "(" || s[i] == "[") {
      ch.push(s[i]);
      top++;
    } else if (s[i] == "}" || s[i] == ")" || s[i] == "]") {
      if (top >= 0) {
        if (priority(s[i]) == priority(ch[top])) {
          ch.pop();
          top--;
        } else return false;
      } else {
        top++;
        break;
      }
    } else continue;
  }
  if (top == -1) return true;
  return false;
};
function priority(c) {
  if (c == "(" || c == ")") return 1;
  else if (c == "{" || c == "}") return 2;
  else if (c == "[" || "c==]") return 3;
}
