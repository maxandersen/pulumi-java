// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Catalog information for managed dedicated integration runtime.
 * 
 */
public final class IntegrationRuntimeSsisCatalogInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final IntegrationRuntimeSsisCatalogInfoResponse Empty = new IntegrationRuntimeSsisCatalogInfoResponse();

    /**
     * The password of the administrator user account of the catalog database.
     * 
     */
    @Import(name="catalogAdminPassword")
      private final @Nullable SecureStringResponse catalogAdminPassword;

    public Optional<SecureStringResponse> catalogAdminPassword() {
        return this.catalogAdminPassword == null ? Optional.empty() : Optional.ofNullable(this.catalogAdminPassword);
    }

    /**
     * The administrator user name of catalog database.
     * 
     */
    @Import(name="catalogAdminUserName")
      private final @Nullable String catalogAdminUserName;

    public Optional<String> catalogAdminUserName() {
        return this.catalogAdminUserName == null ? Optional.empty() : Optional.ofNullable(this.catalogAdminUserName);
    }

    /**
     * The pricing tier for the catalog database. The valid values could be found in https://azure.microsoft.com/en-us/pricing/details/sql-database/
     * 
     */
    @Import(name="catalogPricingTier")
      private final @Nullable String catalogPricingTier;

    public Optional<String> catalogPricingTier() {
        return this.catalogPricingTier == null ? Optional.empty() : Optional.ofNullable(this.catalogPricingTier);
    }

    /**
     * The catalog database server URL.
     * 
     */
    @Import(name="catalogServerEndpoint")
      private final @Nullable String catalogServerEndpoint;

    public Optional<String> catalogServerEndpoint() {
        return this.catalogServerEndpoint == null ? Optional.empty() : Optional.ofNullable(this.catalogServerEndpoint);
    }

    /**
     * The dual standby pair name of Azure-SSIS Integration Runtimes to support SSISDB failover.
     * 
     */
    @Import(name="dualStandbyPairName")
      private final @Nullable String dualStandbyPairName;

    public Optional<String> dualStandbyPairName() {
        return this.dualStandbyPairName == null ? Optional.empty() : Optional.ofNullable(this.dualStandbyPairName);
    }

    public IntegrationRuntimeSsisCatalogInfoResponse(
        @Nullable SecureStringResponse catalogAdminPassword,
        @Nullable String catalogAdminUserName,
        @Nullable String catalogPricingTier,
        @Nullable String catalogServerEndpoint,
        @Nullable String dualStandbyPairName) {
        this.catalogAdminPassword = catalogAdminPassword;
        this.catalogAdminUserName = catalogAdminUserName;
        this.catalogPricingTier = catalogPricingTier;
        this.catalogServerEndpoint = catalogServerEndpoint;
        this.dualStandbyPairName = dualStandbyPairName;
    }

    private IntegrationRuntimeSsisCatalogInfoResponse() {
        this.catalogAdminPassword = null;
        this.catalogAdminUserName = null;
        this.catalogPricingTier = null;
        this.catalogServerEndpoint = null;
        this.dualStandbyPairName = null;
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
