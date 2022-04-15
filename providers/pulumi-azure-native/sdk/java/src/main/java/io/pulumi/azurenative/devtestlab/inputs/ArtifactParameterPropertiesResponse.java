// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of an artifact parameter.
 * 
 */
public final class ArtifactParameterPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ArtifactParameterPropertiesResponse Empty = new ArtifactParameterPropertiesResponse();

    /**
     * The name of the artifact parameter.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The value of the artifact parameter.
     * 
     */
    @Import(name="value")
      private final @Nullable String value;

    public Optional<String> value() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public ArtifactParameterPropertiesResponse(
        @Nullable String name,
        @Nullable String value) {
        this.name = name;
        this.value = value;
    }

    private ArtifactParameterPropertiesResponse() {
        this.name = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArtifactParameterPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ArtifactParameterPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public ArtifactParameterPropertiesResponse build() {
            return new ArtifactParameterPropertiesResponse(name, value);
        }
    }
}
