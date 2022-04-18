// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.opensearchservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainEndpointOptions {
    private final @Nullable String customEndpoint;
    private final @Nullable String customEndpointCertificateArn;
    private final @Nullable Boolean customEndpointEnabled;
    private final @Nullable Boolean enforceHTTPS;
    private final @Nullable String tLSSecurityPolicy;

    @CustomType.Constructor
    private DomainEndpointOptions(
        @CustomType.Parameter("customEndpoint") @Nullable String customEndpoint,
        @CustomType.Parameter("customEndpointCertificateArn") @Nullable String customEndpointCertificateArn,
        @CustomType.Parameter("customEndpointEnabled") @Nullable Boolean customEndpointEnabled,
        @CustomType.Parameter("enforceHTTPS") @Nullable Boolean enforceHTTPS,
        @CustomType.Parameter("tLSSecurityPolicy") @Nullable String tLSSecurityPolicy) {
        this.customEndpoint = customEndpoint;
        this.customEndpointCertificateArn = customEndpointCertificateArn;
        this.customEndpointEnabled = customEndpointEnabled;
        this.enforceHTTPS = enforceHTTPS;
        this.tLSSecurityPolicy = tLSSecurityPolicy;
    }

    public Optional<String> customEndpoint() {
        return Optional.ofNullable(this.customEndpoint);
    }
    public Optional<String> customEndpointCertificateArn() {
        return Optional.ofNullable(this.customEndpointCertificateArn);
    }
    public Optional<Boolean> customEndpointEnabled() {
        return Optional.ofNullable(this.customEndpointEnabled);
    }
    public Optional<Boolean> enforceHTTPS() {
        return Optional.ofNullable(this.enforceHTTPS);
    }
    public Optional<String> tLSSecurityPolicy() {
        return Optional.ofNullable(this.tLSSecurityPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainEndpointOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customEndpoint;
        private @Nullable String customEndpointCertificateArn;
        private @Nullable Boolean customEndpointEnabled;
        private @Nullable Boolean enforceHTTPS;
        private @Nullable String tLSSecurityPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainEndpointOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customEndpoint = defaults.customEndpoint;
    	      this.customEndpointCertificateArn = defaults.customEndpointCertificateArn;
    	      this.customEndpointEnabled = defaults.customEndpointEnabled;
    	      this.enforceHTTPS = defaults.enforceHTTPS;
    	      this.tLSSecurityPolicy = defaults.tLSSecurityPolicy;
        }

        public Builder customEndpoint(@Nullable String customEndpoint) {
            this.customEndpoint = customEndpoint;
            return this;
        }
        public Builder customEndpointCertificateArn(@Nullable String customEndpointCertificateArn) {
            this.customEndpointCertificateArn = customEndpointCertificateArn;
            return this;
        }
        public Builder customEndpointEnabled(@Nullable Boolean customEndpointEnabled) {
            this.customEndpointEnabled = customEndpointEnabled;
            return this;
        }
        public Builder enforceHTTPS(@Nullable Boolean enforceHTTPS) {
            this.enforceHTTPS = enforceHTTPS;
            return this;
        }
        public Builder tLSSecurityPolicy(@Nullable String tLSSecurityPolicy) {
            this.tLSSecurityPolicy = tLSSecurityPolicy;
            return this;
        }        public DomainEndpointOptions build() {
            return new DomainEndpointOptions(customEndpoint, customEndpointCertificateArn, customEndpointEnabled, enforceHTTPS, tLSSecurityPolicy);
        }
    }
}
