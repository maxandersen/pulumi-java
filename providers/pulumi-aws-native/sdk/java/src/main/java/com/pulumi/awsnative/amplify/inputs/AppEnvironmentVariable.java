// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.amplify.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AppEnvironmentVariable extends com.pulumi.resources.InvokeArgs {

    public static final AppEnvironmentVariable Empty = new AppEnvironmentVariable();

    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    @Import(name="value", required=true)
      private final String value;

    public String value() {
        return this.value;
    }

    public AppEnvironmentVariable(
        String name,
        String value) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private AppEnvironmentVariable() {
        this.name = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppEnvironmentVariable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(AppEnvironmentVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public AppEnvironmentVariable build() {
            return new AppEnvironmentVariable(name, value);
        }
    }
}
