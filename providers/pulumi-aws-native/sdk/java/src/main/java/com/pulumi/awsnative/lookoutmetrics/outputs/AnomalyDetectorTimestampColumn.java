// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lookoutmetrics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AnomalyDetectorTimestampColumn {
    /**
     * A timestamp format for the timestamps in the dataset
     * 
     */
    private final @Nullable String columnFormat;
    private final @Nullable String columnName;

    @CustomType.Constructor
    private AnomalyDetectorTimestampColumn(
        @CustomType.Parameter("columnFormat") @Nullable String columnFormat,
        @CustomType.Parameter("columnName") @Nullable String columnName) {
        this.columnFormat = columnFormat;
        this.columnName = columnName;
    }

    /**
     * A timestamp format for the timestamps in the dataset
     * 
    */
    public Optional<String> columnFormat() {
        return Optional.ofNullable(this.columnFormat);
    }
    public Optional<String> columnName() {
        return Optional.ofNullable(this.columnName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorTimestampColumn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String columnFormat;
        private @Nullable String columnName;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorTimestampColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnFormat = defaults.columnFormat;
    	      this.columnName = defaults.columnName;
        }

        public Builder columnFormat(@Nullable String columnFormat) {
            this.columnFormat = columnFormat;
            return this;
        }
        public Builder columnName(@Nullable String columnName) {
            this.columnName = columnName;
            return this;
        }        public AnomalyDetectorTimestampColumn build() {
            return new AnomalyDetectorTimestampColumn(columnFormat, columnName);
        }
    }
}
