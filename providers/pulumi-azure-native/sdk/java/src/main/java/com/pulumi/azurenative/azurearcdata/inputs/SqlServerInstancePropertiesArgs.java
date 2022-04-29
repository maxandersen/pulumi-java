// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurearcdata.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of SqlServerInstance.
 * 
 */
public final class SqlServerInstancePropertiesArgs extends ResourceArgs {

    public static final SqlServerInstancePropertiesArgs Empty = new SqlServerInstancePropertiesArgs();

    /**
     * SQL Server collation.
     * 
     */
    @Import(name="collation")
    private @Nullable Output<String> collation;

    /**
     * @return SQL Server collation.
     * 
     */
    public Optional<Output<String>> collation() {
        return Optional.ofNullable(this.collation);
    }

    /**
     * ARM Resource id of the container resource (Azure Arc for Servers).
     * 
     */
    @Import(name="containerResourceId", required=true)
    private Output<String> containerResourceId;

    /**
     * @return ARM Resource id of the container resource (Azure Arc for Servers).
     * 
     */
    public Output<String> containerResourceId() {
        return this.containerResourceId;
    }

    /**
     * SQL Server current version.
     * 
     */
    @Import(name="currentVersion")
    private @Nullable Output<String> currentVersion;

    /**
     * @return SQL Server current version.
     * 
     */
    public Optional<Output<String>> currentVersion() {
        return Optional.ofNullable(this.currentVersion);
    }

    /**
     * SQL Server edition.
     * 
     */
    @Import(name="edition")
    private @Nullable Output<String> edition;

    /**
     * @return SQL Server edition.
     * 
     */
    public Optional<Output<String>> edition() {
        return Optional.ofNullable(this.edition);
    }

    /**
     * SQL Server instance name.
     * 
     */
    @Import(name="instanceName")
    private @Nullable Output<String> instanceName;

    /**
     * @return SQL Server instance name.
     * 
     */
    public Optional<Output<String>> instanceName() {
        return Optional.ofNullable(this.instanceName);
    }

    /**
     * SQL Server license type.
     * 
     */
    @Import(name="licenseType")
    private @Nullable Output<String> licenseType;

