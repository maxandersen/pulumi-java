// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights;

import com.pulumi.azurenative.operationalinsights.enums.DataSourceKind;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceArgs Empty = new DataSourceArgs();

    /**
     * The name of the datasource resource.
     * 
     */
    @Import(name="dataSourceName")
      private final @Nullable Output<String> dataSourceName;

    public Output<String> dataSourceName() {
        return this.dataSourceName == null ? Codegen.empty() : this.dataSourceName;
    }

    /**
     * The kind of the DataSource.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<Either<String,DataSourceKind>> kind;

    public Output<Either<String,DataSourceKind>> kind() {
        return this.kind;
    }

    /**
     * The data source properties in raw json format, each kind of data source have it&#39;s own schema.
     * 
     */
    @Import(name="properties", required=true)
      private final Output<Object> properties;

    public Output<Object> properties() {
        return this.properties;
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

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    public DataSourceArgs(
        @Nullable Output<String> dataSourceName,
        Output<Either<String,DataSourceKind>> kind,
        Output<Object> properties,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        Output<String> workspaceName) {
        this.dataSourceName = dataSourceName;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private DataSourceArgs() {
        this.dataSourceName = Codegen.empty();
        this.kind = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
        this.workspaceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dataSourceName;
        private Output<Either<String,DataSourceKind>> kind;
        private Output<Object> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSourceName = defaults.dataSourceName;
    	      this.kind = defaults.kind;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder dataSourceName(@Nullable Output<String> dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public Builder dataSourceName(@Nullable String dataSourceName) {
            this.dataSourceName = Codegen.ofNullable(dataSourceName);
            return this;
        }
        public Builder kind(Output<Either<String,DataSourceKind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(Either<String,DataSourceKind> kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder properties(Output<Object> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder properties(Object properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public DataSourceArgs build() {
            return new DataSourceArgs(dataSourceName, kind, properties, resourceGroupName, tags, workspaceName);
        }
    }
}
