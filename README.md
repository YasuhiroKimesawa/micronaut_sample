# SpringCloudFunction Sample

# TODO
- [] ServerlessFrameworkを使用し、単純なレスポンスを返す.Lambdaがデプロイ・実行可能になる
- [] API GatewayからLambdaを実行可能になる/Cognito利用
- [] DynamoDBにデータを保存し、取り出せる
- [] SQSにキューイング、Cloudwatchからバッチ起動し、デキューする
- [] CQRSの実装・ESを使用する
- [] RDBの利用
- [] マイクロサービス化

# モデルの想定
・時間を記録する（Write)、修正する（Read/Write)
・集計する（Read)
・自動で記録する（Write/Batch)
・タグを記録する（Write）
・タグごとに集計する。平均。（MicroService/Read)
