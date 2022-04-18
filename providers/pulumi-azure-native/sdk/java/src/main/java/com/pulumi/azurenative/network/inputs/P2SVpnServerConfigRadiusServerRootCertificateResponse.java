// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Radius Server root certificate of P2SVpnServerConfiguration.
 * 
 */
public final class P2SVpnServerConfigRadiusServerRootCertificateResponse extends com.pulumi.resources.InvokeArgs {

    public static final P2SVpnServerConfigRadiusServerRootCertificateResponse Empty = new P2SVpnServerConfigRadiusServerRootCertificateResponse();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag")
      private final @Nullable String etag;

    public Optional<String> etag() {
        return this.etag == null ? Optional.empty() : Optional.ofNullable(this.etag);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the radius server root certificate resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The certificate public data.
     * 
     */
    @Import(name="publicCertData", required=true)
      private final String publicCertData;

    public String publicCertData() {
        return this.publicCertData;
    }

    public P2SVpnServerConfigRadiusServerRootCertificateResponse(
        @Nullable String etag,
        @Nullable String id,
        @Nullable String name,
        String provisioningState,
        String publicCertData) {
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.publicCertData = Objects.requireNonNull(publicCertData, "expected parameter 'publicCertData' to be non-null");
    }

    private P2SVpnServerConfigRadiusServerRootCertificateResponse() {
        this.etag = null;
        this.id = null;
        this.name = null;
        this.provisioningState = null;
        this.publicCertData = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(P2SVpnServerConfigRadiusServerRootCertificateResponse defaults) {
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

        public Builder(P2SVpnServerConfigRadiusServerRootCertificateResponse defaults) {
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
        }        public P2SVpnServerConfigRadiusServerRootCertificateResponse build() {
            return new P2SVpnServerConfigRadiusServerRootCertificateResponse(etag, id, name, provisioningState, publicCertData);
        }
    }
}
