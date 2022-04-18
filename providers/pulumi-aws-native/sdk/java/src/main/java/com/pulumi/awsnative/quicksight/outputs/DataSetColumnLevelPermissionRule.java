// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DataSetColumnLevelPermissionRule {
    private final @Nullable List<String> columnNames;
    private final @Nullable List<String> principals;

    @CustomType.Constructor
    private DataSetColumnLevelPermissionRule(
        @CustomType.Parameter("columnNames") @Nullable List<String> columnNames,
        @CustomType.Parameter("principals") @Nullable List<String> principals) {
        this.columnNames = columnNames;
        this.principals = principals;
    }

    public List<String> columnNames() {
        return this.columnNames == null ? List.of() : this.columnNames;
    }
    public List<String> principals() {
        return this.principals == null ? List.of() : this.principals;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetColumnLevelPermissionRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> columnNames;
        private @Nullable List<String> principals;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetColumnLevelPermissionRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnNames = defaults.columnNames;
    	      this.principals = defaults.principals;
        }

        public Builder columnNames(@Nullable List<String> columnNames) {
            this.columnNames = columnNames;
            return this;
        }
        public Builder columnNames(String... columnNames) {
            return columnNames(List.of(columnNames));
        }
        public Builder principals(@Nullable List<String> principals) {
            this.principals = principals;
            return this;
        }
        public Builder principals(String... principals) {
            return principals(List.of(principals));
        }        public DataSetColumnLevelPermissionRule build() {
            return new DataSetColumnLevelPermissionRule(columnNames, principals);
        }
    }
}
