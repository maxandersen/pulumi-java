// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.outputs;

import com.pulumi.awsnative.quicksight.enums.DataSetImportMode;
import com.pulumi.awsnative.quicksight.outputs.DataSetColumnGroup;
import com.pulumi.awsnative.quicksight.outputs.DataSetColumnLevelPermissionRule;
import com.pulumi.awsnative.quicksight.outputs.DataSetLogicalTableMap;
import com.pulumi.awsnative.quicksight.outputs.DataSetOutputColumn;
import com.pulumi.awsnative.quicksight.outputs.DataSetPhysicalTableMap;
import com.pulumi.awsnative.quicksight.outputs.DataSetResourcePermission;
import com.pulumi.awsnative.quicksight.outputs.DataSetRowLevelPermissionDataSet;
import com.pulumi.awsnative.quicksight.outputs.DataSetTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDataSetResult {
    /**
     * &lt;p&gt;The Amazon Resource Name (ARN) of the resource.&lt;/p&gt;
     * 
     */
    private final @Nullable String arn;
    /**
     * &lt;p&gt;Groupings of columns that work together in certain QuickSight features. Currently, only geospatial hierarchy is supported.&lt;/p&gt;
     * 
     */
    private final @Nullable List<DataSetColumnGroup> columnGroups;
    private final @Nullable List<DataSetColumnLevelPermissionRule> columnLevelPermissionRules;
    /**
     * &lt;p&gt;The amount of SPICE capacity used by this dataset. This is 0 if the dataset isn&#39;t
     *             imported into SPICE.&lt;/p&gt;
     * 
     */
    private final @Nullable Double consumedSpiceCapacityInBytes;
    /**
     * &lt;p&gt;The time that this dataset was created.&lt;/p&gt;
     * 
     */
    private final @Nullable String createdTime;
    private final @Nullable DataSetImportMode importMode;
    /**
     * &lt;p&gt;The last time that this dataset was updated.&lt;/p&gt;
     * 
     */
    private final @Nullable String lastUpdatedTime;
    private final @Nullable DataSetLogicalTableMap logicalTableMap;
    /**
     * &lt;p&gt;The display name for the dataset.&lt;/p&gt;
     * 
     */
    private final @Nullable String name;
    /**
     * &lt;p&gt;The list of columns after all transforms. These columns are available in templates,
     *             analyses, and dashboards.&lt;/p&gt;
     * 
     */
    private final @Nullable List<DataSetOutputColumn> outputColumns;
    /**
     * &lt;p&gt;A list of resource permissions on the dataset.&lt;/p&gt;
     * 
     */
    private final @Nullable List<DataSetResourcePermission> permissions;
    private final @Nullable DataSetPhysicalTableMap physicalTableMap;
    private final @Nullable DataSetRowLevelPermissionDataSet rowLevelPermissionDataSet;
    /**
     * &lt;p&gt;Contains a map of the key-value pairs for the resource tag or tags assigned to the dataset.&lt;/p&gt;
     * 
     */
    private final @Nullable List<DataSetTag> tags;

    @CustomType.Constructor
    private GetDataSetResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("columnGroups") @Nullable List<DataSetColumnGroup> columnGroups,
        @CustomType.Parameter("columnLevelPermissionRules") @Nullable List<DataSetColumnLevelPermissionRule> columnLevelPermissionRules,
        @CustomType.Parameter("consumedSpiceCapacityInBytes") @Nullable Double consumedSpiceCapacityInBytes,
        @CustomType.Parameter("createdTime") @Nullable String createdTime,
        @CustomType.Parameter("importMode") @Nullable DataSetImportMode importMode,
        @CustomType.Parameter("lastUpdatedTime") @Nullable String lastUpdatedTime,
        @CustomType.Parameter("logicalTableMap") @Nullable DataSetLogicalTableMap logicalTableMap,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("outputColumns") @Nullable List<DataSetOutputColumn> outputColumns,
        @CustomType.Parameter("permissions") @Nullable List<DataSetResourcePermission> permissions,
        @CustomType.Parameter("physicalTableMap") @Nullable DataSetPhysicalTableMap physicalTableMap,
        @CustomType.Parameter("rowLevelPermissionDataSet") @Nullable DataSetRowLevelPermissionDataSet rowLevelPermissionDataSet,
        @CustomType.Parameter("tags") @Nullable List<DataSetTag> tags) {
        this.arn = arn;
        this.columnGroups = columnGroups;
        this.columnLevelPermissionRules = columnLevelPermissionRules;
        this.consumedSpiceCapacityInBytes = consumedSpiceCapacityInBytes;
        this.createdTime = createdTime;
        this.importMode = importMode;
        this.lastUpdatedTime = lastUpdatedTime;
        this.logicalTableMap = logicalTableMap;
        this.name = name;
        this.outputColumns = outputColumns;
        this.permissions = permissions;
        this.physicalTableMap = physicalTableMap;
        this.rowLevelPermissionDataSet = rowLevelPermissionDataSet;
        this.tags = tags;
    }

    /**
     * &lt;p&gt;The Amazon Resource Name (ARN) of the resource.&lt;/p&gt;
     * 
    */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * &lt;p&gt;Groupings of columns that work together in certain QuickSight features. Currently, only geospatial hierarchy is supported.&lt;/p&gt;
     * 
    */
    public List<DataSetColumnGroup> columnGroups() {
        return this.columnGroups == null ? List.of() : this.columnGroups;
    }
    public List<DataSetColumnLevelPermissionRule> columnLevelPermissionRules() {
        return this.columnLevelPermissionRules == null ? List.of() : this.columnLevelPermissionRules;
    }
    /**
     * &lt;p&gt;The amount of SPICE capacity used by this dataset. This is 0 if the dataset isn&#39;t
     *             imported into SPICE.&lt;/p&gt;
     * 
    */
    public Optional<Double> consumedSpiceCapacityInBytes() {
        return Optional.ofNullable(this.consumedSpiceCapacityInBytes);
    }
    /**
     * &lt;p&gt;The time that this dataset was created.&lt;/p&gt;
     * 
    */
    public Optional<String> createdTime() {
        return Optional.ofNullable(this.createdTime);
    }
    public Optional<DataSetImportMode> importMode() {
        return Optional.ofNullable(this.importMode);
    }
    /**
     * &lt;p&gt;The last time that this dataset was updated.&lt;/p&gt;
     * 
    */
    public Optional<String> lastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    public Optional<DataSetLogicalTableMap> logicalTableMap() {
        return Optional.ofNullable(this.logicalTableMap);
    }
    /**
     * &lt;p&gt;The display name for the dataset.&lt;/p&gt;
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * &lt;p&gt;The list of columns after all transforms. These columns are available in templates,
     *             analyses, and dashboards.&lt;/p&gt;
     * 
    */
    public List<DataSetOutputColumn> outputColumns() {
        return this.outputColumns == null ? List.of() : this.outputColumns;
    }
    /**
     * &lt;p&gt;A list of resource permissions on the dataset.&lt;/p&gt;
     * 
    */
    public List<DataSetResourcePermission> permissions() {
        return this.permissions == null ? List.of() : this.permissions;
    }
    public Optional<DataSetPhysicalTableMap> physicalTableMap() {
        return Optional.ofNullable(this.physicalTableMap);
    }
    public Optional<DataSetRowLevelPermissionDataSet> rowLevelPermissionDataSet() {
        return Optional.ofNullable(this.rowLevelPermissionDataSet);
    }
    /**
     * &lt;p&gt;Contains a map of the key-value pairs for the resource tag or tags assigned to the dataset.&lt;/p&gt;
     * 
    */
    public List<DataSetTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable List<DataSetColumnGroup> columnGroups;
        private @Nullable List<DataSetColumnLevelPermissionRule> columnLevelPermissionRules;
        private @Nullable Double consumedSpiceCapacityInBytes;
        private @Nullable String createdTime;
        private @Nullable DataSetImportMode importMode;
        private @Nullable String lastUpdatedTime;
        private @Nullable DataSetLogicalTableMap logicalTableMap;
        private @Nullable String name;
        private @Nullable List<DataSetOutputColumn> outputColumns;
        private @Nullable List<DataSetResourcePermission> permissions;
        private @Nullable DataSetPhysicalTableMap physicalTableMap;
        private @Nullable DataSetRowLevelPermissionDataSet rowLevelPermissionDataSet;
        private @Nullable List<DataSetTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.columnGroups = defaults.columnGroups;
    	      this.columnLevelPermissionRules = defaults.columnLevelPermissionRules;
    	      this.consumedSpiceCapacityInBytes = defaults.consumedSpiceCapacityInBytes;
    	      this.createdTime = defaults.createdTime;
    	      this.importMode = defaults.importMode;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.logicalTableMap = defaults.logicalTableMap;
    	      this.name = defaults.name;
    	      this.outputColumns = defaults.outputColumns;
    	      this.permissions = defaults.permissions;
    	      this.physicalTableMap = defaults.physicalTableMap;
    	      this.rowLevelPermissionDataSet = defaults.rowLevelPermissionDataSet;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder columnGroups(@Nullable List<DataSetColumnGroup> columnGroups) {
            this.columnGroups = columnGroups;
            return this;
        }
        public Builder columnGroups(DataSetColumnGroup... columnGroups) {
            return columnGroups(List.of(columnGroups));
        }
        public Builder columnLevelPermissionRules(@Nullable List<DataSetColumnLevelPermissionRule> columnLevelPermissionRules) {
            this.columnLevelPermissionRules = columnLevelPermissionRules;
            return this;
        }
        public Builder columnLevelPermissionRules(DataSetColumnLevelPermissionRule... columnLevelPermissionRules) {
            return columnLevelPermissionRules(List.of(columnLevelPermissionRules));
        }
        public Builder consumedSpiceCapacityInBytes(@Nullable Double consumedSpiceCapacityInBytes) {
            this.consumedSpiceCapacityInBytes = consumedSpiceCapacityInBytes;
            return this;
        }
        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Builder importMode(@Nullable DataSetImportMode importMode) {
            this.importMode = importMode;
            return this;
        }
        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }
        public Builder logicalTableMap(@Nullable DataSetLogicalTableMap logicalTableMap) {
            this.logicalTableMap = logicalTableMap;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder outputColumns(@Nullable List<DataSetOutputColumn> outputColumns) {
            this.outputColumns = outputColumns;
            return this;
        }
        public Builder outputColumns(DataSetOutputColumn... outputColumns) {
            return outputColumns(List.of(outputColumns));
        }
        public Builder permissions(@Nullable List<DataSetResourcePermission> permissions) {
            this.permissions = permissions;
            return this;
        }
        public Builder permissions(DataSetResourcePermission... permissions) {
            return permissions(List.of(permissions));
        }
        public Builder physicalTableMap(@Nullable DataSetPhysicalTableMap physicalTableMap) {
            this.physicalTableMap = physicalTableMap;
            return this;
        }
        public Builder rowLevelPermissionDataSet(@Nullable DataSetRowLevelPermissionDataSet rowLevelPermissionDataSet) {
            this.rowLevelPermissionDataSet = rowLevelPermissionDataSet;
            return this;
        }
        public Builder tags(@Nullable List<DataSetTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(DataSetTag... tags) {
            return tags(List.of(tags));
        }        public GetDataSetResult build() {
            return new GetDataSetResult(arn, columnGroups, columnLevelPermissionRules, consumedSpiceCapacityInBytes, createdTime, importMode, lastUpdatedTime, logicalTableMap, name, outputColumns, permissions, physicalTableMap, rowLevelPermissionDataSet, tags);
        }
    }
}
