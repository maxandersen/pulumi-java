// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cassandra.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TableColumn extends com.pulumi.resources.InvokeArgs {

    public static final TableColumn Empty = new TableColumn();

    @Import(name="columnName", required=true)
      private final String columnName;

    public String columnName() {
        return this.columnName;
    }

    @Import(name="columnType", required=true)
      private final String columnType;

    public String columnType() {
        return this.columnType;
    }

    public TableColumn(
        String columnName,
        String columnType) {
        this.columnName = Objects.requireNonNull(columnName, "expected parameter 'columnName' to be non-null");
        this.columnType = Objects.requireNonNull(columnType, "expected parameter 'columnType' to be non-null");
    }

    private TableColumn() {
        this.columnName = null;
        this.columnType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableColumn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String columnName;
        private String columnType;

        public Builder() {
    	      // Empty
        }

        public Builder(TableColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnName = defaults.columnName;
    	      this.columnType = defaults.columnType;
        }

        public Builder columnName(String columnName) {
            this.columnName = Objects.requireNonNull(columnName);
            return this;
        }
        public Builder columnType(String columnType) {
            this.columnType = Objects.requireNonNull(columnType);
            return this;
        }        public TableColumn build() {
            return new TableColumn(columnName, columnType);
        }
    }
}
