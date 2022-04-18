// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayTrustedRootCertificateResponse {
    /**
     * Certificate public data.
     * 
     */
    private final @Nullable String data;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate' object stored in KeyVault.
     * 
     */
    private final @Nullable String keyVaultSecretId;
    /**
     * Name of the trusted root certificate that is unique within an Application Gateway.
     * 
     */
    private final @Nullable String name;
    /**
     * The provisioning state of the trusted root certificate resource.
     * 
     */
    private final String provisioningState;
    /**
     * Type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ApplicationGatewayTrustedRootCertificateResponse(
        @CustomType.Parameter("data") @Nullable String data,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("keyVaultSecretId") @Nullable String keyVaultSecretId,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("type") String type) {
        this.data = data;
        this.etag = etag;
        this.id = id;
        this.keyVaultSecretId = keyVaultSecretId;
        this.name = name;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * Certificate public data.
     * 
    */
    public Optional<String> data() {
        return Optional.ofNullable(this.data);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate' object stored in KeyVault.
     * 
    */
    public Optional<String> keyVaultSecretId() {
        return Optional.ofNullable(this.keyVaultSecretId);
    }
    /**
     * Name of the trusted root certificate that is unique within an Application Gateway.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The provisioning state of the trusted root certificate resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Type of the resource.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayTrustedRootCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String data;
        private String etag;
        private @Nullable String id;
        private @Nullable String keyVaultSecretId;
        private @Nullable String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayTrustedRootCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.keyVaultSecretId = defaults.keyVaultSecretId;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder data(@Nullable String data) {
            this.data = data;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder keyVaultSecretId(@Nullable String keyVaultSecretId) {
            this.keyVaultSecretId = keyVaultSecretId;
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
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ApplicationGatewayTrustedRootCertificateResponse build() {
            return new ApplicationGatewayTrustedRootCertificateResponse(data, etag, id, keyVaultSecretId, name, provisioningState, type);
        }
    }
}
