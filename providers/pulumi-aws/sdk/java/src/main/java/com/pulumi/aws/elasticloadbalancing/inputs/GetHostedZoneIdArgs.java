// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancing.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHostedZoneIdArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHostedZoneIdArgs Empty = new GetHostedZoneIdArgs();

    /**
     * Name of the region whose AWS ELB HostedZoneId is desired.
     * Defaults to the region from the AWS provider configuration.
     * 
     */
    @Import(name="region")
      private final @Nullable String region;

    public Optional<String> region() {
        return this.region == null ? Optional.empty() : Optional.ofNullable(this.region);
    }

    public GetHostedZoneIdArgs(@Nullable String region) {
        this.region = region;
    }

    private GetHostedZoneIdArgs() {
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHostedZoneIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHostedZoneIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
        }

        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }        public GetHostedZoneIdArgs build() {
            return new GetHostedZoneIdArgs(region);
        }
    }
}
