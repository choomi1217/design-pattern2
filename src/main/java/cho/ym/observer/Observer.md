# 2. Observer Pattern
- 객체 사이에 일대다 의존 관계를 정의해두어, 어떤 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들이 자동으로 알림을 받고 자동으로 갱신되도록 만든다.
- 하나의 주제를 구독하는 여러개의 옵저버들

### push 방식, pull 방식 
- push 방식: 주제 객체가 옵저버에게 데이터를 보내는 방식
- pull 방식: 주제 객체가 옵저버에게 데이터를 요청하는 방식


