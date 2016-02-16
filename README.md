# sb-b
## subtree setting

```
git remote add shared git@github.com:yutaono/sb-s.git
git fetch shared
git subtree add --prefix=shared shared master --squash
```

## subtree pull & push

```
git subtree pull --prefix=shared shared master --squash
git subtree push --prefix=shared shared BRANCH_NAME
```

## run

```
sbt 'project spin' 'run-main practice.spin.Main'
```