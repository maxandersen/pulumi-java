// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Access profile for managed cluster API server.
 * 
 */
public final class ManagedClusterAPIServerAccessProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagedClusterAPIServerAccessProfileResponse Empty = new ManagedClusterAPIServerAccessProfileResponse();

    /**
     * Authorized IP Ranges to kubernetes API server.
     * 
     */
    @Import(name="authorizedIPRanges")
      private final @Nullable List<String> authorizedIPRanges;

    public List<String> authorizedIPRanges() {
        return this.authorizedIPRanges == null ? List.of() : this.authorizedIPRanges;
    }

    /**
     * Whether to create the cluster as a private cluster or not.
     * 
     */
    @Import(name="enablePrivateCluster")
      private final @Nullable Boolean enablePrivateCluster;

    public Optional<Boolean> enablePrivateCluster() {
        return this.enablePrivateCluster == null ? Optional.empty() : Optional.ofNullable(this.enablePrivateCluster);
    }

    /**
     * Private dns zone mode for private cluster.
     * 
     */
    @Import(name="privateDNSZone")
      private final @Nullable String privateDNSZone;

    public Optional<String> privateDNSZone() {
        return this.privateDNSZone == null ? Optional.empty() : Optional.ofNullable(this.privateDNSZone);
    }

    public ManagedClusterAPIServerAccessProfileResponse(
        @Nullable List<String> authorizedIPRanges,
        @Nullable Boolean enablePrivateCluster,
        @Nullable String privateDNSZone) {
        this.authorizedIPRanges = authorizedIPRanges;
        this.enablePrivateCluster = enablePrivateCluster;
        this.privateDNSZone = privateDNSZone;
    }

    private ManagedClusterAPIServerAccessProfileResponse() {
        this.authorizedIPRanges = List.of();
        this.enablePrivateCluster = null;
        this.privateDNSZone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterAPIServerAccessProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> authorizedIPRanges;
        private @Nullable Boolean enablePrivateCluster;
        private @Nullable String privateDNSZone;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterAPIServerAccessProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedIPRanges = defaults.authorizedIPRanges;
    	      this.enablePrivateCluster = defaults.enablePrivateCluster;
    	      this.privateDNSZone = defaults.privateDNSZone;
        }

        public Builder authorizedIPRanges(@Nullable List<String> authorizedIPRanges) {
            this.authorizedIPRanges = authorizedIPRanges;
            return this;
        }
        public Builder authorizedIPRanges(String... authorizedIPRanges) {
            return authorizedIPRanges(List.of(authorizedIPRanges));
        }
        public Builder enablePrivateCluster(@Nullable Boolean enablePrivateCluster) {
            this.enablePrivateCluster = enablePrivateCluster;
            return this;
        }
        public Builder privateDNSZone(@Nullable String privateDNSZone) {
            this.privateDNSZone = privateDNSZone;
            return this;
        }        public ManagedClusterAPIServerAccessProfileResponse build() {
            return new ManagedClusterAPIServerAccessProfileResponse(authorizedIPRanges, enablePrivateCluster, privateDNSZone);
        }
    }
}