    /**
     * @return SQL Server license type.
     * 
     */
    public Optional<Output<String>> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }

    /**
     * SQL Server update level.
     * 
     */
    @Import(name="patchLevel")
    private @Nullable Output<String> patchLevel;

    /**
     * @return SQL Server update level.
     * 
     */
    public Optional<Output<String>> patchLevel() {
        return Optional.ofNullable(this.patchLevel);
    }

    /**
     * SQL Server product ID.
     * 
     */
    @Import(name="productId")
    private @Nullable Output<String> productId;

    /**
     * @return SQL Server product ID.
     * 
     */
    public Optional<Output<String>> productId() {
        return Optional.ofNullable(this.productId);
    }

    /**
     * The cloud connectivity status.
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    /**
     * @return The cloud connectivity status.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     * Dynamic TCP ports used by SQL Server.
     * 
     */
    @Import(name="tcpDynamicPorts")
    private @Nullable Output<String> tcpDynamicPorts;

    /**
     * @return Dynamic TCP ports used by SQL Server.
     * 
     */
    public Optional<Output<String>> tcpDynamicPorts() {
        return Optional.ofNullable(this.tcpDynamicPorts);
    }

    /**
     * Static TCP ports used by SQL Server.
     * 
     */
    @Import(name="tcpStaticPorts")
    private @Nullable Output<String> tcpStaticPorts;

    /**
     * @return Static TCP ports used by SQL Server.
     * 
     */
    public Optional<Output<String>> tcpStaticPorts() {
        return Optional.ofNullable(this.tcpStaticPorts);
    }

    /**
     * The number of logical processors used by the SQL Server instance.
     * 
     */
    @Import(name="vCore")
    private @Nullable Output<String> vCore;

    /**
     * @return The number of logical processors used by the SQL Server instance.
     * 
     */
    public Optional<Output<String>> vCore() {
        return Optional.ofNullable(this.vCore);
    }

    /**
     * SQL Server version.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return SQL Server version.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private SqlServerInstancePropertiesArgs() {}

    private SqlServerInstancePropertiesArgs(SqlServerInstancePropertiesArgs $) {
        this.collation = $.collation;
        this.containerResourceId = $.containerResourceId;
        this.currentVersion = $.currentVersion;
        this.edition = $.edition;
        this.instanceName = $.instanceName;
        this.licenseType = $.licenseType;
        this.patchLevel = $.patchLevel;
        this.productId = $.productId;
        this.status = $.status;
        this.tcpDynamicPorts = $.tcpDynamicPorts;
        this.tcpStaticPorts = $.tcpStaticPorts;
        this.vCore = $.vCore;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlServerInstancePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlServerInstancePropertiesArgs $;

        public Builder() {
            $ = new SqlServerInstancePropertiesArgs();
        }

        public Builder(SqlServerInstancePropertiesArgs defaults) {
            $ = new SqlServerInstancePropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param collation SQL Server collation.
         * 
         * @return builder
         * 
         */
        public Builder collation(@Nullable Output<String> collation) {
            $.collation = collation;
            return this;
        }

        /**
         * @param collation SQL Server collation.
         * 
         * @return builder
         * 
         */
        public Builder collation(String collation) {
            return collation(Output.of(collation));
        }

        /**
         * @param containerResourceId ARM Resource id of the container resource (Azure Arc for Servers).
         * 
         * @return builder
         * 
         */
        public Builder containerResourceId(Output<String> containerResourceId) {
            $.containerResourceId = containerResourceId;
            return this;
        }

        /**
         * @param containerResourceId ARM Resource id of the container resource (Azure Arc for Servers).
         * 
         * @return builder
         * 
         */
        public Builder containerResourceId(String containerResourceId) {
            return containerResourceId(Output.of(containerResourceId));
        }

        /**
         * @param currentVersion SQL Server current version.
         * 
         * @return builder
         * 
         */
        public Builder currentVersion(@Nullable Output<String> currentVersion) {
            $.currentVersion = currentVersion;
            return this;
        }

        /**
         * @param currentVersion SQL Server current version.
         * 
         * @return builder
         * 
         */
        public Builder currentVersion(String currentVersion) {
            return currentVersion(Output.of(currentVersion));
        }

        /**
         * @param edition SQL Server edition.
         * 
         * @return builder
         * 
         */
        public Builder edition(@Nullable Output<String> edition) {
            $.edition = edition;
            return this;
        }

        /**
         * @param edition SQL Server edition.
         * 
         * @return builder
         * 
         */
        public Builder edition(String edition) {
            return edition(Output.of(edition));
        }

        /**
         * @param instanceName SQL Server instance name.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(@Nullable Output<String> instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @param instanceName SQL Server instance name.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            return instanceName(Output.of(instanceName));
        }

        /**
         * @param licenseType SQL Server license type.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(@Nullable Output<String> licenseType) {
            $.licenseType = licenseType;
            return this;
        }

        /**
         * @param licenseType SQL Server license type.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(String licenseType) {
            return licenseType(Output.of(licenseType));
        }

        /**
         * @param patchLevel SQL Server update level.
         * 
         * @return builder
         * 
         */
        public Builder patchLevel(@Nullable Output<String> patchLevel) {
            $.patchLevel = patchLevel;
            return this;
        }

        /**
         * @param patchLevel SQL Server update level.
         * 
         * @return builder
         * 
         */
        public Builder patchLevel(String patchLevel) {
            return patchLevel(Output.of(patchLevel));
        }

        /**
         * @param productId SQL Server product ID.
         * 
         * @return builder
         * 
         */
        public Builder productId(@Nullable Output<String> productId) {
            $.productId = productId;
            return this;
        }

        /**
         * @param productId SQL Server product ID.
         * 
         * @return builder
         * 
         */
        public Builder productId(String productId) {
            return productId(Output.of(productId));
        }

        /**
         * @param status The cloud connectivity status.
         * 
         * @return builder
         * 
         */
        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The cloud connectivity status.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tcpDynamicPorts Dynamic TCP ports used by SQL Server.
         * 
         * @return builder
         * 
         */
        public Builder tcpDynamicPorts(@Nullable Output<String> tcpDynamicPorts) {
            $.tcpDynamicPorts = tcpDynamicPorts;
            return this;
        }

        /**
         * @param tcpDynamicPorts Dynamic TCP ports used by SQL Server.
         * 
         * @return builder
         * 
         */
        public Builder tcpDynamicPorts(String tcpDynamicPorts) {
            return tcpDynamicPorts(Output.of(tcpDynamicPorts));
        }

        /**
         * @param tcpStaticPorts Static TCP ports used by SQL Server.
         * 
         * @return builder
         * 
         */
        public Builder tcpStaticPorts(@Nullable Output<String> tcpStaticPorts) {
            $.tcpStaticPorts = tcpStaticPorts;
            return this;
        }

        /**
         * @param tcpStaticPorts Static TCP ports used by SQL Server.
         * 
         * @return builder
         * 
         */
        public Builder tcpStaticPorts(String tcpStaticPorts) {
            return tcpStaticPorts(Output.of(tcpStaticPorts));
        }

        /**
         * @param vCore The number of logical processors used by the SQL Server instance.
         * 
         * @return builder
         * 
         */
        public Builder vCore(@Nullable Output<String> vCore) {
            $.vCore = vCore;
            return this;
        }

        /**
         * @param vCore The number of logical processors used by the SQL Server instance.
         * 
         * @return builder
         * 
         */
        public Builder vCore(String vCore) {
            return vCore(Output.of(vCore));
        }

        /**
         * @param version SQL Server version.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version SQL Server version.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public SqlServerInstancePropertiesArgs build() {
            $.containerResourceId = Objects.requireNonNull($.containerResourceId, "expected parameter 'containerResourceId' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
