// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPublicIPAddressArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPublicIPAddressArgs Empty = new GetPublicIPAddressArgs();

    /**
     * Expands referenced resources.
     * 
     */
    @Import(name="expand")
      private final @Nullable String expand;

    public Optional<String> expand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The name of the public IP address.
     * 
     */
    @Import(name="publicIpAddressName", required=true)
      private final String publicIpAddressName;

    public String publicIpAddressName() {
        return this.publicIpAddressName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetPublicIPAddressArgs(
        @Nullable String expand,
        String publicIpAddressName,
        String resourceGroupName) {
        this.expand = expand;
        this.publicIpAddressName = Objects.requireNonNull(publicIpAddressName, "expected parameter 'publicIpAddressName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetPublicIPAddressArgs() {
        this.expand = null;
        this.publicIpAddressName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPublicIPAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String publicIpAddressName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPublicIPAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.publicIpAddressName = defaults.publicIpAddressName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder expand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }
        public Builder publicIpAddressName(String publicIpAddressName) {
            this.publicIpAddressName = Objects.requireNonNull(publicIpAddressName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetPublicIPAddressArgs build() {
            return new GetPublicIPAddressArgs(expand, publicIpAddressName, resourceGroupName);
        }
    }
}
