// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.example;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.example.inputs.Foo;
import com.pulumi.example.inputs.FooArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ComponentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ComponentArgs Empty = new ComponentArgs();

    @Import(name="a", required=true)
      private final Boolean a;

    public Boolean a() {
        return this.a;
    }

    @Import(name="b")
      private final @Nullable Boolean b;

    public Optional<Boolean> b() {
        return this.b == null ? Optional.empty() : Optional.ofNullable(this.b);
    }

    @Import(name="bar")
      private final @Nullable Foo bar;

    public Optional<Foo> bar() {
        return this.bar == null ? Optional.empty() : Optional.ofNullable(this.bar);
    }

    @Import(name="baz")
      private final @Nullable List<Foo> baz;

    public List<Foo> baz() {
        return this.baz == null ? List.of() : this.baz;
    }

    @Import(name="bazMap")
      private final @Nullable Map<String,Foo> bazMap;

    public Map<String,Foo> bazMap() {
        return this.bazMap == null ? Map.of() : this.bazMap;
    }

    @Import(name="c", required=true)
      private final Integer c;

    public Integer c() {
        return this.c;
    }

    @Import(name="d")
      private final @Nullable Integer d;

    public Optional<Integer> d() {
        return this.d == null ? Optional.empty() : Optional.ofNullable(this.d);
    }

    @Import(name="e", required=true)
      private final String e;

    public String e() {
        return this.e;
    }

    @Import(name="f")
      private final @Nullable String f;

    public Optional<String> f() {
        return this.f == null ? Optional.empty() : Optional.ofNullable(this.f);
    }

    @Import(name="foo")
      private final @Nullable Output<FooArgs> foo;

    public Output<FooArgs> foo() {
        return this.foo == null ? Codegen.empty() : this.foo;
    }

    public ComponentArgs(
        Boolean a,
        @Nullable Boolean b,
        @Nullable Foo bar,
        @Nullable List<Foo> baz,
        @Nullable Map<String,Foo> bazMap,
        Integer c,
        @Nullable Integer d,
        String e,
        @Nullable String f,
        @Nullable Output<FooArgs> foo) {
        this.a = Objects.requireNonNull(a, "expected parameter 'a' to be non-null");
        this.b = b;
        this.bar = bar;
        this.baz = baz;
        this.bazMap = bazMap;
        this.c = Objects.requireNonNull(c, "expected parameter 'c' to be non-null");
        this.d = d;
        this.e = Objects.requireNonNull(e, "expected parameter 'e' to be non-null");
        this.f = f;
        this.foo = foo;
    }

    private ComponentArgs() {
        this.a = null;
        this.b = null;
        this.bar = null;
        this.baz = List.of();
        this.bazMap = Map.of();
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.foo = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean a;
        private @Nullable Boolean b;
        private @Nullable Foo bar;
        private @Nullable List<Foo> baz;
        private @Nullable Map<String,Foo> bazMap;
        private Integer c;
        private @Nullable Integer d;
        private String e;
        private @Nullable String f;
        private @Nullable Output<FooArgs> foo;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.a = defaults.a;
    	      this.b = defaults.b;
    	      this.bar = defaults.bar;
    	      this.baz = defaults.baz;
    	      this.bazMap = defaults.bazMap;
    	      this.c = defaults.c;
    	      this.d = defaults.d;
    	      this.e = defaults.e;
    	      this.f = defaults.f;
    	      this.foo = defaults.foo;
        }

        public Builder a(Boolean a) {
            this.a = Objects.requireNonNull(a);
            return this;
        }
        public Builder b(@Nullable Boolean b) {
            this.b = b;
            return this;
        }
        public Builder bar(@Nullable Foo bar) {
            this.bar = bar;
            return this;
        }
        public Builder baz(@Nullable List<Foo> baz) {
            this.baz = baz;
            return this;
        }
        public Builder baz(Foo... baz) {
            return baz(List.of(baz));
        }
        public Builder bazMap(@Nullable Map<String,Foo> bazMap) {
            this.bazMap = bazMap;
            return this;
        }
        public Builder c(Integer c) {
            this.c = Objects.requireNonNull(c);
            return this;
        }
        public Builder d(@Nullable Integer d) {
            this.d = d;
            return this;
        }
        public Builder e(String e) {
            this.e = Objects.requireNonNull(e);
            return this;
        }
        public Builder f(@Nullable String f) {
            this.f = f;
            return this;
        }
        public Builder foo(@Nullable Output<FooArgs> foo) {
            this.foo = foo;
            return this;
        }
        public Builder foo(@Nullable FooArgs foo) {
            this.foo = Codegen.ofNullable(foo);
            return this;
        }        public ComponentArgs build() {
            return new ComponentArgs(a, b, bar, baz, bazMap, c, d, e, f, foo);
        }
    }
}
