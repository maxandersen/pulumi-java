// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.IntegrationRuntimeEdition;
import com.pulumi.azurenative.datafactory.enums.IntegrationRuntimeLicenseType;
import com.pulumi.azurenative.datafactory.inputs.AzPowerShellSetupArgs;
import com.pulumi.azurenative.datafactory.inputs.CmdkeySetupArgs;
import com.pulumi.azurenative.datafactory.inputs.ComponentSetupArgs;
import com.pulumi.azurenative.datafactory.inputs.CredentialReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.EnvironmentVariableSetupArgs;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeCustomSetupScriptPropertiesArgs;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeDataProxyPropertiesArgs;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeSsisCatalogInfoArgs;
import com.pulumi.azurenative.datafactory.inputs.PackageStoreArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SSIS properties for managed integration runtime.
 * 
 */
public final class IntegrationRuntimeSsisPropertiesArgs extends ResourceArgs {

    public static final IntegrationRuntimeSsisPropertiesArgs Empty = new IntegrationRuntimeSsisPropertiesArgs();

    /**
     * Catalog information for managed dedicated integration runtime.
     * 
     */
    @Import(name="catalogInfo")
    private @Nullable Output<IntegrationRuntimeSsisCatalogInfoArgs> catalogInfo;

    /**
     * @return Catalog information for managed dedicated integration runtime.
     * 
     */
    public Optional<Output<IntegrationRuntimeSsisCatalogInfoArgs>> catalogInfo() {
        return Optional.ofNullable(this.catalogInfo);
    }

    /**
     * The credential reference containing authentication information.
     * 
     */
    @Import(name="credential")
    private @Nullable Output<CredentialReferenceArgs> credential;

    /**
     * @return The credential reference containing authentication information.
     * 
     */
    public Optional<Output<CredentialReferenceArgs>> credential() {
        return Optional.ofNullable(this.credential);
    }

    /**
     * Custom setup script properties for a managed dedicated integration runtime.
     * 
     */
    @Import(name="customSetupScriptProperties")
    private @Nullable Output<IntegrationRuntimeCustomSetupScriptPropertiesArgs> customSetupScriptProperties;

    /**
     * @return Custom setup script properties for a managed dedicated integration runtime.
     * 
     */
    public Optional<Output<IntegrationRuntimeCustomSetupScriptPropertiesArgs>> customSetupScriptProperties() {
        return Optional.ofNullable(this.customSetupScriptProperties);
    }

    /**
     * Data proxy properties for a managed dedicated integration runtime.
     * 
     */
    @Import(name="dataProxyProperties")
    private @Nullable Output<IntegrationRuntimeDataProxyPropertiesArgs> dataProxyProperties;

    /**
     * @return Data proxy properties for a managed dedicated integration runtime.
     * 
     */
    public Optional<Output<IntegrationRuntimeDataProxyPropertiesArgs>> dataProxyProperties() {
        return Optional.ofNullable(this.dataProxyProperties);
    }

    /**
     * The edition for the SSIS Integration Runtime
     * 
     */
    @Import(name="edition")
    private @Nullable Output<Either<String,IntegrationRuntimeEdition>> edition;

    /**
     * @return The edition for the SSIS Integration Runtime
     * 
     */
    public Optional<Output<Either<String,IntegrationRuntimeEdition>>> edition() {
        return Optional.ofNullable(this.edition);
    }

    /**
     * Custom setup without script properties for a SSIS integration runtime.
     * 
     */
    @Import(name="expressCustomSetupProperties")
    private @Nullable Output<List<Object>> expressCustomSetupProperties;

    /**
     * @return Custom setup without script properties for a SSIS integration runtime.
     * 
     */
    public Optional<Output<List<Object>>> expressCustomSetupProperties() {
        return Optional.ofNullable(this.expressCustomSetupProperties);
    }

    /**
     * License type for bringing your own license scenario.
     * 
     */
    @Import(name="licenseType")
    private @Nullable Output<Either<String,IntegrationRuntimeLicenseType>> licenseType;

