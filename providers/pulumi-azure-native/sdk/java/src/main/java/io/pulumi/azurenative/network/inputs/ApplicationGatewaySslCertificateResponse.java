// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SSL certificates of an application gateway.
 * 
 */
public final class ApplicationGatewaySslCertificateResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewaySslCertificateResponse Empty = new ApplicationGatewaySslCertificateResponse();

    /**
     * Base-64 encoded pfx certificate. Only applicable in PUT Request.
     * 
     */
    @Import(name="data")
      private final @Nullable String data;

    public Optional<String> data() {
        return this.data == null ? Optional.empty() : Optional.ofNullable(this.data);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String etag() {
        return this.etag;
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
     * Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate' object stored in KeyVault.
     * 
     */
    @Import(name="keyVaultSecretId")
      private final @Nullable String keyVaultSecretId;

    public Optional<String> keyVaultSecretId() {
        return this.keyVaultSecretId == null ? Optional.empty() : Optional.ofNullable(this.keyVaultSecretId);
    }

    /**
     * Name of the SSL certificate that is unique within an Application Gateway.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Password for the pfx file specified in data. Only applicable in PUT request.
     * 
     */
    @Import(name="password")
      private final @Nullable String password;

    public Optional<String> password() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    /**
     * The provisioning state of the SSL certificate resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Base-64 encoded Public cert data corresponding to pfx specified in data. Only applicable in GET request.
     * 
     */
    @Import(name="publicCertData", required=true)
      private final String publicCertData;

    public String publicCertData() {
        return this.publicCertData;
    }

    /**
     * Type of the resource.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public ApplicationGatewaySslCertificateResponse(
        @Nullable String data,
        String etag,
        @Nullable String id,
        @Nullable String keyVaultSecretId,
        @Nullable String name,
        @Nullable String password,
        String provisioningState,
        String publicCertData,
        String type) {
        this.data = data;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.keyVaultSecretId = keyVaultSecretId;
        this.name = name;
        this.password = password;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.publicCertData = Objects.requireNonNull(publicCertData, "expected parameter 'publicCertData' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ApplicationGatewaySslCertificateResponse() {
        this.data = null;
        this.etag = null;
        this.id = null;
        this.keyVaultSecretId = null;
        this.name = null;
        this.password = null;
        this.provisioningState = null;
        this.publicCertData = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewaySslCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String data;
        private String etag;
        private @Nullable String id;
        private @Nullable String keyVaultSecretId;
        private @Nullable String name;
        private @Nullable String password;
        private String provisioningState;
        private String publicCertData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewaySslCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.keyVaultSecretId = defaults.keyVaultSecretId;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicCertData = defaults.publicCertData;
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
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publicCertData(String publicCertData) {
            this.publicCertData = Objects.requireNonNull(publicCertData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ApplicationGatewaySslCertificateResponse build() {
            return new ApplicationGatewaySslCertificateResponse(data, etag, id, keyVaultSecretId, name, password, provisioningState, publicCertData, type);
        }
    }
}
