// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WsfcDomainCredentialsResponse {
    /**
     * Cluster bootstrap account password.
     * 
     */
    private final @Nullable String clusterBootstrapAccountPassword;
    /**
     * Cluster operator account password.
     * 
     */
    private final @Nullable String clusterOperatorAccountPassword;
    /**
     * SQL service account password.
     * 
     */
    private final @Nullable String sqlServiceAccountPassword;

    @CustomType.Constructor
    private WsfcDomainCredentialsResponse(
        @CustomType.Parameter("clusterBootstrapAccountPassword") @Nullable String clusterBootstrapAccountPassword,
        @CustomType.Parameter("clusterOperatorAccountPassword") @Nullable String clusterOperatorAccountPassword,
        @CustomType.Parameter("sqlServiceAccountPassword") @Nullable String sqlServiceAccountPassword) {
        this.clusterBootstrapAccountPassword = clusterBootstrapAccountPassword;
        this.clusterOperatorAccountPassword = clusterOperatorAccountPassword;
        this.sqlServiceAccountPassword = sqlServiceAccountPassword;
    }

    /**
     * Cluster bootstrap account password.
     * 
    */
    public Optional<String> clusterBootstrapAccountPassword() {
        return Optional.ofNullable(this.clusterBootstrapAccountPassword);
    }
    /**
     * Cluster operator account password.
     * 
    */
    public Optional<String> clusterOperatorAccountPassword() {
        return Optional.ofNullable(this.clusterOperatorAccountPassword);
    }
    /**
     * SQL service account password.
     * 
    */
    public Optional<String> sqlServiceAccountPassword() {
        return Optional.ofNullable(this.sqlServiceAccountPassword);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WsfcDomainCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clusterBootstrapAccountPassword;
        private @Nullable String clusterOperatorAccountPassword;
        private @Nullable String sqlServiceAccountPassword;

        public Builder() {
    	      // Empty
        }

        public Builder(WsfcDomainCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterBootstrapAccountPassword = defaults.clusterBootstrapAccountPassword;
    	      this.clusterOperatorAccountPassword = defaults.clusterOperatorAccountPassword;
    	      this.sqlServiceAccountPassword = defaults.sqlServiceAccountPassword;
        }

        public Builder clusterBootstrapAccountPassword(@Nullable String clusterBootstrapAccountPassword) {
            this.clusterBootstrapAccountPassword = clusterBootstrapAccountPassword;
            return this;
        }
        public Builder clusterOperatorAccountPassword(@Nullable String clusterOperatorAccountPassword) {
            this.clusterOperatorAccountPassword = clusterOperatorAccountPassword;
            return this;
        }
        public Builder sqlServiceAccountPassword(@Nullable String sqlServiceAccountPassword) {
            this.sqlServiceAccountPassword = sqlServiceAccountPassword;
            return this;
        }        public WsfcDomainCredentialsResponse build() {
            return new WsfcDomainCredentialsResponse(clusterBootstrapAccountPassword, clusterOperatorAccountPassword, sqlServiceAccountPassword);
        }
    }
}
