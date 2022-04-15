// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines an Aml Instance application and its connectivity endpoint URI.
 * 
 */
public final class ComputeInstanceApplicationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ComputeInstanceApplicationResponse Empty = new ComputeInstanceApplicationResponse();

    /**
     * Name of the ComputeInstance application.
     * 
     */
    @Import(name="displayName")
      private final @Nullable String displayName;

    public Optional<String> displayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * Application' endpoint URI.
     * 
     */
    @Import(name="endpointUri")
      private final @Nullable String endpointUri;

    public Optional<String> endpointUri() {
        return this.endpointUri == null ? Optional.empty() : Optional.ofNullable(this.endpointUri);
    }

    public ComputeInstanceApplicationResponse(
        @Nullable String displayName,
        @Nullable String endpointUri) {
        this.displayName = displayName;
        this.endpointUri = endpointUri;
    }

    private ComputeInstanceApplicationResponse() {
        this.displayName = null;
        this.endpointUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeInstanceApplicationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable String endpointUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeInstanceApplicationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.endpointUri = defaults.endpointUri;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder endpointUri(@Nullable String endpointUri) {
            this.endpointUri = endpointUri;
            return this;
        }        public ComputeInstanceApplicationResponse build() {
            return new ComputeInstanceApplicationResponse(displayName, endpointUri);
        }
    }
}
