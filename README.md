# petapi
OpenAPI Generatorを使用したサンプルSpring Bootアプリケーション
このリポジトリには、OpenAPI Generatorを使用して生成されたサンプルSpring Bootアプリケーションが含まれています。このアプリケーションはJava 17で構築されており、OpenAPI 3の仕様ファイル`petstore.yml`をサンプルとして使用しています。

## 前提条件

- Docker
- Java 17
- Gradle

## プロジェクト構成

- `src/main/java`: Javaのソースコード
- `src/main/resources`: アプリケーションの設定ファイル
- `petstore.yml`: OpenAPI 3の仕様ファイル
- `build/openapi/gen-src/main/java`: openapi-generator-cliで生成したコード出力先。sourceSetとして追加している

## OpenAPI Generatorを使用したコード生成

コード生成は、OpenAPI Generator CLIのDockerイメージを使用して行います。以下の手順に従ってコードを生成します。

### ステップ1: Dockerイメージを取得

最新のOpenAPI Generator CLI Dockerイメージを取得します:

```sh
docker pull openapitools/openapi-generator-cli
```

### ステップ2: コード生成

```shell
sh pet-api-generate.sh
```

## ビルド

```shell
./gradlew build
```

## SpringBoot起動

```shell
./gradle bootRun
```

## シナリオ実行
SpringBootを起動した状態で以下を実行。

```shell
runn run petapi-test.yml
```