    /**
     * @return License type for bringing your own license scenario.
     * 
     */
    public Optional<Output<Either<String,IntegrationRuntimeLicenseType>>> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }

    /**
     * Package stores for the SSIS Integration Runtime.
     * 
     */
    @Import(name="packageStores")
    private @Nullable Output<List<PackageStoreArgs>> packageStores;

    /**
     * @return Package stores for the SSIS Integration Runtime.
     * 
     */
    public Optional<Output<List<PackageStoreArgs>>> packageStores() {
        return Optional.ofNullable(this.packageStores);
    }

    private IntegrationRuntimeSsisPropertiesArgs() {}

    private IntegrationRuntimeSsisPropertiesArgs(IntegrationRuntimeSsisPropertiesArgs $) {
        this.catalogInfo = $.catalogInfo;
        this.credential = $.credential;
        this.customSetupScriptProperties = $.customSetupScriptProperties;
        this.dataProxyProperties = $.dataProxyProperties;
        this.edition = $.edition;
        this.expressCustomSetupProperties = $.expressCustomSetupProperties;
        this.licenseType = $.licenseType;
        this.packageStores = $.packageStores;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationRuntimeSsisPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationRuntimeSsisPropertiesArgs $;

        public Builder() {
            $ = new IntegrationRuntimeSsisPropertiesArgs();
        }

        public Builder(IntegrationRuntimeSsisPropertiesArgs defaults) {
            $ = new IntegrationRuntimeSsisPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogInfo Catalog information for managed dedicated integration runtime.
         * 
         * @return builder
         * 
         */
        public Builder catalogInfo(@Nullable Output<IntegrationRuntimeSsisCatalogInfoArgs> catalogInfo) {
            $.catalogInfo = catalogInfo;
            return this;
        }

        /**
         * @param catalogInfo Catalog information for managed dedicated integration runtime.
         * 
         * @return builder
         * 
         */
        public Builder catalogInfo(IntegrationRuntimeSsisCatalogInfoArgs catalogInfo) {
            return catalogInfo(Output.of(catalogInfo));
        }

        /**
         * @param credential The credential reference containing authentication information.
         * 
         * @return builder
         * 
         */
        public Builder credential(@Nullable Output<CredentialReferenceArgs> credential) {
            $.credential = credential;
            return this;
        }

        /**
         * @param credential The credential reference containing authentication information.
         * 
         * @return builder
         * 
         */
        public Builder credential(CredentialReferenceArgs credential) {
            return credential(Output.of(credential));
        }

        /**
         * @param customSetupScriptProperties Custom setup script properties for a managed dedicated integration runtime.
         * 
         * @return builder
         * 
         */
        public Builder customSetupScriptProperties(@Nullable Output<IntegrationRuntimeCustomSetupScriptPropertiesArgs> customSetupScriptProperties) {
            $.customSetupScriptProperties = customSetupScriptProperties;
            return this;
        }

        /**
         * @param customSetupScriptProperties Custom setup script properties for a managed dedicated integration runtime.
         * 
         * @return builder
         * 
         */
        public Builder customSetupScriptProperties(IntegrationRuntimeCustomSetupScriptPropertiesArgs customSetupScriptProperties) {
            return customSetupScriptProperties(Output.of(customSetupScriptProperties));
        }

        /**
         * @param dataProxyProperties Data proxy properties for a managed dedicated integration runtime.
         * 
         * @return builder
         * 
         */
        public Builder dataProxyProperties(@Nullable Output<IntegrationRuntimeDataProxyPropertiesArgs> dataProxyProperties) {
            $.dataProxyProperties = dataProxyProperties;
            return this;
        }

        /**
         * @param dataProxyProperties Data proxy properties for a managed dedicated integration runtime.
         * 
         * @return builder
         * 
         */
        public Builder dataProxyProperties(IntegrationRuntimeDataProxyPropertiesArgs dataProxyProperties) {
            return dataProxyProperties(Output.of(dataProxyProperties));
        }

        /**
         * @param edition The edition for the SSIS Integration Runtime
         * 
         * @return builder
         * 
         */
        public Builder edition(@Nullable Output<Either<String,IntegrationRuntimeEdition>> edition) {
            $.edition = edition;
            return this;
        }

        /**
         * @param edition The edition for the SSIS Integration Runtime
         * 
         * @return builder
         * 
         */
        public Builder edition(Either<String,IntegrationRuntimeEdition> edition) {
            return edition(Output.of(edition));
        }

        /**
         * @param edition The edition for the SSIS Integration Runtime
         * 
         * @return builder
         * 
         */
        public Builder edition(String edition) {
            return edition(Either.ofLeft(edition));
        }

        /**
         * @param edition The edition for the SSIS Integration Runtime
         * 
         * @return builder
         * 
         */
        public Builder edition(IntegrationRuntimeEdition edition) {
            return edition(Either.ofRight(edition));
        }

        /**
         * @param expressCustomSetupProperties Custom setup without script properties for a SSIS integration runtime.
         * 
         * @return builder
         * 
         */
        public Builder expressCustomSetupProperties(@Nullable Output<List<Object>> expressCustomSetupProperties) {
            $.expressCustomSetupProperties = expressCustomSetupProperties;
            return this;
        }

        /**
         * @param expressCustomSetupProperties Custom setup without script properties for a SSIS integration runtime.
         * 
         * @return builder
         * 
         */
        public Builder expressCustomSetupProperties(List<Object> expressCustomSetupProperties) {
            return expressCustomSetupProperties(Output.of(expressCustomSetupProperties));
        }

        /**
         * @param expressCustomSetupProperties Custom setup without script properties for a SSIS integration runtime.
         * 
         * @return builder
         * 
         */
        public Builder expressCustomSetupProperties(Object... expressCustomSetupProperties) {
            return expressCustomSetupProperties(List.of(expressCustomSetupProperties));
        }

        /**
         * @param licenseType License type for bringing your own license scenario.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(@Nullable Output<Either<String,IntegrationRuntimeLicenseType>> licenseType) {
            $.licenseType = licenseType;
            return this;
        }

        /**
         * @param licenseType License type for bringing your own license scenario.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(Either<String,IntegrationRuntimeLicenseType> licenseType) {
            return licenseType(Output.of(licenseType));
        }

        /**
         * @param licenseType License type for bringing your own license scenario.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(String licenseType) {
            return licenseType(Either.ofLeft(licenseType));
        }

        /**
         * @param licenseType License type for bringing your own license scenario.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(IntegrationRuntimeLicenseType licenseType) {
            return licenseType(Either.ofRight(licenseType));
        }

        /**
         * @param packageStores Package stores for the SSIS Integration Runtime.
         * 
         * @return builder
         * 
         */
        public Builder packageStores(@Nullable Output<List<PackageStoreArgs>> packageStores) {
            $.packageStores = packageStores;
            return this;
        }

        /**
         * @param packageStores Package stores for the SSIS Integration Runtime.
         * 
         * @return builder
         * 
         */
        public Builder packageStores(List<PackageStoreArgs> packageStores) {
            return packageStores(Output.of(packageStores));
        }

        /**
         * @param packageStores Package stores for the SSIS Integration Runtime.
         * 
         * @return builder
         * 
         */
        public Builder packageStores(PackageStoreArgs... packageStores) {
            return packageStores(List.of(packageStores));
        }

        public IntegrationRuntimeSsisPropertiesArgs build() {
            return $;
        }
    }

}
