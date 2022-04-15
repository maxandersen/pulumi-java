// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class P2SVpnServerConfigVpnClientRootCertificateResponse {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final @Nullable String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The provisioning state of the VPN client root certificate resource.
     * 
     */
    private final String provisioningState;
    /**
     * The certificate public data.
     * 
     */
    private final String publicCertData;

    @CustomType.Constructor
    private P2SVpnServerConfigVpnClientRootCertificateResponse(
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicCertData") String publicCertData) {
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.publicCertData = publicCertData;
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The provisioning state of the VPN client root certificate resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The certificate public data.
     * 
    */
    public String publicCertData() {
        return this.publicCertData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(P2SVpnServerConfigVpnClientRootCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private String publicCertData;

        public Builder() {
    	      // Empty
        }

        public Builder(P2SVpnServerConfigVpnClientRootCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicCertData = defaults.publicCertData;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publicCertData(String publicCertData) {
            this.publicCertData = Objects.requireNonNull(publicCertData);
            return this;
        }        public P2SVpnServerConfigVpnClientRootCertificateResponse build() {
            return new P2SVpnServerConfigVpnClientRootCertificateResponse(etag, id, name, provisioningState, publicCertData);
        }
    }
}
