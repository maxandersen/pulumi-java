// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sqlvirtualmachine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Domain credentials for setting up Windows Server Failover Cluster for SQL availability group.
 * 
 */
public final class WsfcDomainCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final WsfcDomainCredentialsArgs Empty = new WsfcDomainCredentialsArgs();

    /**
     * Cluster bootstrap account password.
     * 
     */
    @Import(name="clusterBootstrapAccountPassword")
    private @Nullable Output<String> clusterBootstrapAccountPassword;

    /**
     * @return Cluster bootstrap account password.
     * 
     */
    public Optional<Output<String>> clusterBootstrapAccountPassword() {
        return Optional.ofNullable(this.clusterBootstrapAccountPassword);
    }

    /**
     * Cluster operator account password.
     * 
     */
    @Import(name="clusterOperatorAccountPassword")
    private @Nullable Output<String> clusterOperatorAccountPassword;

    /**
     * @return Cluster operator account password.
     * 
     */
    public Optional<Output<String>> clusterOperatorAccountPassword() {
        return Optional.ofNullable(this.clusterOperatorAccountPassword);
    }

    /**
     * SQL service account password.
     * 
     */
    @Import(name="sqlServiceAccountPassword")
    private @Nullable Output<String> sqlServiceAccountPassword;

    /**
     * @return SQL service account password.
     * 
     */
    public Optional<Output<String>> sqlServiceAccountPassword() {
        return Optional.ofNullable(this.sqlServiceAccountPassword);
    }

    private WsfcDomainCredentialsArgs() {}

    private WsfcDomainCredentialsArgs(WsfcDomainCredentialsArgs $) {
        this.clusterBootstrapAccountPassword = $.clusterBootstrapAccountPassword;
        this.clusterOperatorAccountPassword = $.clusterOperatorAccountPassword;
        this.sqlServiceAccountPassword = $.sqlServiceAccountPassword;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WsfcDomainCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WsfcDomainCredentialsArgs $;

        public Builder() {
            $ = new WsfcDomainCredentialsArgs();
        }

        public Builder(WsfcDomainCredentialsArgs defaults) {
            $ = new WsfcDomainCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterBootstrapAccountPassword Cluster bootstrap account password.
         * 
         * @return builder
         * 
         */
        public Builder clusterBootstrapAccountPassword(@Nullable Output<String> clusterBootstrapAccountPassword) {
            $.clusterBootstrapAccountPassword = clusterBootstrapAccountPassword;
            return this;
        }

        /**
         * @param clusterBootstrapAccountPassword Cluster bootstrap account password.
         * 
         * @return builder
         * 
         */
        public Builder clusterBootstrapAccountPassword(String clusterBootstrapAccountPassword) {
            return clusterBootstrapAccountPassword(Output.of(clusterBootstrapAccountPassword));
        }

        /**
         * @param clusterOperatorAccountPassword Cluster operator account password.
         * 
         * @return builder
         * 
         */
        public Builder clusterOperatorAccountPassword(@Nullable Output<String> clusterOperatorAccountPassword) {
            $.clusterOperatorAccountPassword = clusterOperatorAccountPassword;
            return this;
        }

        /**
         * @param clusterOperatorAccountPassword Cluster operator account password.
         * 
         * @return builder
         * 
         */
        public Builder clusterOperatorAccountPassword(String clusterOperatorAccountPassword) {
            return clusterOperatorAccountPassword(Output.of(clusterOperatorAccountPassword));
        }

        /**
         * @param sqlServiceAccountPassword SQL service account password.
         * 
         * @return builder
         * 
         */
        public Builder sqlServiceAccountPassword(@Nullable Output<String> sqlServiceAccountPassword) {
            $.sqlServiceAccountPassword = sqlServiceAccountPassword;
            return this;
        }

        /**
         * @param sqlServiceAccountPassword SQL service account password.
         * 
         * @return builder
         * 
         */
        public Builder sqlServiceAccountPassword(String sqlServiceAccountPassword) {
            return sqlServiceAccountPassword(Output.of(sqlServiceAccountPassword));
        }

        public WsfcDomainCredentialsArgs build() {
            return $;
        }
    }

}
