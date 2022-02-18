// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecretKeySelector {
    /**
     * The key of the secret to select from.  Must be a valid secret key.
     * 
     */
    private final String key;
    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    private final @Nullable String name;
    /**
     * Specify whether the Secret or its key must be defined
     * 
     */
    private final @Nullable Boolean optional;

    @OutputCustomType.Constructor({"key","name","optional"})
    private SecretKeySelector(
        String key,
        @Nullable String name,
        @Nullable Boolean optional) {
        this.key = Objects.requireNonNull(key);
        this.name = name;
        this.optional = optional;
    }

    /**
     * The key of the secret to select from.  Must be a valid secret key.
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Specify whether the Secret or its key must be defined
     * 
     */
    public Optional<Boolean> getOptional() {
        return Optional.ofNullable(this.optional);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretKeySelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private @Nullable String name;
        private @Nullable Boolean optional;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretKeySelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setOptional(@Nullable Boolean optional) {
            this.optional = optional;
            return this;
        }

        public SecretKeySelector build() {
            return new SecretKeySelector(key, name, optional);
        }
    }
}
