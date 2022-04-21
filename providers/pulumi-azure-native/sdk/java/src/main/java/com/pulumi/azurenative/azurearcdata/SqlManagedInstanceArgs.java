// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurearcdata;

import com.pulumi.azurenative.azurearcdata.inputs.ExtendedLocationArgs;
import com.pulumi.azurenative.azurearcdata.inputs.SqlManagedInstancePropertiesArgs;
import com.pulumi.azurenative.azurearcdata.inputs.SqlManagedInstanceSkuArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlManagedInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlManagedInstanceArgs Empty = new SqlManagedInstanceArgs();

    /**
     * The extendedLocation of the resource.
     * 
     */
    @Import(name="extendedLocation")
    private @Nullable Output<ExtendedLocationArgs> extendedLocation;

    public Optional<Output<ExtendedLocationArgs>> extendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * null
     * 
     */
    @Import(name="properties", required=true)
    private Output<SqlManagedInstancePropertiesArgs> properties;

    public Output<SqlManagedInstancePropertiesArgs> properties() {
        return this.properties;
    }

    /**
     * The name of the Azure resource group
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource sku.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<SqlManagedInstanceSkuArgs> sku;

    public Optional<Output<SqlManagedInstanceSkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * The name of SQL Managed Instances
     * 
     */
    @Import(name="sqlManagedInstanceName")
    private @Nullable Output<String> sqlManagedInstanceName;

    public Optional<Output<String>> sqlManagedInstanceName() {
        return Optional.ofNullable(this.sqlManagedInstanceName);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SqlManagedInstanceArgs() {}

    private SqlManagedInstanceArgs(SqlManagedInstanceArgs $) {
        this.extendedLocation = $.extendedLocation;
        this.location = $.location;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.sqlManagedInstanceName = $.sqlManagedInstanceName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlManagedInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlManagedInstanceArgs $;

        public Builder() {
            $ = new SqlManagedInstanceArgs();
        }

        public Builder(SqlManagedInstanceArgs defaults) {
            $ = new SqlManagedInstanceArgs(Objects.requireNonNull(defaults));
        }

        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            $.extendedLocation = extendedLocation;
            return this;
        }

        public Builder extendedLocation(ExtendedLocationArgs extendedLocation) {
            return extendedLocation(Output.of(extendedLocation));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder properties(Output<SqlManagedInstancePropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(SqlManagedInstancePropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder sku(@Nullable Output<SqlManagedInstanceSkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(SqlManagedInstanceSkuArgs sku) {
            return sku(Output.of(sku));
        }

        public Builder sqlManagedInstanceName(@Nullable Output<String> sqlManagedInstanceName) {
            $.sqlManagedInstanceName = sqlManagedInstanceName;
            return this;
        }

        public Builder sqlManagedInstanceName(String sqlManagedInstanceName) {
            return sqlManagedInstanceName(Output.of(sqlManagedInstanceName));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public SqlManagedInstanceArgs build() {
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
