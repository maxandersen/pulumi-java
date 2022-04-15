// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a sub PublicDelegatedPrefix.
 * 
 */
public final class PublicDelegatedPrefixPublicDelegatedSubPrefixResponse extends io.pulumi.resources.InvokeArgs {

    public static final PublicDelegatedPrefixPublicDelegatedSubPrefixResponse Empty = new PublicDelegatedPrefixPublicDelegatedSubPrefixResponse();

    /**
     * Name of the project scoping this PublicDelegatedSubPrefix.
     * 
     */
    @Import(name="delegateeProject", required=true)
      private final String delegateeProject;

    public String delegateeProject() {
        return this.delegateeProject;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    /**
     * The IPv4 address range, in CIDR format, represented by this sub public delegated prefix.
     * 
     */
    @Import(name="ipCidrRange", required=true)
      private final String ipCidrRange;

    public String ipCidrRange() {
        return this.ipCidrRange;
    }

    /**
     * Whether the sub prefix is delegated to create Address resources in the delegatee project.
     * 
     */
    @Import(name="isAddress", required=true)
      private final Boolean isAddress;

    public Boolean isAddress() {
        return this.isAddress;
    }

    /**
     * The name of the sub public delegated prefix.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The region of the sub public delegated prefix if it is regional. If absent, the sub prefix is global.
     * 
     */
    @Import(name="region", required=true)
      private final String region;

    public String region() {
        return this.region;
    }

    /**
     * The status of the sub public delegated prefix.
     * 
     */
    @Import(name="status", required=true)
      private final String status;

    public String status() {
        return this.status;
    }

    public PublicDelegatedPrefixPublicDelegatedSubPrefixResponse(
        String delegateeProject,
        String description,
        String ipCidrRange,
        Boolean isAddress,
        String name,
        String region,
        String status) {
        this.delegateeProject = Objects.requireNonNull(delegateeProject, "expected parameter 'delegateeProject' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.ipCidrRange = Objects.requireNonNull(ipCidrRange, "expected parameter 'ipCidrRange' to be non-null");
        this.isAddress = Objects.requireNonNull(isAddress, "expected parameter 'isAddress' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private PublicDelegatedPrefixPublicDelegatedSubPrefixResponse() {
        this.delegateeProject = null;
        this.description = null;
        this.ipCidrRange = null;
        this.isAddress = null;
        this.name = null;
        this.region = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicDelegatedPrefixPublicDelegatedSubPrefixResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String delegateeProject;
        private String description;
        private String ipCidrRange;
        private Boolean isAddress;
        private String name;
        private String region;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicDelegatedPrefixPublicDelegatedSubPrefixResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delegateeProject = defaults.delegateeProject;
    	      this.description = defaults.description;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.isAddress = defaults.isAddress;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.status = defaults.status;
        }

        public Builder delegateeProject(String delegateeProject) {
            this.delegateeProject = Objects.requireNonNull(delegateeProject);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder ipCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }
        public Builder isAddress(Boolean isAddress) {
            this.isAddress = Objects.requireNonNull(isAddress);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public PublicDelegatedPrefixPublicDelegatedSubPrefixResponse build() {
            return new PublicDelegatedPrefixPublicDelegatedSubPrefixResponse(delegateeProject, description, ipCidrRange, isAddress, name, region, status);
        }
    }
}
