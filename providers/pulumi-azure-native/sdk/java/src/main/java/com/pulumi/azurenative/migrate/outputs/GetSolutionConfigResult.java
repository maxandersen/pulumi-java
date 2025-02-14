// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSolutionConfigResult {
    /**
     * @return Gets or sets the publisher sas uri for the solution.
     * 
     */
    private final @Nullable String publisherSasUri;

    @CustomType.Constructor
    private GetSolutionConfigResult(@CustomType.Parameter("publisherSasUri") @Nullable String publisherSasUri) {
        this.publisherSasUri = publisherSasUri;
    }

    /**
     * @return Gets or sets the publisher sas uri for the solution.
     * 
     */
    public Optional<String> publisherSasUri() {
        return Optional.ofNullable(this.publisherSasUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSolutionConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String publisherSasUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSolutionConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publisherSasUri = defaults.publisherSasUri;
        }

        public Builder publisherSasUri(@Nullable String publisherSasUri) {
            this.publisherSasUri = publisherSasUri;
            return this;
        }        public GetSolutionConfigResult build() {
            return new GetSolutionConfigResult(publisherSasUri);
        }
    }
}
