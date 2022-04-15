// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.enums.SensitivityLabelRank;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedDatabaseSensitivityLabelArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedDatabaseSensitivityLabelArgs Empty = new ManagedDatabaseSensitivityLabelArgs();

    /**
     * The name of the column.
     * 
     */
    @Import(name="columnName", required=true)
      private final Output<String> columnName;

    public Output<String> columnName() {
        return this.columnName;
    }

    /**
     * The name of the database.
     * 
     */
    @Import(name="databaseName", required=true)
      private final Output<String> databaseName;

    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * The information type.
     * 
     */
    @Import(name="informationType")
      private final @Nullable Output<String> informationType;

    public Output<String> informationType() {
        return this.informationType == null ? Codegen.empty() : this.informationType;
    }

    /**
     * The information type ID.
     * 
     */
    @Import(name="informationTypeId")
      private final @Nullable Output<String> informationTypeId;

    public Output<String> informationTypeId() {
        return this.informationTypeId == null ? Codegen.empty() : this.informationTypeId;
    }

    /**
     * The label ID.
     * 
     */
    @Import(name="labelId")
      private final @Nullable Output<String> labelId;

    public Output<String> labelId() {
        return this.labelId == null ? Codegen.empty() : this.labelId;
    }

    /**
     * The label name.
     * 
     */
    @Import(name="labelName")
      private final @Nullable Output<String> labelName;

    public Output<String> labelName() {
        return this.labelName == null ? Codegen.empty() : this.labelName;
    }

    /**
     * The name of the managed instance.
     * 
     */
    @Import(name="managedInstanceName", required=true)
      private final Output<String> managedInstanceName;

    public Output<String> managedInstanceName() {
        return this.managedInstanceName;
    }

    @Import(name="rank")
      private final @Nullable Output<SensitivityLabelRank> rank;

    public Output<SensitivityLabelRank> rank() {
        return this.rank == null ? Codegen.empty() : this.rank;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the schema.
     * 
     */
    @Import(name="schemaName", required=true)
      private final Output<String> schemaName;

    public Output<String> schemaName() {
        return this.schemaName;
    }

    /**
     * The source of the sensitivity label.
     * 
     */
    @Import(name="sensitivityLabelSource")
      private final @Nullable Output<String> sensitivityLabelSource;

    public Output<String> sensitivityLabelSource() {
        return this.sensitivityLabelSource == null ? Codegen.empty() : this.sensitivityLabelSource;
    }

    /**
     * The name of the table.
     * 
     */
    @Import(name="tableName", required=true)
      private final Output<String> tableName;

    public Output<String> tableName() {
        return this.tableName;
    }

    public ManagedDatabaseSensitivityLabelArgs(
        Output<String> columnName,
        Output<String> databaseName,
        @Nullable Output<String> informationType,
        @Nullable Output<String> informationTypeId,
        @Nullable Output<String> labelId,
        @Nullable Output<String> labelName,
        Output<String> managedInstanceName,
        @Nullable Output<SensitivityLabelRank> rank,
        Output<String> resourceGroupName,
        Output<String> schemaName,
        @Nullable Output<String> sensitivityLabelSource,
        Output<String> tableName) {
        this.columnName = Objects.requireNonNull(columnName, "expected parameter 'columnName' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.informationType = informationType;
        this.informationTypeId = informationTypeId;
        this.labelId = labelId;
        this.labelName = labelName;
        this.managedInstanceName = Objects.requireNonNull(managedInstanceName, "expected parameter 'managedInstanceName' to be non-null");
        this.rank = rank;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.schemaName = Objects.requireNonNull(schemaName, "expected parameter 'schemaName' to be non-null");
        this.sensitivityLabelSource = sensitivityLabelSource;
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private ManagedDatabaseSensitivityLabelArgs() {
        this.columnName = Codegen.empty();
        this.databaseName = Codegen.empty();
        this.informationType = Codegen.empty();
        this.informationTypeId = Codegen.empty();
        this.labelId = Codegen.empty();
        this.labelName = Codegen.empty();
        this.managedInstanceName = Codegen.empty();
        this.rank = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.schemaName = Codegen.empty();
        this.sensitivityLabelSource = Codegen.empty();
        this.tableName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedDatabaseSensitivityLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> columnName;
        private Output<String> databaseName;
        private @Nullable Output<String> informationType;
        private @Nullable Output<String> informationTypeId;
        private @Nullable Output<String> labelId;
        private @Nullable Output<String> labelName;
        private Output<String> managedInstanceName;
        private @Nullable Output<SensitivityLabelRank> rank;
        private Output<String> resourceGroupName;
        private Output<String> schemaName;
        private @Nullable Output<String> sensitivityLabelSource;
        private Output<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedDatabaseSensitivityLabelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnName = defaults.columnName;
    	      this.databaseName = defaults.databaseName;
    	      this.informationType = defaults.informationType;
    	      this.informationTypeId = defaults.informationTypeId;
    	      this.labelId = defaults.labelId;
    	      this.labelName = defaults.labelName;
    	      this.managedInstanceName = defaults.managedInstanceName;
    	      this.rank = defaults.rank;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.schemaName = defaults.schemaName;
    	      this.sensitivityLabelSource = defaults.sensitivityLabelSource;
    	      this.tableName = defaults.tableName;
        }

        public Builder columnName(Output<String> columnName) {
            this.columnName = Objects.requireNonNull(columnName);
            return this;
        }
        public Builder columnName(String columnName) {
            this.columnName = Output.of(Objects.requireNonNull(columnName));
            return this;
        }
        public Builder databaseName(Output<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Output.of(Objects.requireNonNull(databaseName));
            return this;
        }
        public Builder informationType(@Nullable Output<String> informationType) {
            this.informationType = informationType;
            return this;
        }
        public Builder informationType(@Nullable String informationType) {
            this.informationType = Codegen.ofNullable(informationType);
            return this;
        }
        public Builder informationTypeId(@Nullable Output<String> informationTypeId) {
            this.informationTypeId = informationTypeId;
            return this;
        }
        public Builder informationTypeId(@Nullable String informationTypeId) {
            this.informationTypeId = Codegen.ofNullable(informationTypeId);
            return this;
        }
        public Builder labelId(@Nullable Output<String> labelId) {
            this.labelId = labelId;
            return this;
        }
        public Builder labelId(@Nullable String labelId) {
            this.labelId = Codegen.ofNullable(labelId);
            return this;
        }
        public Builder labelName(@Nullable Output<String> labelName) {
            this.labelName = labelName;
            return this;
        }
        public Builder labelName(@Nullable String labelName) {
            this.labelName = Codegen.ofNullable(labelName);
            return this;
        }
        public Builder managedInstanceName(Output<String> managedInstanceName) {
            this.managedInstanceName = Objects.requireNonNull(managedInstanceName);
            return this;
        }
        public Builder managedInstanceName(String managedInstanceName) {
            this.managedInstanceName = Output.of(Objects.requireNonNull(managedInstanceName));
            return this;
        }
        public Builder rank(@Nullable Output<SensitivityLabelRank> rank) {
            this.rank = rank;
            return this;
        }
        public Builder rank(@Nullable SensitivityLabelRank rank) {
            this.rank = Codegen.ofNullable(rank);
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
        public Builder schemaName(Output<String> schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }
        public Builder schemaName(String schemaName) {
            this.schemaName = Output.of(Objects.requireNonNull(schemaName));
            return this;
        }
        public Builder sensitivityLabelSource(@Nullable Output<String> sensitivityLabelSource) {
            this.sensitivityLabelSource = sensitivityLabelSource;
            return this;
        }
        public Builder sensitivityLabelSource(@Nullable String sensitivityLabelSource) {
            this.sensitivityLabelSource = Codegen.ofNullable(sensitivityLabelSource);
            return this;
        }
        public Builder tableName(Output<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Output.of(Objects.requireNonNull(tableName));
            return this;
        }        public ManagedDatabaseSensitivityLabelArgs build() {
            return new ManagedDatabaseSensitivityLabelArgs(columnName, databaseName, informationType, informationTypeId, labelId, labelName, managedInstanceName, rank, resourceGroupName, schemaName, sensitivityLabelSource, tableName);
        }
    }
}
