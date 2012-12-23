# language: ja
フィーチャ: タスク管理
  タスク管理を簡単にするためにタスクをweb上で管理したい

  シナリオ: タスクの追加と削除について

    前提 データベースを初期化
    もし 私がトップページに行く
    ならば 私は"0 task"をみれるべき
    もし 私が"label"に"昼食後に昼寝"を入力
    かつ 私が"create"を押す
    ならば 私は"1 task"をみれるべき
    かつ 私はトップページにいるべき
    かつ 私は"昼食後に昼寝"をみれるべき
    もし 私が"delete"を押す
    ならば 私は"0 task"をみれるべき
    かつ 私は"昼食後に昼寝"をみれないべき
