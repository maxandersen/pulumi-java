// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.azurenative.synapse.enums.IntegrationRuntimeSsisCatalogPricingTier;
import com.pulumi.azurenative.synapse.inputs.SecureStringArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Catalog information for managed dedicated integration runtime.
 * 
 */
public final class IntegrationRuntimeSsisCatalogInfoArgs extends ResourceArgs {

    public static final IntegrationRuntimeSsisCatalogInfoArgs Empty = new IntegrationRuntimeSsisCatalogInfoArgs();

    /**
     * The password of the administrator user account of the catalog database.
     * 
     */
    @Import(name="catalogAdminPassword")
    private @Nullable Output<SecureStringArgs> catalogAdminPassword;

    /**
     * @return The password of the administrator user account of the catalog database.
     * 
     */
    public Optional<Output<SecureStringArgs>> catalogAdminPassword() {
        return Optional.ofNullable(this.catalogAdminPassword);
    }

    /**
     * The administrator user name of catalog database.
     * 
     */
    @Import(name="catalogAdminUserName")
    private @Nullable Output<String> catalogAdminUserName;

    /**
     * @return The administrator user name of catalog database.
     * 
     */
    public Optional<Output<String>> catalogAdminUserName() {
        return Optional.ofNullable(this.catalogAdminUserName);
    }

    /**
     * The pricing tier for the catalog database. The valid values could be found in https://azure.microsoft.com/en-us/pricing/details/sql-database/
     * 
     */
    @Import(name="catalogPricingTier")
    private @Nullable Output<Either<String,IntegrationRuntimeSsisCatalogPricingTier>> catalogPricingTier;

    /**
     * @return The pricing tier for the catalog database. The valid values could be found in https://azure.microsoft.com/en-us/pricing/details/sql-database/
     * 
     */
    public Optional<Output<Either<String,IntegrationRuntimeSsisCatalogPricingTier>>> catalogPricingTier() {
        return Optional.ofNullable(this.catalogPricingTier);
    }

    /**
     * The catalog database server URL.
     * 
     */
    @Import(name="catalogServerEndpoint")
    private @Nullable Output<String> catalogServerEndpoint;

    /**
     * @return The catalog database server URL.
     * 
     */
    public Optional<Output<String>> catalogServerEndpoint() {
        return Optional.ofNullable(this.catalogServerEndpoint);
    }

    private IntegrationRuntimeSsisCatalogInfoArgs() {}

    private IntegrationRuntimeSsisCatalogInfoArgs(IntegrationRuntimeSsisCatalogInfoArgs $) {
        this.catalogAdminPassword = $.catalogAdminPassword;
        this.catalogAdminUserName = $.catalogAdminUserName;
        this.catalogPricingTier = $.catalogPricingTier;
        this.catalogServerEndpoint = $.catalogServerEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationRuntimeSsisCatalogInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationRuntimeSsisCatalogInfoArgs $;

        public Builder() {
            $ = new IntegrationRuntimeSsisCatalogInfoArgs();
        }

        public Builder(IntegrationRuntimeSsisCatalogInfoArgs defaults) {
            $ = new IntegrationRuntimeSsisCatalogInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogAdminPassword The password of the administrator user account of the catalog database.
         * 
         * @return builder
         * 
         */
        public Builder catalogAdminPassword(@Nullable Output<SecureStringArgs> catalogAdminPassword) {
            $.catalogAdminPassword = catalogAdminPassword;
            return this;
        }

        /**
         * @param catalogAdminPassword The password of the administrator user account of the catalog database.
         * 
         * @return builder
         * 
         */
        public Builder catalogAdminPassword(SecureStringArgs catalogAdminPassword) {
            return catalogAdminPassword(Output.of(catalogAdminPassword));
        }

        /**
         * @param catalogAdminUserName The administrator user name of catalog database.
         * 
         * @return builder
         * 
         */
        public Builder catalogAdminUserName(@Nullable Output<String> catalogAdminUserName) {
            $.catalogAdminUserName = catalogAdminUserName;
            return this;
        }

        /**
         * @param catalogAdminUserName The administrator user name of catalog database.
         * 
         * @return builder
         * 
         */
        public Builder catalogAdminUserName(String catalogAdminUserName) {
            return catalogAdminUserName(Output.of(catalogAdminUserName));
        }

        /**
         * @param catalogPricingTier The pricing tier for the catalog database. The valid values could be found in https://azure.microsoft.com/en-us/pricing/details/sql-database/
         * 
         * @return builder
         * 
         */
        public Builder catalogPricingTier(@Nullable Output<Either<String,IntegrationRuntimeSsisCatalogPricingTier>> catalogPricingTier) {
            $.catalogPricingTier = catalogPricingTier;
            return this;
        }

        /**
         * @param catalogPricingTier The pricing tier for the catalog database. The valid values could be found in https://azure.microsoft.com/en-us/pricing/details/sql-database/
         * 
         * @return builder
         * 
         */
        public Builder catalogPricingTier(Either<String,IntegrationRuntimeSsisCatalogPricingTier> catalogPricingTier) {
            return catalogPricingTier(Output.of(catalogPricingTier));
        }

        /**
         * @param catalogPricingTier The pricing tier for the catalog database. The valid values could be found in https://azure.microsoft.com/en-us/pricing/details/sql-database/
         * 
         * @return builder
         * 
         */
        public Builder catalogPricingTier(String catalogPricingTier) {
            return catalogPricingTier(Either.ofLeft(catalogPricingTier));
        }

        /**
         * @param catalogPricingTier The pricing tier for the catalog database. The valid values could be found in https://azure.microsoft.com/en-us/pricing/details/sql-database/
         * 
         * @return builder
         * 
         */
        public Builder catalogPricingTier(IntegrationRuntimeSsisCatalogPricingTier catalogPricingTier) {
            return catalogPricingTier(Either.ofRight(catalogPricingTier));
        }

        /**
         * @param catalogServerEndpoint The catalog database server URL.
         * 
         * @return builder
         * 
         */
        public Builder catalogServerEndpoint(@Nullable Output<String> catalogServerEndpoint) {
            $.catalogServerEndpoint = catalogServerEndpoint;
            return this;
        }

        /**
         * @param catalogServerEndpoint The catalog database server URL.
         * 
         * @return builder
         * 
         */
        public Builder catalogServerEndpoint(String catalogServerEndpoint) {
            return catalogServerEndpoint(Output.of(catalogServerEndpoint));
        }

        public IntegrationRuntimeSsisCatalogInfoArgs build() {
            return $;
        }
    }

}
