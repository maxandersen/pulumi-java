// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationRuntimeSsisCatalogInfoResponse {
    /**
     * @return The password of the administrator user account of the catalog database.
     * 
     */
    private final @Nullable SecureStringResponse catalogAdminPassword;
    /**
     * @return The administrator user name of catalog database.
     * 
     */
    private final @Nullable String catalogAdminUserName;
    /**
     * @return The pricing tier for the catalog database. The valid values could be found in https://azure.microsoft.com/en-us/pricing/details/sql-database/
     * 
     */
    private final @Nullable String catalogPricingTier;
    /**
     * @return The catalog database server URL.
     * 
     */
    private final @Nullable String catalogServerEndpoint;
    /**
     * @return The dual standby pair name of Azure-SSIS Integration Runtimes to support SSISDB failover.
     * 
     */
    private final @Nullable String dualStandbyPairName;

    @CustomType.Constructor
    private IntegrationRuntimeSsisCatalogInfoResponse(
        @CustomType.Parameter("catalogAdminPassword") @Nullable SecureStringResponse catalogAdminPassword,
        @CustomType.Parameter("catalogAdminUserName") @Nullable String catalogAdminUserName,
        @CustomType.Parameter("catalogPricingTier") @Nullable String catalogPricingTier,
        @CustomType.Parameter("catalogServerEndpoint") @Nullable String catalogServerEndpoint,
        @CustomType.Parameter("dualStandbyPairName") @Nullable String dualStandbyPairName) {
        this.catalogAdminPassword = catalogAdminPassword;
        this.catalogAdminUserName = catalogAdminUserName;
        this.catalogPricingTier = catalogPricingTier;
        this.catalogServerEndpoint = catalogServerEndpoint;
        this.dualStandbyPairName = dualStandbyPairName;
    }

    /**
     * @return The password of the administrator user account of the catalog database.
     * 
     */
    public Optional<SecureStringResponse> catalogAdminPassword() {
        return Optional.ofNullable(this.catalogAdminPassword);
    }
    /**
     * @return The administrator user name of catalog database.
     * 
     */
    public Optional<String> catalogAdminUserName() {
        return Optional.ofNullable(this.catalogAdminUserName);
    }
    /**
     * @return The pricing tier for the catalog database. The valid values could be found in https://azure.microsoft.com/en-us/pricing/details/sql-database/
     * 
     */
    public Optional<String> catalogPricingTier() {
        return Optional.ofNullable(this.catalogPricingTier);
    }
    /**
     * @return The catalog database server URL.
     * 
     */
    public Optional<String> catalogServerEndpoint() {
        return Optional.ofNullable(this.catalogServerEndpoint);
    }
    /**
     * @return The dual standby pair name of Azure-SSIS Integration Runtimes to support SSISDB failover.
     * 
     */
    public Optional<String> dualStandbyPairName() {
        return Optional.ofNullable(this.dualStandbyPairName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeSsisCatalogInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SecureStringResponse catalogAdminPassword;
        private @Nullable String catalogAdminUserName;
        private @Nullable String catalogPricingTier;
        private @Nullable String catalogServerEndpoint;
        private @Nullable String dualStandbyPairName;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeSsisCatalogInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogAdminPassword = defaults.catalogAdminPassword;
    	      this.catalogAdminUserName = defaults.catalogAdminUserName;
    	      this.catalogPricingTier = defaults.catalogPricingTier;
    	      this.catalogServerEndpoint = defaults.catalogServerEndpoint;
    	      this.dualStandbyPairName = defaults.dualStandbyPairName;
        }

        public Builder catalogAdminPassword(@Nullable SecureStringResponse catalogAdminPassword) {
            this.catalogAdminPassword = catalogAdminPassword;
            return this;
        }
        public Builder catalogAdminUserName(@Nullable String catalogAdminUserName) {
            this.catalogAdminUserName = catalogAdminUserName;
            return this;
        }
        public Builder catalogPricingTier(@Nullable String catalogPricingTier) {
            this.catalogPricingTier = catalogPricingTier;
            return this;
        }
        public Builder catalogServerEndpoint(@Nullable String catalogServerEndpoint) {
            this.catalogServerEndpoint = catalogServerEndpoint;
            return this;
        }
        public Builder dualStandbyPairName(@Nullable String dualStandbyPairName) {
            this.dualStandbyPairName = dualStandbyPairName;
            return this;
        }        public IntegrationRuntimeSsisCatalogInfoResponse build() {
            return new IntegrationRuntimeSsisCatalogInfoResponse(catalogAdminPassword, catalogAdminUserName, catalogPricingTier, catalogServerEndpoint, dualStandbyPairName);
        }
    }
}
