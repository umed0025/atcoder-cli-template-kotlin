# 概要

* atcoder-cli用、kotlinテンプレートファイル

# 適用方法

* `acc config-dir`で表示されたパスに配置してください。
* `acc templates`で以下の様に表示されていれば配置成功です。

```
search template directories in {config-dir}
NAME    SUBMIT-PROGRAM
kotlin  src/main/kotlin/Main.kt
```

# 使用方法

## コンテストスケルトン生成

* a100を新規生成

```
acc new a100 --template kotlin
```

出力結果例

```
practice
└─a
    │  build.gradle.kts
    │  gradle.properties
    │  settings.gradle.kts
    │
    ├─src
    │  └─main
    │      └─kotlin
    │              Main.kt
    │
    └─tests
            sample-1.in
            sample-1.out
            sample-2.in
            sample-2.out
```

## テスト方法

```
cd {contest}/{task}
gradle ojTest
```

出力結果例

```

> gradle ojtest

> Task :ojTest
[INFO] online-judge-tools 11.5.1 (+ online-judge-api-client 10.10.0)
[INFO] 2 cases found
[WARNING] GNU time is not available: time

[INFO] sample-1
[INFO] time: 0.138518 sec
[SUCCESS] AC

[INFO] sample-2
[INFO] time: 0.125220 sec
[SUCCESS] AC

[INFO] slowest: 0.138518 sec  (for sample-1)
[SUCCESS] test success: 2 cases

BUILD SUCCESSFUL in 3s
3 actionable tasks: 3 executed
```

# 便利設定

* プロジェクト生成の際のデフォルト値を`kotlin`にする。

```
acc config default-template
```

# 確認済み環境情報

```
> code -v
1.69.1
b06ae3b2d2dbfe28bca3134cc6be65935cdfea6a
x64
> python -V
Python 3.10.5
> node -v
v16.15.1
> oj --version
online-judge-tools 11.5.1 (+ online-judge-api-client 10.10.0)
> acc -v
2.2.0
> java -version
openjdk version "11.0.2" 2019-01-15
OpenJDK Runtime Environment 18.9 (build 11.0.2+9)
OpenJDK 64-Bit Server VM 18.9 (build 11.0.2+9, mixed mode)
> kotlin -version
Kotlin version 1.7.10-release-333 (JRE 11.0.2+9)
```
