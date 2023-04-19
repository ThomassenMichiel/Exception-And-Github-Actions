# Exception and GitHub Actions example

## ApiError

`ApiError.class` is the 'base class' to return for most general exceptions.
`ValidationError.class` and `ValidationFieldError.class` is specific to validation errors.

We have a 'base' `CustomException.class` that gets extended by just about every exception we want to handle. This means 
it won't be used for actual Java exceptions.

From here, we can extend this by e.g. a `NotFoundException.class`, which will be our second base class, specific to 
anything that's not been found. You can create your own types if you need them. You can add e.g. 
`AccessDeniedException.class` to handle your own response to this.

Finally, we create our own specific example of an exception. Taking `UserNotFoundException.class`, this will be the only
response that should be thrown when a user has not been found in our system.

The exception title and message will finally be put into an `ApiError.class` upon which it will be returned by Spring to
our API users.

All exceptions are handled by the `ControllerExceptionAdvice.class`, with different methods and/or overrides for many 
types of exceptions.

---

## ValidationError

This is largely the same, except that we have to override `handleMethodArgumentNotValid` and extract the validation 
errors.

The implementation should be straightforward so I will not explicitely explain it here.

---

## GitHub Actions

We're mainly interested in running a build whenever a PullRequest has been created on our main/master branch.

We have to declare our jobs and builds. For every build there are a few given steps. 2 of those the `check-out` the code
from our PR, followed by installing Java on our runner. On the last line, we tell maven to run our code with 
`package verify`.

For the settings that GitHub needs, I'll refer to the screenshot below. The 
`Require status checks to pass before merging` and `Require branches to be up to date before merging` are important 
here.

![Alt text](/branch_protection_rule.png?raw=true "Optional Title")
