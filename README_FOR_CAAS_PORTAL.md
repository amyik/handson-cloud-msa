# Caas Portal

## 개발환경 설정
- docker-desktop설치
  - ingress-controller 설치
    ```
    $ kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/controller-v0.41.2/deploy/static/provider/cloud/deploy.yaml
    ```
- skaffold
  - windows : 소스코드에 포함된 실행파일(skaffold.exe) 이용 가능
  - 그외 : skaffold설치 ( https://skaffold.dev/docs/install/ ) 

## 실행하기
- cmd
  ``` bash
  $ skaffold dev
  $ ingress-nginx-controller port-forward...
  ```
  
  
- IntelliJ
  - 플러그인...
  
- Eclipse
  - 확인중...

### docker-compose 실행

서비스에서 저장소로 사용하는 postgreSQL과 redis를 docker-compose로 기동합니다. 

``` bash
$ docker-compose up -d
```

### 서비스 기동

#### backend

``` bash
$ cd eshop-backend
$ ./gradlew bootRun
```

#### frontend

``` bash
$ cd eshop-frontend
$ npm install
$ npm run serve
```
