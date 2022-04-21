// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Radius client root certificate of P2SVpnServerConfiguration.
 * 
 */
public final class P2SVpnServerConfigRadiusClientRootCertificateResponse extends com.pulumi.resources.InvokeArgs {

    public static final P2SVpnServerConfigRadiusClientRootCertificateResponse Empty = new P2SVpnServerConfigRadiusClientRootCertificateResponse();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag")
    private @Nullable String etag;

    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the radius client root certificate resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The Radius client root certificate thumbprint.
     * 
     */
    @Import(name="thumbprint")
    private @Nullable String thumbprint;

    public Optional<String> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    private P2SVpnServerConfigRadiusClientRootCertificateResponse() {}

    private P2SVpnServerConfigRadiusClientRootCertificateResponse(P2SVpnServerConfigRadiusClientRootCertificateResponse $) {
        this.etag = $.etag;
        this.id = $.id;
        this.name = $.name;
        this.provisioningState = $.provisioningState;
        this.thumbprint = $.thumbprint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(P2SVpnServerConfigRadiusClientRootCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private P2SVpnServerConfigRadiusClientRootCertificateResponse $;

        public Builder() {
            $ = new P2SVpnServerConfigRadiusClientRootCertificateResponse();
        }

        public Builder(P2SVpnServerConfigRadiusClientRootCertificateResponse defaults) {
            $ = new P2SVpnServerConfigRadiusClientRootCertificateResponse(Objects.requireNonNull(defaults));
        }

        public Builder etag(@Nullable String etag) {
            $.etag = etag;
            return this;
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder thumbprint(@Nullable String thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        public P2SVpnServerConfigRadiusClientRootCertificateResponse build() {
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            return $;
        }
    }

}
