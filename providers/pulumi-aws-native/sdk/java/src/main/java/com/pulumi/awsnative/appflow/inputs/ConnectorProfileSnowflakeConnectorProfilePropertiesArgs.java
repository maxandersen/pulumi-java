// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorProfileSnowflakeConnectorProfilePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileSnowflakeConnectorProfilePropertiesArgs Empty = new ConnectorProfileSnowflakeConnectorProfilePropertiesArgs();

    /**
     * The name of the account.
     * 
     */
    @Import(name="accountName")
    private @Nullable Output<String> accountName;

    /**
     * @return The name of the account.
     * 
     */
    public Optional<Output<String>> accountName() {
        return Optional.ofNullable(this.accountName);
    }

    /**
     * The name of the Amazon S3 bucket associated with Snowﬂake.
     * 
     */
    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    /**
     * @return The name of the Amazon S3 bucket associated with Snowﬂake.
     * 
     */
    public Output<String> bucketName() {
        return this.bucketName;
    }

    /**
     * The bucket prefix that refers to the Amazon S3 bucket associated with Snowﬂake.
     * 
     */
    @Import(name="bucketPrefix")
    private @Nullable Output<String> bucketPrefix;

    /**
     * @return The bucket prefix that refers to the Amazon S3 bucket associated with Snowﬂake.
     * 
     */
    public Optional<Output<String>> bucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }

    /**
     * The Snowﬂake Private Link service name to be used for private data transfers.
     * 
     */
    @Import(name="privateLinkServiceName")
    private @Nullable Output<String> privateLinkServiceName;

    /**
     * @return The Snowﬂake Private Link service name to be used for private data transfers.
     * 
     */
    public Optional<Output<String>> privateLinkServiceName() {
        return Optional.ofNullable(this.privateLinkServiceName);
    }

    /**
     * The region of the Snowﬂake account.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region of the Snowﬂake account.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The name of the Amazon S3 stage that was created while setting up an Amazon S3 stage in the
     * Snowﬂake account. This is written in the following format: &lt; Database&gt;&lt; Schema&gt;&lt;Stage Name&gt;.
     * 
     */
    @Import(name="stage", required=true)
    private Output<String> stage;

    /**
     * @return The name of the Amazon S3 stage that was created while setting up an Amazon S3 stage in the
     * Snowﬂake account. This is written in the following format: &lt; Database&gt;&lt; Schema&gt;&lt;Stage Name&gt;.
     * 
     */
    public Output<String> stage() {
        return this.stage;
    }

    /**
     * The name of the Snowﬂake warehouse.
     * 
     */
    @Import(name="warehouse", required=true)
    private Output<String> warehouse;

    /**
     * @return The name of the Snowﬂake warehouse.
     * 
     */
    public Output<String> warehouse() {
        return this.warehouse;
    }

    private ConnectorProfileSnowflakeConnectorProfilePropertiesArgs() {}

    private ConnectorProfileSnowflakeConnectorProfilePropertiesArgs(ConnectorProfileSnowflakeConnectorProfilePropertiesArgs $) {
        this.accountName = $.accountName;
        this.bucketName = $.bucketName;
        this.bucketPrefix = $.bucketPrefix;
        this.privateLinkServiceName = $.privateLinkServiceName;
        this.region = $.region;
        this.stage = $.stage;
        this.warehouse = $.warehouse;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorProfileSnowflakeConnectorProfilePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorProfileSnowflakeConnectorProfilePropertiesArgs $;

        public Builder() {
            $ = new ConnectorProfileSnowflakeConnectorProfilePropertiesArgs();
        }

        public Builder(ConnectorProfileSnowflakeConnectorProfilePropertiesArgs defaults) {
            $ = new ConnectorProfileSnowflakeConnectorProfilePropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(@Nullable Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param bucketName The name of the Amazon S3 bucket associated with Snowﬂake.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName The name of the Amazon S3 bucket associated with Snowﬂake.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        /**
         * @param bucketPrefix The bucket prefix that refers to the Amazon S3 bucket associated with Snowﬂake.
         * 
         * @return builder
         * 
         */
        public Builder bucketPrefix(@Nullable Output<String> bucketPrefix) {
            $.bucketPrefix = bucketPrefix;
            return this;
        }

        /**
         * @param bucketPrefix The bucket prefix that refers to the Amazon S3 bucket associated with Snowﬂake.
         * 
         * @return builder
         * 
         */
        public Builder bucketPrefix(String bucketPrefix) {
            return bucketPrefix(Output.of(bucketPrefix));
        }

        /**
         * @param privateLinkServiceName The Snowﬂake Private Link service name to be used for private data transfers.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceName(@Nullable Output<String> privateLinkServiceName) {
            $.privateLinkServiceName = privateLinkServiceName;
            return this;
        }

        /**
         * @param privateLinkServiceName The Snowﬂake Private Link service name to be used for private data transfers.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkServiceName(String privateLinkServiceName) {
            return privateLinkServiceName(Output.of(privateLinkServiceName));
        }

        /**
         * @param region The region of the Snowﬂake account.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region of the Snowﬂake account.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param stage The name of the Amazon S3 stage that was created while setting up an Amazon S3 stage in the
         * Snowﬂake account. This is written in the following format: &lt; Database&gt;&lt; Schema&gt;&lt;Stage Name&gt;.
         * 
         * @return builder
         * 
         */
        public Builder stage(Output<String> stage) {
            $.stage = stage;
            return this;
        }

        /**
         * @param stage The name of the Amazon S3 stage that was created while setting up an Amazon S3 stage in the
         * Snowﬂake account. This is written in the following format: &lt; Database&gt;&lt; Schema&gt;&lt;Stage Name&gt;.
         * 
         * @return builder
         * 
         */
        public Builder stage(String stage) {
            return stage(Output.of(stage));
        }

        /**
         * @param warehouse The name of the Snowﬂake warehouse.
         * 
         * @return builder
         * 
         */
        public Builder warehouse(Output<String> warehouse) {
            $.warehouse = warehouse;
            return this;
        }

        /**
         * @param warehouse The name of the Snowﬂake warehouse.
         * 
         * @return builder
         * 
         */
        public Builder warehouse(String warehouse) {
            return warehouse(Output.of(warehouse));
        }

        public ConnectorProfileSnowflakeConnectorProfilePropertiesArgs build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            $.stage = Objects.requireNonNull($.stage, "expected parameter 'stage' to be non-null");
            $.warehouse = Objects.requireNonNull($.warehouse, "expected parameter 'warehouse' to be non-null");
            return $;
        }
    }

}
