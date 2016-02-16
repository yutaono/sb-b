# sb-b
## subtree setting

```
git remote add shared git@github.com:yutaono/sb-s.git
git fetch shared
git subtree add --prefix=shared shared master --squash
```

## run

```
sbt 'project spin' 'run-main practice.spin.Main'
```