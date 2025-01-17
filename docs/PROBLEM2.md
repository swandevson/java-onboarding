## 🚀 기능 요구 사항

암호문을 좋아하는 괴짜 개발자 브라운이 이번에는 중복 문자를 이용한 새로운 암호를 만들었다. 예를 들어 "browoanoommnaon"이라는 암호문은 다음과 같은 순서로 해독할 수 있다.

1. "browoanoommnaon"
2. "browoannaon"
3. "browoaaon"
4. "browoon"
5. "brown"

임의의 문자열 cryptogram이 매개변수로 주어질 때, 연속하는 중복 문자들을 삭제한 결과를 return 하도록 solution 메서드를 완성하라.

### 제한사항

- cryptogram은 길이가 1 이상 1000 이하인 문자열이다.
- cryptogram은 알파벳 소문자로만 이루어져 있다.

### 실행 결과 예시

| cryptogram | result |
| --- | --- |
| "browoanoommnaon" | "brown" |
| "zyelleyz" | "" |

---
## 기능 구현
1. 처음부터 끝까지 문자열의 문자를 확인한다.
2. 현재 인덱스와 다음 인덱스의 문자를 비교하여 연속되는지 체크한다.
3. 연속될 경우, 해당 문자를 제거하고 암호문의 길이를 제거한 길이로 변경한다.
4. 해독 후와 해독 전 메세지와 다를 경우 1~3 과정을 반복한다.
5. 같을 경우 암호 해독 완료