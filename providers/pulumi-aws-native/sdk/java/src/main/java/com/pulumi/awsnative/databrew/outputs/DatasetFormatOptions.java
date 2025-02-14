// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.outputs;

import com.pulumi.awsnative.databrew.outputs.DatasetCsvOptions;
import com.pulumi.awsnative.databrew.outputs.DatasetExcelOptions;
import com.pulumi.awsnative.databrew.outputs.DatasetJsonOptions;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatasetFormatOptions {
    private final @Nullable DatasetCsvOptions csv;
    private final @Nullable DatasetExcelOptions excel;
    private final @Nullable DatasetJsonOptions json;

    @CustomType.Constructor
    private DatasetFormatOptions(
        @CustomType.Parameter("csv") @Nullable DatasetCsvOptions csv,
        @CustomType.Parameter("excel") @Nullable DatasetExcelOptions excel,
        @CustomType.Parameter("json") @Nullable DatasetJsonOptions json) {
        this.csv = csv;
        this.excel = excel;
        this.json = json;
    }

    public Optional<DatasetCsvOptions> csv() {
        return Optional.ofNullable(this.csv);
    }
    public Optional<DatasetExcelOptions> excel() {
        return Optional.ofNullable(this.excel);
    }
    public Optional<DatasetJsonOptions> json() {
        return Optional.ofNullable(this.json);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetFormatOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatasetCsvOptions csv;
        private @Nullable DatasetExcelOptions excel;
        private @Nullable DatasetJsonOptions json;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetFormatOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csv = defaults.csv;
    	      this.excel = defaults.excel;
    	      this.json = defaults.json;
        }

        public Builder csv(@Nullable DatasetCsvOptions csv) {
            this.csv = csv;
            return this;
        }
        public Builder excel(@Nullable DatasetExcelOptions excel) {
            this.excel = excel;
            return this;
        }
        public Builder json(@Nullable DatasetJsonOptions json) {
            this.json = json;
            return this;
        }        public DatasetFormatOptions build() {
            return new DatasetFormatOptions(csv, excel, json);
        }
    }
}
