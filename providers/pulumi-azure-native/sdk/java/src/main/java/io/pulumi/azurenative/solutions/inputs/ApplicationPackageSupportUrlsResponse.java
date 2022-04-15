// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The appliance package support URLs.
 * 
 */
public final class ApplicationPackageSupportUrlsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationPackageSupportUrlsResponse Empty = new ApplicationPackageSupportUrlsResponse();

    /**
     * The government cloud support URL.
     * 
     */
    @Import(name="governmentCloud")
      private final @Nullable String governmentCloud;

    public Optional<String> governmentCloud() {
        return this.governmentCloud == null ? Optional.empty() : Optional.ofNullable(this.governmentCloud);
    }

    /**
     * The public azure support URL.
     * 
     */
    @Import(name="publicAzure")
      private final @Nullable String publicAzure;

    public Optional<String> publicAzure() {
        return this.publicAzure == null ? Optional.empty() : Optional.ofNullable(this.publicAzure);
    }

    public ApplicationPackageSupportUrlsResponse(
        @Nullable String governmentCloud,
        @Nullable String publicAzure) {
        this.governmentCloud = governmentCloud;
        this.publicAzure = publicAzure;
    }

    private ApplicationPackageSupportUrlsResponse() {
        this.governmentCloud = null;
        this.publicAzure = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationPackageSupportUrlsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String governmentCloud;
        private @Nullable String publicAzure;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationPackageSupportUrlsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.governmentCloud = defaults.governmentCloud;
    	      this.publicAzure = defaults.publicAzure;
        }

        public Builder governmentCloud(@Nullable String governmentCloud) {
            this.governmentCloud = governmentCloud;
            return this;
        }
        public Builder publicAzure(@Nullable String publicAzure) {
            this.publicAzure = publicAzure;
            return this;
        }        public ApplicationPackageSupportUrlsResponse build() {
            return new ApplicationPackageSupportUrlsResponse(governmentCloud, publicAzure);
        }
    }
}
