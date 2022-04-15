// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.documentdb.inputs.DataCenterResourcePropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CassandraDataCenterArgs extends io.pulumi.resources.ResourceArgs {

    public static final CassandraDataCenterArgs Empty = new CassandraDataCenterArgs();

    /**
     * Managed Cassandra cluster name.
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * Data center name in a managed Cassandra cluster.
     * 
     */
    @Import(name="dataCenterName")
      private final @Nullable Output<String> dataCenterName;

    public Output<String> dataCenterName() {
        return this.dataCenterName == null ? Codegen.empty() : this.dataCenterName;
    }

    /**
     * Properties of a managed Cassandra data center.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<DataCenterResourcePropertiesArgs> properties;

    public Output<DataCenterResourcePropertiesArgs> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    public CassandraDataCenterArgs(
        Output<String> clusterName,
        @Nullable Output<String> dataCenterName,
        @Nullable Output<DataCenterResourcePropertiesArgs> properties,
        Output<String> resourceGroupName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.dataCenterName = dataCenterName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private CassandraDataCenterArgs() {
        this.clusterName = Codegen.empty();
        this.dataCenterName = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CassandraDataCenterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clusterName;
        private @Nullable Output<String> dataCenterName;
        private @Nullable Output<DataCenterResourcePropertiesArgs> properties;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(CassandraDataCenterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.dataCenterName = defaults.dataCenterName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }
        public Builder dataCenterName(@Nullable Output<String> dataCenterName) {
            this.dataCenterName = dataCenterName;
            return this;
        }
        public Builder dataCenterName(@Nullable String dataCenterName) {
            this.dataCenterName = Codegen.ofNullable(dataCenterName);
            return this;
        }
        public Builder properties(@Nullable Output<DataCenterResourcePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable DataCenterResourcePropertiesArgs properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public CassandraDataCenterArgs build() {
            return new CassandraDataCenterArgs(clusterName, dataCenterName, properties, resourceGroupName);
        }
    }
}
