// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a overridable value that can be passed to a task template.
 * 
 */
public final class SetValueResponse extends com.pulumi.resources.InvokeArgs {

    public static final SetValueResponse Empty = new SetValueResponse();

    /**
     * Flag to indicate whether the value represents a secret or not.
     * 
     */
    @Import(name="isSecret")
      private final @Nullable Boolean isSecret;

    public Optional<Boolean> isSecret() {
        return this.isSecret == null ? Optional.empty() : Optional.ofNullable(this.isSecret);
    }

    /**
     * The name of the overridable value.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The overridable value.
     * 
     */
    @Import(name="value", required=true)
      private final String value;

    public String value() {
        return this.value;
    }

    public SetValueResponse(
        @Nullable Boolean isSecret,
        String name,
        String value) {
        this.isSecret = isSecret == null ? false : isSecret;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private SetValueResponse() {
        this.isSecret = null;
        this.name = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SetValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isSecret;
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(SetValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isSecret = defaults.isSecret;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder isSecret(@Nullable Boolean isSecret) {
            this.isSecret = isSecret;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public SetValueResponse build() {
            return new SetValueResponse(isSecret, name, value);
        }
    }
}
