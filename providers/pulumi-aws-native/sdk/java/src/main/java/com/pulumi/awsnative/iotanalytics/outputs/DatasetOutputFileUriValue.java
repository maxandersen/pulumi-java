// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DatasetOutputFileUriValue {
    private final String fileName;

    @CustomType.Constructor
    private DatasetOutputFileUriValue(@CustomType.Parameter("fileName") String fileName) {
        this.fileName = fileName;
    }

    public String fileName() {
        return this.fileName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetOutputFileUriValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fileName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetOutputFileUriValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileName = defaults.fileName;
        }

        public Builder fileName(String fileName) {
            this.fileName = Objects.requireNonNull(fileName);
            return this;
        }        public DatasetOutputFileUriValue build() {
            return new DatasetOutputFileUriValue(fileName);
        }
    }
}
