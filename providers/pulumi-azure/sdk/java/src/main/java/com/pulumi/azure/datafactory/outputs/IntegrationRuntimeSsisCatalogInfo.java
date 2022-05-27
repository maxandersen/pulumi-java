// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationRuntimeSsisCatalogInfo {
    /**
     * @return Administrator login name for the SQL Server.
     * 
     */
    private final @Nullable String administratorLogin;
    /**
     * @return Administrator login password for the SQL Server.
     * 
     */
    private final @Nullable String administratorPassword;
    /**
     * @return The dual standby Azure-SSIS Integration Runtime pair with SSISDB failover.
     * 
     */
    private final @Nullable String dualStandbyPairName;
    /**
     * @return Pricing tier for the database that will be created for the SSIS catalog. Valid values are: `Basic`, `S0`, `S1`, `S2`, `S3`, `S4`, `S6`, `S7`, `S9`, `S12`, `P1`, `P2`, `P4`, `P6`, `P11`, `P15`, `GP_S_Gen5_1`, `GP_S_Gen5_2`, `GP_S_Gen5_4`, `GP_S_Gen5_6`, `GP_S_Gen5_8`, `GP_S_Gen5_10`, `GP_S_Gen5_12`, `GP_S_Gen5_14`, `GP_S_Gen5_16`, `GP_S_Gen5_18`, `GP_S_Gen5_20`, `GP_S_Gen5_24`, `GP_S_Gen5_32`, `GP_S_Gen5_40`, `GP_Gen5_2`, `GP_Gen5_4`, `GP_Gen5_6`, `GP_Gen5_8`, `GP_Gen5_10`, `GP_Gen5_12`, `GP_Gen5_14`, `GP_Gen5_16`, `GP_Gen5_18`, `GP_Gen5_20`, `GP_Gen5_24`, `GP_Gen5_32`, `GP_Gen5_40`, `GP_Gen5_80`, `BC_Gen5_2`, `BC_Gen5_4`, `BC_Gen5_6`, `BC_Gen5_8`, `BC_Gen5_10`, `BC_Gen5_12`, `BC_Gen5_14`, `BC_Gen5_16`, `BC_Gen5_18`, `BC_Gen5_20`, `BC_Gen5_24`, `BC_Gen5_32`, `BC_Gen5_40`, `BC_Gen5_80`, `HS_Gen5_2`, `HS_Gen5_4`, `HS_Gen5_6`, `HS_Gen5_8`, `HS_Gen5_10`, `HS_Gen5_12`, `HS_Gen5_14`, `HS_Gen5_16`, `HS_Gen5_18`, `HS_Gen5_20`, `HS_Gen5_24`, `HS_Gen5_32`, `HS_Gen5_40` and `HS_Gen5_80`.
     * 
     */
    private final @Nullable String pricingTier;
    /**
     * @return The endpoint of an Azure SQL Server that will be used to host the SSIS catalog.
     * 
     */
    private final String serverEndpoint;

    @CustomType.Constructor
    private IntegrationRuntimeSsisCatalogInfo(
        @CustomType.Parameter("administratorLogin") @Nullable String administratorLogin,
        @CustomType.Parameter("administratorPassword") @Nullable String administratorPassword,
        @CustomType.Parameter("dualStandbyPairName") @Nullable String dualStandbyPairName,
        @CustomType.Parameter("pricingTier") @Nullable String pricingTier,
        @CustomType.Parameter("serverEndpoint") String serverEndpoint) {
        this.administratorLogin = administratorLogin;
        this.administratorPassword = administratorPassword;
        this.dualStandbyPairName = dualStandbyPairName;
        this.pricingTier = pricingTier;
        this.serverEndpoint = serverEndpoint;
    }

    /**
     * @return Administrator login name for the SQL Server.
     * 
     */
    public Optional<String> administratorLogin() {
        return Optional.ofNullable(this.administratorLogin);
    }
    /**
     * @return Administrator login password for the SQL Server.
     * 
     */
    public Optional<String> administratorPassword() {
        return Optional.ofNullable(this.administratorPassword);
    }
    /**
     * @return The dual standby Azure-SSIS Integration Runtime pair with SSISDB failover.
     * 
     */
    public Optional<String> dualStandbyPairName() {
        return Optional.ofNullable(this.dualStandbyPairName);
    }
    /**
     * @return Pricing tier for the database that will be created for the SSIS catalog. Valid values are: `Basic`, `S0`, `S1`, `S2`, `S3`, `S4`, `S6`, `S7`, `S9`, `S12`, `P1`, `P2`, `P4`, `P6`, `P11`, `P15`, `GP_S_Gen5_1`, `GP_S_Gen5_2`, `GP_S_Gen5_4`, `GP_S_Gen5_6`, `GP_S_Gen5_8`, `GP_S_Gen5_10`, `GP_S_Gen5_12`, `GP_S_Gen5_14`, `GP_S_Gen5_16`, `GP_S_Gen5_18`, `GP_S_Gen5_20`, `GP_S_Gen5_24`, `GP_S_Gen5_32`, `GP_S_Gen5_40`, `GP_Gen5_2`, `GP_Gen5_4`, `GP_Gen5_6`, `GP_Gen5_8`, `GP_Gen5_10`, `GP_Gen5_12`, `GP_Gen5_14`, `GP_Gen5_16`, `GP_Gen5_18`, `GP_Gen5_20`, `GP_Gen5_24`, `GP_Gen5_32`, `GP_Gen5_40`, `GP_Gen5_80`, `BC_Gen5_2`, `BC_Gen5_4`, `BC_Gen5_6`, `BC_Gen5_8`, `BC_Gen5_10`, `BC_Gen5_12`, `BC_Gen5_14`, `BC_Gen5_16`, `BC_Gen5_18`, `BC_Gen5_20`, `BC_Gen5_24`, `BC_Gen5_32`, `BC_Gen5_40`, `BC_Gen5_80`, `HS_Gen5_2`, `HS_Gen5_4`, `HS_Gen5_6`, `HS_Gen5_8`, `HS_Gen5_10`, `HS_Gen5_12`, `HS_Gen5_14`, `HS_Gen5_16`, `HS_Gen5_18`, `HS_Gen5_20`, `HS_Gen5_24`, `HS_Gen5_32`, `HS_Gen5_40` and `HS_Gen5_80`.
     * 
     */
    public Optional<String> pricingTier() {
        return Optional.ofNullable(this.pricingTier);
    }
    /**
     * @return The endpoint of an Azure SQL Server that will be used to host the SSIS catalog.
     * 
     */
    public String serverEndpoint() {
        return this.serverEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeSsisCatalogInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String administratorLogin;
        private @Nullable String administratorPassword;
        private @Nullable String dualStandbyPairName;
        private @Nullable String pricingTier;
        private String serverEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeSsisCatalogInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorLogin = defaults.administratorLogin;
    	      this.administratorPassword = defaults.administratorPassword;
    	      this.dualStandbyPairName = defaults.dualStandbyPairName;
    	      this.pricingTier = defaults.pricingTier;
    	      this.serverEndpoint = defaults.serverEndpoint;
        }

        public Builder administratorLogin(@Nullable String administratorLogin) {
            this.administratorLogin = administratorLogin;
            return this;
        }
        public Builder administratorPassword(@Nullable String administratorPassword) {
            this.administratorPassword = administratorPassword;
            return this;
        }
        public Builder dualStandbyPairName(@Nullable String dualStandbyPairName) {
            this.dualStandbyPairName = dualStandbyPairName;
            return this;
        }
        public Builder pricingTier(@Nullable String pricingTier) {
            this.pricingTier = pricingTier;
            return this;
        }
        public Builder serverEndpoint(String serverEndpoint) {
            this.serverEndpoint = Objects.requireNonNull(serverEndpoint);
            return this;
        }        public IntegrationRuntimeSsisCatalogInfo build() {
            return new IntegrationRuntimeSsisCatalogInfo(administratorLogin, administratorPassword, dualStandbyPairName, pricingTier, serverEndpoint);
        }
    }
}
