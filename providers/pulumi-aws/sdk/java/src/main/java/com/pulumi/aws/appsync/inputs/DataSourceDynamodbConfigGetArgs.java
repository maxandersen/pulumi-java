// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.inputs;

import com.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigDeltaSyncConfigGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceDynamodbConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceDynamodbConfigGetArgs Empty = new DataSourceDynamodbConfigGetArgs();

    @Import(name="deltaSyncConfig")
    private @Nullable Output<DataSourceDynamodbConfigDeltaSyncConfigGetArgs> deltaSyncConfig;

    public Optional<Output<DataSourceDynamodbConfigDeltaSyncConfigGetArgs>> deltaSyncConfig() {
        return Optional.ofNullable(this.deltaSyncConfig);
    }

    /**
     * AWS Region for RDS HTTP endpoint. Defaults to current region.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Name of the DynamoDB table.
     * 
     */
    @Import(name="tableName", required=true)
    private Output<String> tableName;

    public Output<String> tableName() {
        return this.tableName;
    }

    /**
     * Set to `true` to use Amazon Cognito credentials with this data source.
     * 
     */
    @Import(name="useCallerCredentials")
    private @Nullable Output<Boolean> useCallerCredentials;

    public Optional<Output<Boolean>> useCallerCredentials() {
        return Optional.ofNullable(this.useCallerCredentials);
    }

    @Import(name="versioned")
    private @Nullable Output<Boolean> versioned;

    public Optional<Output<Boolean>> versioned() {
        return Optional.ofNullable(this.versioned);
    }

    private DataSourceDynamodbConfigGetArgs() {}

    private DataSourceDynamodbConfigGetArgs(DataSourceDynamodbConfigGetArgs $) {
        this.deltaSyncConfig = $.deltaSyncConfig;
        this.region = $.region;
        this.tableName = $.tableName;
        this.useCallerCredentials = $.useCallerCredentials;
        this.versioned = $.versioned;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceDynamodbConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceDynamodbConfigGetArgs $;

        public Builder() {
            $ = new DataSourceDynamodbConfigGetArgs();
        }

        public Builder(DataSourceDynamodbConfigGetArgs defaults) {
            $ = new DataSourceDynamodbConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder deltaSyncConfig(@Nullable Output<DataSourceDynamodbConfigDeltaSyncConfigGetArgs> deltaSyncConfig) {
            $.deltaSyncConfig = deltaSyncConfig;
            return this;
        }

        public Builder deltaSyncConfig(DataSourceDynamodbConfigDeltaSyncConfigGetArgs deltaSyncConfig) {
            return deltaSyncConfig(Output.of(deltaSyncConfig));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder tableName(Output<String> tableName) {
            $.tableName = tableName;
            return this;
        }

        public Builder tableName(String tableName) {
            return tableName(Output.of(tableName));
        }

        public Builder useCallerCredentials(@Nullable Output<Boolean> useCallerCredentials) {
            $.useCallerCredentials = useCallerCredentials;
            return this;
        }

        public Builder useCallerCredentials(Boolean useCallerCredentials) {
            return useCallerCredentials(Output.of(useCallerCredentials));
        }

        public Builder versioned(@Nullable Output<Boolean> versioned) {
            $.versioned = versioned;
            return this;
        }

        public Builder versioned(Boolean versioned) {
            return versioned(Output.of(versioned));
        }

        public DataSourceDynamodbConfigGetArgs build() {
            $.tableName = Objects.requireNonNull($.tableName, "expected parameter 'tableName' to be non-null");
            return $;
        }
    }

}
