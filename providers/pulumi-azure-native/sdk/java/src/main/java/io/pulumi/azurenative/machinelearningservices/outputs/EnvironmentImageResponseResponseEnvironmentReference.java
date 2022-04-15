// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnvironmentImageResponseResponseEnvironmentReference {
    /**
     * Name of the environment.
     * 
     */
    private final @Nullable String name;
    /**
     * Version of the environment.
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private EnvironmentImageResponseResponseEnvironmentReference(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("version") @Nullable String version) {
        this.name = name;
        this.version = version;
    }

    /**
     * Name of the environment.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Version of the environment.
     * 
    */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentImageResponseResponseEnvironmentReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentImageResponseResponseEnvironmentReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public EnvironmentImageResponseResponseEnvironmentReference build() {
            return new EnvironmentImageResponseResponseEnvironmentReference(name, version);
        }
    }
}
