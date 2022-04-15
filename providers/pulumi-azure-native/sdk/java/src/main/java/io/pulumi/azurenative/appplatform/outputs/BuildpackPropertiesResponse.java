// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BuildpackPropertiesResponse {
    /**
     * Id of the buildpack
     * 
     */
    private final @Nullable String id;

    @CustomType.Constructor
    private BuildpackPropertiesResponse(@CustomType.Parameter("id") @Nullable String id) {
        this.id = id;
    }

    /**
     * Id of the buildpack
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildpackPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildpackPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }        public BuildpackPropertiesResponse build() {
            return new BuildpackPropertiesResponse(id);
        }
    }
}
